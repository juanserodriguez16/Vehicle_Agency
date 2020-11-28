package model;

import java.io.Serializable;
import java.util.ArrayList;

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
private ArrayList<Client> sellerClients;
final public int MAXCLIENTS = 5;

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
	sellerClients = new ArrayList<Client>();
}
/** 
* Add an item to a list<br> 
* <b>pre: </b>The required parameter cannot be null <br> 
* <b>post: </b>transform the parameter to a variable of this class and add to a list. 
* @param client the selection object of the client. client != null. 
*/
public void addClient(Client client) {
	if(sellerClients.size()!=MAXCLIENTS)
	sellerClients.add(client);
	else System.out.println("No se puede agregar mas clientes a este vendedor");
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
	for (int i = 0; i <sellerClients.size() ; i++) {
		clients += sellerClients.get(i).getName()+"\n";
		
}
	infoSeller += clients;
	return infoSeller;
}

/** 
* get the object that you selected<br> 
* <b>pre: </b>the variable to return must be entered <br> 
* <b>post: </b>get the object selected.
* @return clients.get(index). 
*/	
public Client getClient(int index) {
	return sellerClients.get(index - 1);	
}

/** 
* get the arraylist that you selected<br> 
* <b>pre: </b>the variable to return must be entered <br> 
* <b>post: </b>get the object selected.
* @return clients. 
*/	
public ArrayList<Client> getClients() {
	return sellerClients;	
}
 
}
