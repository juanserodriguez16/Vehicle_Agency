package model;

import java.util.*;

public class Enterprice {
private String name;
private int nit;
private float totalProfit;
private float salesNumber;
private final static int COLS = 5;
private final static int ROWS = 10;
private Car[][] parkingSpace;
private ArrayList<Vehicle> vehicles;
private ArrayList<Seller> sellers;

/** 
* will transform the parameters into a variables of this class and create type of object <br> 
* <b>pre: </b> the parameters cannot be null<br> 
* <b>post: </b>transform the parameter to a variable of this class and create a object. 
* @param name the selection variable of the name. name!= null. 
* @param nit the selection variable of the nit. nit!=null.
* @param totalProfit the selection variable of the total Profit. totalProfit !=null.
* @param salesNumber the selection variable of the sales Number. salesNumber != null. 
*/
public Enterprice (String name, int nit, float totalProfit, float salesNumber) {
	this.name = name;
	this.nit = nit;
	this.totalProfit = totalProfit;
	this.salesNumber = salesNumber;
	vehicles = new ArrayList<Vehicle>();
	sellers = new ArrayList<Seller>();
	parkingSpace = new Car [COLS][ROWS];
}
public Car[][] getParkingSpace() {
	return parkingSpace;
}
/** 
* Add an item to a list<br> 
* <b>pre: </b>The required parameter cannot be null <br> 
* <b>post: </b>transform the parameter to a variable of this class and add to a list. 
* @param seller the selection object of the seller. seller != null. 
*/
public void addSeller(Seller seller) {
	sellers.add(seller);
}
/** 
* get the object that you selected<br> 
* <b>pre: </b>the variable to return must be entered <br> 
* <b>post: </b>get the object selected.
* @return sellers.get(index). 
*/	
public Seller getSeller(int index) {
	return sellers.get(index - 1);	
}
/** 
* Add an item to a list<br> 
* <b>pre: </b>The required parameter cannot be null <br> 
* <b>post: </b>transform the parameter to a variable of this class and add to a list. 
* @param vehicle the selection object of the vehicle. vehicle != null. 
*/
public void addVehicle(Vehicle vehicle) {
	vehicles.add(vehicle);
}
/** 
* get the object that you selected<br> 
* <b>pre: </b>the variable to return must be entered <br> 
* <b>post: </b>get the object selected.
* @return vehicles.get(index). 
*/	
public Vehicle getVehicle(int index) {
	return vehicles.get(index - 1);	
}

/** 
* get the object that you selected<br> 
* <b>pre: </b>the variable to return must be entered <br> 
* <b>post: </b>get the object selected.
* @return clients.get(index). 
*/	
public Client getClient(int ixseller, int ixclient) {
	return sellers.get(ixseller).getClient(ixclient);	
}
/** 
* get the arraylist that you selected<br> 
* <b>pre: </b>the variable to return must be entered <br> 
* <b>post: </b>get the object selected.
* @return clients. 
*/	
public ArrayList<Client> getClients(int ixseller) {
	return sellers.get(ixseller).getClients();	
}
/** 
* get the arraylist that you selected<br> 
* <b>pre: </b>the variable to return must be entered <br> 
* <b>post: </b>get the object selected.
* @return clients. 
*/

public ArrayList<Vehicle> getVehicles() {
	return vehicles;	
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
	 * @return nit. 
	 */	
public int getNit() {
	return nit;
}
/** 
* will transform the parameter into a variable of this class <br> 
* <b>pre: </b>The required parameter cannot be null <br> 
* <b>post: </b>transform the parameter to a variable of this class. 
* @param nit the selection variable of the nit. nit != null. 
*/
public void setNit(int nit) {
	this.nit = nit;
}
 /** 
	 * get the element that you selected<br> 
	 * <b>pre: </b>the variable to return must be entered <br> 
	 * <b>post: </b>get the object selected.
	 * @return totalProfit. 
	 */	
public float getTotalProfit() {
	return totalProfit;
}
/** 
* will transform the parameter into a variable of this class <br> 
* <b>pre: </b>The required parameter cannot be null <br> 
* <b>post: </b>transform the parameter to a variable of this class. 
* @param totalProfit the selection variable of the total Profit. totalProfit != null. 
*/
public void setTotalProfit(float totalProfit) {
	this.totalProfit = totalProfit;
}
 /** 
	 * get the element that you selected<br> 
	 * <b>pre: </b>the variable to return must be entered <br> 
	 * <b>post: </b>get the object selected.
	 * @return salesNumber. 
	 */	
public float getSalesNumber() {
	return salesNumber;
}
/** 
* will transform the parameter into a variable of this class <br> 
* <b>pre: </b>The required parameter cannot be null <br> 
* <b>post: </b>transform the parameter to a variable of this class. 
* @param salesNumber the selection variable of the sales Number. salesNumber != null. 
*/
public void setSalesNumber(float salesNumber) {
	this.salesNumber = salesNumber;
}
/** 
* Accumulates the data in a chain of information <br> 
* <b>pre: </b>The required parameter cannot be null <br> 
* <b>post: </b>returns a string of accumulated information. 
* @return info. 
*/
public String infoVehicles() {
	  String info = "Nuestro catalogo de Autos es:\n";
		for (int i = 0; i < vehicles.size() ; i++) {
				if (!vehicles.get(i).getSoldStatus()) {
				info += "- "+(i+1) + ") " +  vehicles.get(i).basicInfo()+"\n";
				}			
		}
return info;


}
/** 
* Accumulates the data in a chain of information <br> 
* <b>pre: </b>The required parameter cannot be null <br> 
* <b>post: </b>returns a string of accumulated information. 
* @return info. 
*/
public String infoClients() {
	 ArrayList<Client> vClient;
	 vClient = new ArrayList<Client>();
	String info = "Los clientes ingresados son:\n";
	for (int i = 0; i < sellers.size() ; i++) {
		vClient = sellers.get(i).getClients();
		for (int j = 0; j < vClient.size() ; j++) {
		info += "- "+(j+1)  + ") " +  vClient.get(j).infoClient() +  "\nVendedor encargado: "
				+ sellers.get(i).getName()+"\n";
		}
	
	}
	return info;
}


/** 
* Accumulates the data in a chain of information <br> 
* <b>pre: </b>The required parameter cannot be null <br> 
* <b>post: </b>returns a string of accumulated information. 
* @return info.
* @param ixseller the selection object of the index. ixseller != null. 
*/
public String infoClients(int ixseller) {
	 ArrayList<Client> vClient;
	 vClient = new ArrayList<Client>();
	String info = "Los clientes ingresados son:\n";
		vClient = sellers.get(ixseller).getClients();
		for (int j = 0; j < vClient.size() ; j++) {
		info += "- "+(j+1)  + ") " +  vClient.get(j).infoClient() +  "\nVendedor encargado: "
				+ sellers.get(ixseller).getName()+"\n";
		}
	return info;
}

/** 
* Accumulates the data in a chain of information <br> 
* <b>pre: </b>The required parameter cannot be null <br> 
* <b>post: </b>returns a string of accumulated information. 
* @return info. 
*/
public String infoSellers() {
	String info = "Los asesores de la empresa son:\n";
	for (int i = 0; i < sellers.size() ; i++) {
		info += "===================\n "+(i+1) + ") " + sellers.get(i).infoSeller()+"\n";

}
return info;
}
/** 
* Accumulates the data in a chain of information <br> 
* <b>pre: </b>The required parameter cannot be null <br> 
* <b>post: </b>returns a string of accumulated information. 
* @return info. 
*/
public String ShowNameSellers() {
	String info = "Los asesores de la empresa son:\n";
	for (int i = 0; i < sellers.size() ; i++) {
		info += "- "+(i+1)  + ") " +  sellers.get(i).getName()+"\n";
	
}
return info;
}
/** 
* Accumulates the data in a chain of information <br> 
* <b>pre: </b>The required parameter cannot be null <br> 
* <b>post: </b>returns a string of accumulated information. 
* @return info. 
*/
public String getInfoParking() {
	String info = "\nVehiciulos que hay en el parqueadero\n";
	for(int i = 0; i < parkingSpace.length; i++) {
		for(int x = 0; x < parkingSpace[i].length; x++){
			if(parkingSpace[i][x] != null) {
				info += "\n\nVehiculo en la posicion:" + (i)  + "." + (x)  + "\n" + "===============================" + parkingSpace[i][x].basicInfo();
			}
		}
	}
	return info;
}

/** 
* Accumulates the data in a chain of information <br> 
* <b>pre: </b>The required parameter cannot be null <br> 
* <b>post: </b>returns a string of accumulated information. 
* @param a the selection object of the index. a != null.
* @return info. 
*/
public String getInfoTypeVehicle(int a) {
	String info = "La informacion de estos vehiculos es:\n";
	if (a == 1){
		for (int i = 0; i < vehicles.size() ; i++) {
			if (!vehicles.get(i).getSoldStatus() && vehicles.get(i) instanceof GasolineCar) {
			info += "======================\n"+(i+1)  + ") " +  vehicles.get(i).basicInfo()+"\n";
			}
	}
		
	}else 	if (a == 2){
		for (int i = 0; i < vehicles.size() ; i++) {
			if (!vehicles.get(i).getSoldStatus() && vehicles.get(i) instanceof ElectricCar) {
				info += "======================\n"+(i+1)  + ") " +  vehicles.get(i).basicInfo()+"\n";
			}		
	}
		
	}else 	if (a == 3){
		for (int i = 0; i < vehicles.size() ; i++) {
			if (!vehicles.get(i).getSoldStatus() && vehicles.get(i) instanceof HibritCar) {
				info += "======================\n"+(i+1)  + ") " +  vehicles.get(i).basicInfo()+"\n";
			}		
	}
		
	} else 	if (a == 4){
		for (int i = 0; i < vehicles.size() ; i++) {
			if (!vehicles.get(i).getSoldStatus() && vehicles.get(i) instanceof Motocycle) {
				info += "======================\n"+(i+1)  + ") " +  vehicles.get(i).basicInfo()+"\n";
			}		
	}
		
	}else if (a == 5) {
		info = "";
	}
	return info;
	
}
/** 
* Accumulates the data in a chain of information <br> 
* <b>pre: </b>The required parameter cannot be null <br> 
* <b>post: </b>returns a string of accumulated information. 
* @return info. 
* @param index the selection object of the index. index != null.
*/
public String infoIfUsed(int index) {
	String info = "La informacion de estos vehiculos es:\n";
	switch (index){
	case 1:for (int i = 0; i < vehicles.size() ; i++) {
		if (!vehicles.get(i).getSoldStatus() && !vehicles.get(i).getUsed()){
			info += "======================\n"+(i+1)  + ") " +  vehicles.get(i).basicInfo()+"\n";
			
		}	
		
}
		
		break;
	case 2:for (int i = 0; i < vehicles.size() ; i++) {
		if (!vehicles.get(i).getSoldStatus() && vehicles.get(i).getUsed()){
		info += "========================\n"+(i+1)  + ") " +  vehicles.get(i).basicInfo()+"\n";
		}			
}
		
		break;
	case 3:for (int i = 0; i < vehicles.size() ; i++) {
		if (!vehicles.get(i).getSoldStatus()){
			info += "======================\n"+(i+1)  + ") " +  vehicles.get(i).basicInfo()+"\n";
		}			
}
		
		break;
	case 4: info = "";
		break;
	}
	return info;	
	
}

}


