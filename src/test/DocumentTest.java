package test;

import org.junit.Test;

import junit.framework.TestCase;

import model.SOAT;

public class DocumentTest extends TestCase{
	private SOAT soat;
	@Test
	public void setUpEscenary1() {


	}
	public void test1() {
		setUpEscenary1();
		int price = 450000;
		int year = 2020;
		int coverage = 20000000;
		soat = new SOAT(price, year, coverage);
		assertEquals(450000, (int)soat.getPrice());	
	}
	
	public void test2() {
		setUpEscenary1();
		int price = 450000;
		int year = 2020;
		int coverage = 20000000;
		soat = new SOAT(price, year, coverage);
		boolean x = false;
		if (soat != null) {
			x = true;
		}
		assertTrue(x);
	}

}
