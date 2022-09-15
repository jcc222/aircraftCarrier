package assignment5;
//Assignment #: 5
//Name: Joshua Carrillo
//StudentID: 1217850543
//Lecture: MWF 10:10 AM - 11:00 AM
//Description:
public abstract class AircraftEntity {
	//intializing variables
	protected String entityName;
	protected int ammo;
	protected double range;
	protected int attackPower = 0;
	
	//constructor class
	public AircraftEntity(String entityName, int ammo, double range) {
		this.entityName = entityName;
		this.ammo = ammo;
		this.range = range;
	}
	
	//accessor method for attack power
	public int getAttackPower() {
		return this.attackPower;
	}
	
	//overridden method for toString to provide aircraft info
	@Override
	public String toString() {
		return "Aircraft name:\t" + this.entityName + "\nCurrent Ammo:\t" + this.ammo + "\nRange:\t" + this.range + "\nCurrent Attack Power\t" + this.attackPower + "\n";
	}
	
	public abstract void computeAttackPower();

}
