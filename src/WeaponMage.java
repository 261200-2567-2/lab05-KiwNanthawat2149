public class WeaponMage implements Weapon {
    private String name;
    private int Strengthweapon;
    private int Speedweapon;
    private int Manaweapon;

    public WeaponMage(String name, int Strengthweapon, int Speedweapon, int Manaweapon ) {
        this.name = name;
        this.Strengthweapon = Strengthweapon;
        this.Speedweapon = Speedweapon;
        this.Manaweapon = Manaweapon;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStrengthweapon() {
        return Strengthweapon;
    }

    @Override
    public int getSpeedweapon() {
        return Speedweapon;
    }

    @Override
    public int getManaweapon() {
        return Manaweapon;
    }


    @Override
    public String getWeapon() {
        return " Strength by " + Strengthweapon + ", Speed by " + Speedweapon + ", Mana by " + Manaweapon;
    }
}

