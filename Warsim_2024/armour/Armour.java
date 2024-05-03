package armour;

public abstract class Armour {
    private int armourAmount;
    private int dexterityCost;
    private String name; // New property for the armour's name

    public Armour() {
        // do nothing
    }

    //================>>
    // GETTERS
    public int getArmourAmount() {
        return this.armourAmount;
    }

    public int getDexterityCost() {
        return this.dexterityCost;
    }

    public String getName() {
        return this.name;
    }

    // takes the armour protection into account
    // reduces the overall damage based on armour type
    public abstract int getFinalDamage(int damage);

    //================>>
    // SETTERS
    public void setArmourAmount(int armourAmount) {
        this.armourAmount = armourAmount;
    }

    public void setDexterityCost(int dexterityCost) {
        this.dexterityCost = dexterityCost;
    }

    public void setName(String name) {
        this.name = name;
    }

} // class
