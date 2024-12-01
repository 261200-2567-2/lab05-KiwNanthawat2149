public interface Characters {
    String getName();
    int getHealth();
    int getfullSpeed();
    int getStrength();
    int getMana();
    void equipWeapon(Weapon weapon);
    void displayStats();
    void updateStats();
}
