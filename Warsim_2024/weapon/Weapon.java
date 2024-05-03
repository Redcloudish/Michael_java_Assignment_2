
package weapon;

import java.util.Random;

public abstract class Weapon {
    private int damageAmount;
    private int dexterityCost;
    private String name; // New property for the weapon's name
    private String description; // New property for the weapon's description
    protected Random randNum = new Random();

    public Weapon() {
        // do nothing for now
    }

    //==============>>
    // GETTERS
    public int getDamageAmount() {
        return this.damageAmount;
    }

    public int getDexterityCost() {
        return this.dexterityCost;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    //==============>>
    // SETTERS
    public void setDamageAmount(int damageAmount) {
        this.damageAmount = damageAmount;
    }

    public void setDexterityCost(int dexterityCost) {
        this.dexterityCost = dexterityCost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    public abstract int strike(int attackType, int dexterity, int strength);

} 