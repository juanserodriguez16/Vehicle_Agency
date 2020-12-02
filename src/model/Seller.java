package model;

import java.io.Serializable;
import java.util.ArrayList;

import exception.MaximunAssignedClientsException;

public class Seller implements Serializable{
/**
	 * 
	 */
private static final long serialVersionUID = 1L;
private String name;
private String lastName;
private int cedula;
private float salesQuantity;
private int clientsCuantity;
private Client sellerClients;
public final static int MAXC = 5;
public final static String CSVS = ";";

/** 
* will transform the parameters into a variables of this class and create type of object <br> 
* <b>pre: </b> the parameters cannot be null<br> 
* <b>post: </b>transform the parameter to a variable of this class and create a object. 
* @param name the selection variable of the name. name!= null. 
* @param lastName the selection variable of the lastName. lastName!=null.
* @param cedula the selection variable of the cedula. cedula!=null.
* @param salesQuantity the selection variable of the sales Quantity. salesQuantity != null. 
*/
public Seller ( String name, String lastName, int cedula, float salesQuantity) {
	this.name = name;
	this.lastName = lastName;
	this.cedula = cedula;
	this.salesQuantity = salesQuantity;
	sellerClients = null;
}
/** 
* Add an item to a list<br> 
* <b>pre: </b>The required parameter cannot be null <br> 
* <b>post: </b>transform the parameter to a variable of this class and add to a list. 
* @param client the selection object of the client. client != null. 
 * @throws MaximunAssignedClientsException 
*/
public void addClient(Client client) throws MaximunAssignedClientsException {
	if(clientsCuantity<=MAXC) {
	if (sellerClients == null)
		sellerClients = client;
	else 
		addClient(sellerClients, client);
	}else 
		throw new MaximunAssignedClientsException(MAXC);
}

public void addClient(Client root, Client client) {
		if(client.getCedula()<= root.getCedula() && root.getLeft() ==null) {
			root.setLeft(client);
			client.setParent(root);
			
		}else if (client.getCedula()>root.getCedula() && root.getRight()==null) {
			root.setRight(client);
			client.setParent(root);	
		}else {
			if(client.getCedula() <= root.getCedula() && root.getLeft() != null) {
				addClient(root.getLeft(),client);
			}else {
				addClient(root.getRight(),client);
			}
		}
	}

 /** 
	 * get the element that you selected<br> 
	 * <b>pre: </b>the variable to return must be entered <br> 
	 * <b>post: </b>get the object selected.
	 * @return name. 
	 */	
public String getName() {
	return name;
}
/** 
* will transform the parameter into a variable of this class <br> 
* <b>pre: </b>The required parameter cannot be null <br> 
* <b>post: </b>transform the parameter to a variable of this class. 
* @param name the selection variable of the name. name != null. 
*/
public void setName(String name) {
	this.name = name;
}
 /** 
	 * get the element that you selected<br> 
	 * <b>pre: </b>the variable to return must be entered <br> 
	 * <b>post: </b>get the object selected.
	 * @return lastName. 
	 */	
public String getLastName() {
	return lastName;
}
/** 
* will transform the parameter into a variable of this class <br> 
* <b>pre: </b>The required parameter cannot be null <br> 
* <b>post: </b>transform the parameter to a variable of this class. 
* @param lastName the selection variable of the last Name. lastName != null. 
*/
public void setLastName(String lastName) {
	this.lastName = lastName;
}
 /** 
	 * get the element that you selected<br> 
	 * <b>pre: </b>the variable to return must be entered <br> 
	 * <b>post: </b>get the object selected.
	 * @return cedula. 
	 */	
public int getCedula() {
	return cedula;
}
/** 
* will transform the parameter into a variable of this class <br> 
* <b>pre: </b>The required parameter cannot be null <br> 
* <b>post: </b>transform the parameter to a variable of this class. 
* @param cedula the selection variable of the cedula. cedula != null. 
*/
public void setCedula(int cedula) {
	this.cedula = cedula;
}
 /** 
	 * get the element that you selected<br> 
	 * <b>pre: </b>the variable to return must be entered <br> 
	 * <b>post: </b>get the object selected.
	 * @return clientsCuantity. 
	 */	
public int getClientsCuantity() {
	return clientsCuantity;
}
/** 
* will transform the parameter into a variable of this class <br> 
* <b>pre: </b>The required parameter cannot be null <br> 
* <b>post: </b>transform the parameter to a variable of this class. 
* @param clientsCuantity the selection variable of the clients Cuantity. clientsCuantity != null. 
*/
public void setClientsCuantity( int clientsCuantity) {
	this.clientsCuantity = clientsCuantity;
}
 /** 
	 * get the element that you selected<br> 
	 * <b>pre: </b>the variable to return must be entered <br> 
	 * <b>post: </b>get the object selected.
	 * @return salesQuantity. 
	 */	
public float getSalesQuantity() {
	return salesQuantity;
}
/** 
* will transform the parameter into a variable of this class <br> 
* <b>pre: </b>The required parameter cannot be null <br> 
* <b>post: </b>transform the parameter to a variable of this class. 
* @param salesQuantity the selection variable of the sales Quantity. salesQuantity != null. 
*/
public void setSalesQuantity(float salesQuantity) {
	this.salesQuantity = salesQuantity;
}
/** 
* Accumulates the data in a chain of information <br> 
* <b>pre: </b>The required parameter cannot be null <br> 
* <b>post: </b>returns a string of accumulated information. 
* @return infoSeller. 
*/
public String infoSeller() {
	String infoSeller = "Nombre: " +getName() +  "\nApellido: " + getLastName() + "\nCedula: "
			+ getCedula() +  "\nCantidad de ventas: " + getSalesQuantity();
	String  clients = "\nLos clientes que fueron asesorados:\n";
	infoSeller += clients;
	infoSeller += inOrden();
	return infoSeller;
}

/**
	 * returns the string generated by the in-order method led by the root <br>
	 * <b> pre: </b> root created and filled
	 * <b> post: </b> string with the information of the binary search tree
	 * @return String score.
	 */
	public String inOrden() {
		return inOrden(sellerClients);
	}
	/**
	 * generates a string with the data name and score of the players<br>
	 * <b> pre: </b> The scores must exist and the binary search tree cannot be empty.
	 * <b> post: </b> string with sorted data from binary search tree
	 * @param recur current score. recur != null.
	 * @return String score
	 */
	public String inOrden(Client recur) {
		String ClientList= "";
		if(recur != null) {
			ClientList += inOrden(recur.getLeft());
			ClientList += "____________________________\n" + recur.infoClient() + "\n";
			ClientList += inOrden(recur.getRight());
		}
		return ClientList;
	}

	public Client SearchClient(int Cedula) {
		Client objSearch = null;
		if (sellerClients != null)
			objSearch = SearchClient(sellerClients, Cedula);
		return objSearch;
	}

	private Client SearchClient(Client current, int Cedula) {
		Client objSearch = null;
		if (current.getCedula() == Cedula)
			objSearch = current;
		else if (Cedula < current.getCedula() && current.getLeft() != null)
			objSearch = SearchClient(current.getLeft(), Cedula);
		else if (Cedula > current.getCedula() && current.getRight() != null)
			objSearch = SearchClient(current.getRight(), Cedula);
		return objSearch;
	}
	
	
public String infoCSV() {
	String infocsv = getName() + CSVS + getLastName() + CSVS + getCedula() + CSVS + getSalesQuantity() + CSVS;
	return infocsv;
}

/** 
* get the object that you selected<br> 
* <b>pre: </b>the variable to return must be entered <br> 
* <b>post: </b>get the object selected.
* @return clients.get(index). 
*/	
public Client getClient(int cedula) {
	return SearchClient(cedula);	
}

/** 
* get the arraylist that you selected<br> 
* <b>pre: </b>the variable to return must be entered <br> 
* <b>post: </b>get the object selected.
* @return clients. 
*/	
public Client getClients() {
	return sellerClients;	
}
 
}
