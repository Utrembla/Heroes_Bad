package Heroes;

public class Druid extends Hero {

    public Druid(String name, Weapon weapon){
            this.name = name;
            this.weapon = weapon;
    }

    public void Move() {
        System.out.println("I must protect the wild!");
    }

    public void Hit() {
        System.out.println("Nature will rise against you!");
    }
}
