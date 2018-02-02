package virtualpetshelter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class VirtualPetTest {
	
	private static final String PET_NAME = "Bilbo";
	
	private static final String PET_DESCRIPTION = "is doing well!";
	
	private VirtualPet underTest;
	
	@Test
	public void shouldCreatePetConstructor() {
		underTest = new VirtualPet(PET_NAME, PET_DESCRIPTION, 0, 0, 0);
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldHaveDefaultHungerLevel() {
		underTest = new VirtualPet(PET_NAME, PET_DESCRIPTION, 0, 0, 0);
		int defaultHunger = underTest.getHunger();
		assertEquals(0, defaultHunger);
	}
	
	@Test
	public void shouldHaveVariedHungerLevel() {
		underTest = new VirtualPet(PET_NAME, PET_DESCRIPTION, 10, 0, 0);
		int hungerLevel = underTest.getHunger();
		assertEquals(10, hungerLevel);
	}
	
	@Test
	public void shouldHaveVariedHappinessLevel() {
		underTest = new VirtualPet(PET_NAME, PET_DESCRIPTION, 0, 10, 0);
		int happinessLevel = underTest.getHappiness();
		assertEquals(10, happinessLevel);
	}
	
	@Test
	public void shouldHaveVariedThirstLevel() {
		underTest = new VirtualPet(PET_NAME, PET_DESCRIPTION, 0, 0, 10);
		int thirstLevel = underTest.getThirst();
		assertEquals(10, thirstLevel);
	}
	
	@Test
	public void tickShouldIncreaseAllNeedLevels() {
		underTest = new VirtualPet(PET_NAME, PET_DESCRIPTION, 0, 0, 0);
		underTest.tick();
		int thirstLevel = underTest.getThirst();
		assertEquals(1, thirstLevel);
	}
	
	@Test
	public void shouldHavePetName() {
		underTest = new VirtualPet(PET_NAME, PET_DESCRIPTION, 0, 0, 0);
		String petName = underTest.petName();
		assertEquals(PET_NAME, petName);
	}
	
}
