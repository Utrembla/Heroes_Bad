import Heroes.Hero;

public class Program {
    public static void main(String[] args) {
        Hero gamer = CharacterCreator.Create("Peter","Thief");
        gamer.Hit();
        gamer.Move();
        gamer.weapon.Hit();
        System.out.println(gamer.weapon.weaponName);
    }
}
