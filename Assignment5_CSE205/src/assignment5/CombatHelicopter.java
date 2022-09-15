package assignment5;
//Assignment #: 5
//Name: Joshua Carrillo
//StudentID: 1217850543
//Lecture: MWF 10:10 AM - 11:00 AM
//Description:

public class CombatHelicopter extends AircraftEntity {
	//initializes variables
	private double minFlyingAltitude;
	private int stealthIndex;

	//constructor for combat helicopter
	public CombatHelicopter(String entityName, int ammo, double range, double minFlyingAltitude) {
		super(entityName, ammo, range);
		this.minFlyingAltitude = minFlyingAltitude;
		if (minFlyingAltitude<5) {
			this.stealthIndex = 10;
		}else {
			this.stealthIndex = 7;
		}}
	
	//overridden method for computeAttackpPower
	@Override
	public void computeAttackPower() {
		attackPower = (int) ((minFlyingAltitude + ammo + range) * (stealthIndex));
	}
	
	//overridden method for toString
	// need to format
	@Override
	public String toString() {
		return "Combat Helicopter:\n" + super.toString() + "Stealth Index:\t" + this.stealthIndex + "\n";
	}

}
