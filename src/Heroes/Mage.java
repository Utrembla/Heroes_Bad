package Heroes;

public class Mage extends Hero  {
    public Mage(String name, Weapon weapon){
        this.name = name;
        this.weapon = weapon;
    }

    public void Move() {
        System.out.println("I'm too old for this sh*t!");
    }

    public void Hit() {
        System.out.println("wzhuh!");
    }
}
