package virtualpetshelter;

public class VirtualPet {

	private String petDescription;
	private String petName;
	private int thirstLevel;
	private int hungerLevel;
	private int happinessLevel;

	public VirtualPet(String petName, String petDescription, int hungerLevel, int happinessLevel, int thirstLevel) {
		this.petDescription = petDescription;
		this.petName = petName;
		this.hungerLevel = hungerLevel;
		this.happinessLevel = happinessLevel;
		this.thirstLevel = thirstLevel;
	}

	public VirtualPet(String petName, String petDescription) {
		this.petName = petName;
		this.petDescription = petDescription;
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

	public String petName() {
		return petName;
	}

	public void tick() {
		thirstLevel += 1;
		hungerLevel += 1;
		happinessLevel += 1;
	}

	public String petDescription() {
		return petDescription;
	}

	public void feedPet() {
		hungerLevel -= 1;
	}
}
