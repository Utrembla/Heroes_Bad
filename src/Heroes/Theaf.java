package Heroes;

public class Theaf extends Hero  {
    public Theaf(String name, Weapon weapon){
        this.name = name;
        this.weapon = weapon;
    }

    public void Move() {
        System.out.println("I'm running!");
    }

    public void Hit() {
        System.out.println("Your gold shall be mine!");
    }
}
