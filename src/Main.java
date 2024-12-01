public class Main {
    public static void main(String[] args) {

        Characters warrior = new Warrior("Arthur", 200,0, 15,50);
        Characters mage = new Mage("merlin", 120, 300, 20,10);
        Characters assassin = new Assassin("Sekiro", 150 ,0,45, 30);


        Weapon strengthRing = new WeaponWarrior("Strength Ring", 55,0, 0);

        Weapon SpeedRing = new WeaponAssassin("Speed Ring", 0, 60,0);

        Weapon ManaNecklace = new WeaponMage("Mana Necklace", 0, 0,80);

        warrior.equipWeapon(strengthRing);

        assassin.equipWeapon(SpeedRing);

        mage.equipWeapon(ManaNecklace);



        System.out.println("\n--- Warrior Stats ---");
        warrior.displayStats();

        System.out.println("\n--- Assassin Stats ---");
        assassin.displayStats();

        System.out.println("\n--- Mage Stats ---");
        mage.displayStats();


    }
}
