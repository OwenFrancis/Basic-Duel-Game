package character;
import java.util.Random;

public class CharacterGeneration {
	//this class will be for generating characters. It will be used to create two character objects
	
	//Battle class will take two characters and print a log of the fight to a file
	
	//Battle class will be called from GUI. GUI will open file after
	
	private String charName;		//Name of character, provided by user
	private int health;		//Health, how much damage it can take before dying
	private int strength;		//Strength, how much damage their physical attacks do
	private int magic;			//Magic, how much damage their magical attacks do
	private int evasion;		//Evasion, how likely they are to dodge an attack 
	private int defence;		//Defence, how much they reduce damage by when they take a hit
	private int mana;		//Mana, limit to how mnay magic attacks can be used
	private int luck;		//Luck, how likely the character is to crit
	
	public CharacterGeneration(String name) {
		setCharName(name);
		setHealth((int)Math.random() * 70 + 30);
		setStrength((int)Math.random() * 15 + 3);
		setMagic(20 - getStrength());
		setEvasion((int)Math.random() * 60 + 5);
		setDefence(9 - (getEvasion()/10));
		if(getDefence()<0) {
			setDefence(0);
		}
		setMana(100);
		setLuck((int)Math.random() * 100 + 1);
	}

	public String getCharName() {
		return charName;
	}

	private void setCharName(String charName) {
		this.charName = charName;
	}

	public int getHealth() {
		return health;
	}

	private void setHealth(int health) {
		this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	private void setStrength(int strength) {
		this.strength = strength;
	}

	public int getMagic() {
		return magic;
	}

	private void setMagic(int magic) {
		this.magic = magic;
	}

	public int getEvasion() {
		return evasion;
	}

	private void setEvasion(int evasion) {
		this.evasion = evasion;
	}

	public int getDefence() {
		return defence;
	}

	private void setDefence(int defence) {
		this.defence = defence;
	}

	public int getMana() {
		return mana;
	}

	private void setMana(int mana) {
		this.mana = mana;
	}

	public int getLuck() {
		return luck;
	}

	private void setLuck(int luck) {
		this.luck = luck;
	}
}
