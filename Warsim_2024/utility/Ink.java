package utility;
import warrior.*;

/*
 * Class for all of our in games prints
 */
public class Ink {
  
  public Ink() {
    // do nothing
  } // constructor

  public void welcome() {
    System.out.printf("""
    __        __             _                 ____   ___ ____  _  _   
      \\ \\      / /_ _ _ __ ___(_)_ __ ___   |_ _ \\  / _ \\__\\| || |  
       \\ \\ /\\ / / _` | '__/ __| | '_ ` _ \\    __) | | | |__) | || |_ 
        \\ V  V / (_| | | \\  _ \\ | | | | | |  / __/| |_| / __/|__   _|
         \\_/\\_/ \\__,_|_|  |___/_|_| |_| |_| |_____|\\___/_____|  |_|    
        """);
  } // welcome()

  public void printWarriorMenu() {
    System.out.println("###################################################");
    System.out.println("Pick your Warrior: \nHuman(1)\nElf(2)\nOrc(3)\n");
  }

  public void printWeaponMenu() {
    System.out.println("###################################################");
    System.out.println("Pick your Weapon: \nDagger(1)\nSword(2)\nAxe(3)");
  }

  public void printArmourMenu() {
    System.out.println("###################################################");
    System.out.println("Pick your Armour: \nLeather(1)\nChainmail(2)\nPlatemail(3)");
  }

  public void printAttackMenu() {
    System.out.println("###################################################");
    System.out.println("Attack Type?: \nNormal(1)\nHeavy(2)");
  }
  public void printStats(Warrior player, Warrior enemy) {
    System.out.println("\n****************************************************");
    System.out.printf("* %-33s%-33s\n",
      "Player: " + player.getWarriorType(), "Enemy: " + enemy.getWarriorType());
    System.out.printf("* Health: %-25dHealth: %-25d\n", player.getHealth(), 
      enemy.getHealth());
    System.out.printf("* Strength: %-23dStrength: %-23d\n", 
      player.getStrength(), enemy.getDexterity());
    System.out.printf("* Dexterity: %-22dDexterity: %-22d\n", 
      player.getDexterity(), enemy.getDexterity());
    System.out.println("****************************************************\n");
  }

  public void printGameOver(String winner) {
    System.out.printf("""
       ____                         ___                 
      / ___| __ _ _ __ ___   ___   / _ \__   _____ _ __ 
     | |  _ / _` | '_ ` _ \ / _ \ | | | \ \ / / _ \ '__|
     | |_| | (_| | | | | | |  __/ | |_| |\ V /  __/ |   
      \____|\__,_|_| |_| |_|\___|  \___/  \_/ \___|_|n %s   
        """, winner + " wins!");
  } // printGameOver()

} // class
