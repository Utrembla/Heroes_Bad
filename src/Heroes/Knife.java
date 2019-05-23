package Heroes;

import Heroes.Weapon;

public class Knife extends Weapon {
    public Knife(String weaponName, int damage){
        this.weaponName = weaponName;
        this.damage = damage;
    }

    public void Hit() {
        System.out.println("aue");
    }
}
