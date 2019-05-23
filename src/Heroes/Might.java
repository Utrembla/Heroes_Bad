package Heroes;

import Heroes.Weapon;

public class Might extends Weapon {
    public Might(String weaponName, int damage){
        this.weaponName = weaponName;
        this.damage = damage;
    }
    public void Hit() {
        System.out.println("I won this time!");
    }
}
