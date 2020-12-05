package test;

import org.junit.Test;

import junit.framework.TestCase;
import model.ElectricCar;
import model.Upholstery;

public class AdditionalServicesTest extends TestCase{
	private Upholstery uph;


	@Test
	public void setUpEscenary1() {
		int id = 2020;
		int price = 2000;
		String colour = "Negro";
		String type = "Cuero";

		uph = new Upholstery(id, price, type, colour);

	}
	public void test1() {
		setUpEscenary1();

		assertEquals("Cuero", uph.getType());	
	}
	
	public void test2() {
		setUpEscenary1();
		boolean x = false;
		if (uph != null) {
			x = true;
		}
		assertTrue(x);
	}
	
}
