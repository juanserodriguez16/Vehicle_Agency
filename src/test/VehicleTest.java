package test;

import org.junit.Test;

import junit.framework.TestCase;
import model.ElectricCar;
import model.Seller;

public class VehicleTest extends TestCase{
	private ElectricCar elec;
	@Test
	public void setUpEscenary1() {
		float BasePrice = 65000000;
		String mark = "Audi";
		int model = 2020;
		int cilindraje = 2000;
		int mileaje = 0;
		String placa = "CPY-256";
		String type = "SEDAN";
		String ChargerType = "RAPIDO";
		int batteryLife = 50;
		elec = new ElectricCar(0, BasePrice, mark, model, cilindraje, mileaje, false, placa, type, 4,
				true, ChargerType, batteryLife);

	}
	public void test1() {
		setUpEscenary1();

		assertEquals("CPY-256", elec.getPlaca());	
	}
	
	public void test2() {
		setUpEscenary1();
		boolean x = false;
		if (elec != null) {
			x = true;
		}
		assertTrue(x);
	}
}
