package virtualpetshelter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class VirtualPetTest {
	
	private static final String PET_NAME = "Bilbo";
	
	private VirtualPet underTest;
	
	@Test
	public void shouldCreatePetConstructor() {
		underTest = new VirtualPet(PET_NAME, 0, 0, 0);
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldHaveDefaultHungerLevel() {
		underTest = new VirtualPet(PET_NAME, 0, 0, 0);
		int defaultHunger = underTest.getHunger();
		assertEquals(0, defaultHunger);
	}
	
	@Test
	public void shouldHaveVariedHungerLevel() {
		underTest = new VirtualPet(PET_NAME, 10, 0, 0);
		int hungerLevel = underTest.getHunger();
		assertEquals(10, hungerLevel);
	}
	
	@Test
	public void shouldHaveVariedHappinessLevel() {
		underTest = new VirtualPet(PET_NAME, 0, 10, 0);
		int happinessLevel = underTest.getHappiness();
		assertEquals(10, happinessLevel);
	}
	
}
