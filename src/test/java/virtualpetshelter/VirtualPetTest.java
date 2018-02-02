package virtualpetshelter;

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
		assertNotNull(underTest);
	}
	
	
}
