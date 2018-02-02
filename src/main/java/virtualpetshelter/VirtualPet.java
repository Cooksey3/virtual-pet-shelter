package virtualpetshelter;

public class VirtualPet {

	private int thirstLevel;
	private int hungerLevel;
	private int happinessLevel;

	public VirtualPet(String petName, String petDescription, int hungerLevel, int happinessLevel, int thirstLevel) {
		this.hungerLevel = hungerLevel;
		this.happinessLevel = happinessLevel;
		this.thirstLevel = thirstLevel;
	}

	public int getHunger() {
		return hungerLevel;
	}

	public int getHappiness() {
		return happinessLevel;
	}

	public int getThirst() {
		return thirstLevel;
	}

	public void tick() {
		thirstLevel += 1;
		hungerLevel += 1;
		happinessLevel += 1;
	}

}
