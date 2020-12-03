package test;

import org.junit.Test;

import exception.MaximunAssignedClientsException;
import junit.framework.TestCase;
import model.Client;
import model.Seller;

public class SellerTest extends TestCase{
	 private Seller seller;
	 private Client client;
	@Test
	public void setUpEscenary1() {

	}
	@Test
	public void setUpEscenary2() {
		String name = "Juan";
		String lastName = "Rodriguez";
		int cedula = 1005965741;
		String phone = "317502910";
		String email = "juseros9@gmail.com";
		client = new Client(name, lastName, cedula, phone, email);
		String name1 = "Laura";
		String lastName1 = "Uribe";
		int cedula1 = 1005956710;
		seller = new Seller(name1, lastName1, cedula1, 0);
	}
	
	public void test1() {
		setUpEscenary1();
		String name = "Laura";
		String lastName = "Uribe";
		int cedula = 1005956710;
		seller = new Seller(name, lastName, cedula, 0);
		assertEquals(1005956710, seller.getCedula());	
	}
	
	public void test2() {
		setUpEscenary1();
		String name = "Laura";
		String lastName = "Uribe";
		int cedula = 1005956710;
		seller = new Seller(name, lastName, cedula, 0);
		boolean x = false;
		if (seller != null) {
			x = true;
		}
		assertTrue(x);
	}
	public void test3() throws MaximunAssignedClientsException {
		setUpEscenary2();
		seller.addClient(client);
		boolean x = false;
		if (seller.getClients() != null) {
			x = true;
		}
		assertTrue(x);
	}
	public void test4() throws MaximunAssignedClientsException {
		setUpEscenary2();
		seller.addClient(client);
		Client cl = seller.SearchClient(1005965741);
		assertEquals("Rodriguez", cl.getLastName());	
	}



	
	
}
