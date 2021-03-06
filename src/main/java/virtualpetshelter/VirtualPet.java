package virtualpetshelter;

public class VirtualPet {

	private String petDescription;
	private String petName;
	private int thirstLevel;
	private int hungerLevel;
	private int boredomLevel;

	public VirtualPet(String petName, String petDescription, int hungerLevel, int boredomLevel, int thirstLevel) {
		this.petDescription = petDescription;
		this.petName = petName;
		this.hungerLevel = hungerLevel;
		this.boredomLevel = boredomLevel;
		this.thirstLevel = thirstLevel;
	}

	public VirtualPet(String petName, String petDescription) {
		this.petName = petName;
		this.petDescription = petDescription;
	}

	public int getHunger() {
		return hungerLevel;
	}

	public int getBoredom() {
		return boredomLevel;
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
		boredomLevel += 1;
	}

	public String petDescription() {
		return petDescription;
	}

	public void feedPet() {
		hungerLevel -= 1;
	}

	public void waterPet() {
		thirstLevel -= 1;
	}

	public void playWithPet() {
		boredomLevel -= 1;
	}
}
