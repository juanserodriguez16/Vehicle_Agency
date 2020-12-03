package test;
import org.junit.Test;

import junit.framework.TestCase;
import model.Client;

public class ClientTest extends TestCase{
	private Client client;
	
	@Test
	public void setUpEscenary1() {
		
	}
	public void test1() {
		setUpEscenary1();
		String name = "Juan";
		String lastName = "Rodriguez";
		int cedula = 1005965741;
		String phone = "317502910";
		String email = "juseros9@gmail.com";
		client = new Client(name, lastName, cedula, phone, email);
		assertEquals("Rodriguez", client.getLastName());	
	}
	
	public void test2() {
		setUpEscenary1();
		setUpEscenary1();
		String name = "Juan";
		String lastName = "Rodriguez";
		int cedula = 1005965741;
		String phone = "317502910";
		String email = "juseros9@gmail.com";
		client = new Client(name, lastName, cedula, phone, email);
		boolean x = false;
		if (client != null) {
			x = true;
		}
		assertTrue(x);
	}



	
	
}
