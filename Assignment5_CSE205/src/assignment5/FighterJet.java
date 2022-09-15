package assignment5;
//Assignment #: 5
//Name: Joshua Carrillo
//StudentID: 1217850543
//Lecture: MWF 10:10 AM - 11:00 AM
//Description:

public class FighterJet extends AircraftEntity {
	//initializes variables
	private double maxSpeed;
	
	//constructor for fighter jet
	public FighterJet(String entityName, int ammo, double range, double maxSpeed) {
		super(entityName, ammo, range);
		this.maxSpeed = maxSpeed;
	}
	
	//overridden method for computeAttackPower
	@Override
	public void computeAttackPower() {
		attackPower =  (int) ((ammo + range)* maxSpeed/10);
		
	}
	
	//overridden method for toString
	//need to format max speed output
	@Override
	public String toString() {
		return "Fighter Jet:\n" + super.toString() + "Maximum Speed:\t" + this.maxSpeed + "\n";
	}


}
