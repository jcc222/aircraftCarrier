package assignment5;
//Assignment #: 5
//Name: Joshua Carrillo
//StudentID: 1217850543
//Lecture: MWF 10:10 AM - 11:00 AM
//Description:

public class Bomber extends AircraftEntity{
	//initializes variables
	private int bombCarryingCapacity;
	private double maxFlyingAltitude;
	private boolean isJet;

	//constructor for bomber
	public Bomber(String entityName, int ammo, double range, int bombCarryingCapacity, double maxFlyingAltitude, boolean isJet) {
		super(entityName, ammo, range);
		this.bombCarryingCapacity = bombCarryingCapacity;
		this.maxFlyingAltitude = maxFlyingAltitude;
		this.isJet = isJet;
	}
	
	//overridden method for computeAttackPower
	@Override
	public void computeAttackPower() {
		if (maxFlyingAltitude >= 40.0) {
			attackPower = (int) ((maxFlyingAltitude + ammo)*(bombCarryingCapacity/100));
		}else {
			attackPower = (int) ((ammo+range)*(bombCarryingCapacity/100));
		}}
	
	//overridden method for toString
	//need to format bombCarryingCap output
	@Override
	public String toString() {
		if (isJet == true) {
			return "Bomber:\tJet Type\n" + super.toString() + "Bomb Carrying Capacity:\t" + this.bombCarryingCapacity + "\n";
		}else {
			return "Bomber:\tPropeller Type\n" + super.toString() + "Bomb Carrying Capacity:\t" + this.bombCarryingCapacity + "\n";
		}
	}
	

}
