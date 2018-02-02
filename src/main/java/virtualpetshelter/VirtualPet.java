package virtualpetshelter;

public class VirtualPet {

	private int hungerLevel;
	private int happinessLevel;
	
	public VirtualPet(String petName, int hungerLevel, int happinessLevel, int thirstLevel) {
		this.hungerLevel = hungerLevel;
		this.happinessLevel = happinessLevel;
	}

	public int getHunger() {
		return hungerLevel;
	}

	public int getHappiness() {
		return happinessLevel;
	}

}
