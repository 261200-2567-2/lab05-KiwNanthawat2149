import java.util.ArrayList;
import java.util.List;

public class Warrior implements Characters {
    private String name;
    private int Mana;
    private int health;
    private int Strength;
    private int fullSpeed;

    private int currentHealth;
    private int currentMana;
    private int currentStrength;
    private int currentSpeed;

    private List<Weapon> weapons;

    public Warrior(String name, int health, int Mana, int fullSpeed, int strength) {
        this.name = name;
        this.health = health;
        this.Mana = Mana;
        this.Strength = strength;
        this.fullSpeed = fullSpeed;

        this.currentHealth = health;
        this.currentMana = Mana;
        this.currentStrength = strength;
        this.currentSpeed = fullSpeed;

        this.weapons = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMana() {
        return currentMana;
    }

    @Override
    public int getHealth() {
        return currentHealth;
    }

    @Override
    public int getfullSpeed(){
        return currentSpeed;
    }

    @Override
    public int getStrength(){
        return currentStrength;
    }

    @Override
    public void equipWeapon(Weapon weapon) {
        weapons.add(weapon);
        System.out.println(name + " equipped " + weapon.getName());
        updateStats();
    }

    @Override
    public void updateStats() {
        currentStrength = Strength;
        currentSpeed = fullSpeed;
        currentMana = Mana;

        for (Weapon weapon : weapons) {
            currentStrength += weapon.getStrengthweapon();
            currentSpeed += weapon.getSpeedweapon();
            currentMana += weapon.getManaweapon();
        }

    }

    @Override
    public void displayStats() {
        System.out.println("Warrior Name: " + name);
        System.out.println("Warrior Current Health: " + currentHealth);
        System.out.println("Warrior Current Mana: " + currentMana);
        System.out.println("Warrior Current Strength: " + currentStrength);
        System.out.println("Warrior Current Speed: " + currentSpeed);
        System.out.println("Accessories Equipped:");
        for (Weapon weapon : weapons) {
            System.out.println("  - " + weapon.getName() + ": " + weapon.getWeapon());
        }
    }
}
