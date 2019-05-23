package Heroes;

import Heroes.Weapon;

public class Staff extends Weapon {
    public Staff(String weaponName, int damage){
        this.weaponName = weaponName;
        this.damage = damage;
    }

    public void Hit() {
        System.out.println("whzhuh-whzhuh!");
    }
}
