package Heroes;

public class Warrior extends Hero {

    public Warrior(String name, Weapon weapon){
            this.name = name;
            this.weapon = weapon;
    }

    public void Move() {
        System.out.println("I'm trying to run!");
    }

    public void Hit() {
        System.out.println("Lok Tar o'Gar");
    }
}
