package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Enterprice {
	private String name;
	private int nit;
	private float totalProfit;
	private float salesNumber;
	private AdditionalServices first;
	private AdditionalServices last;
	private final static int COLS = 5;
	private final static int ROWS = 10;
	private final static String CSVS = ";";
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
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public Enterprice (String name, int nit, float totalProfit, float salesNumber) throws ClassNotFoundException, IOException {
		this.name = name;
		this.nit = nit;
		this.totalProfit = totalProfit;
		this.salesNumber = salesNumber;
		vehicles = new ArrayList<Vehicle>();
		sellers = new ArrayList<Seller>();
		parkingSpace = new Car [COLS][ROWS];
	
		first= null;
		last = first;
		load();
	}
	public Car[][] getParkingSpace() {
		return parkingSpace;
	}
	/** 
	 * Add an item to a list<br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class and add to a list. 
	 * @param seller the selection object of the seller. seller != null. 
	 * @throws IOException 
	 */
	public void addSeller(Seller seller) throws IOException {
		sellers.add(seller);
		saveSellers();
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
	 * @throws IOException 
	 */
	public void addVehicle(Vehicle vehicle) throws IOException {
		vehicles.add(vehicle);
		saveVehicles();
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
	public ArrayList<Seller> getSellers(){ 
		return sellers;
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
				info += "========================================\n" + "- "+(i+1) + ") " +  vehicles.get(i).basicInfo()+"\n";
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
	public void saveVehicles() throws IOException {
		FileOutputStream fos = new FileOutputStream("data/Saved_Vehicles.va");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(vehicles);
		out.close();
	}


	public void saveSellers() throws IOException {
		FileOutputStream fos = new FileOutputStream("data/Saved_Sellers.va");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(sellers);
		out.close();
	}
	@SuppressWarnings("unchecked")
	public void load() throws ClassNotFoundException, IOException {
		File vload = new File("data/Saved_Vehicles.va");
		if (vload.exists()) {
			FileInputStream fis = new FileInputStream(vload);
			ObjectInputStream input = new ObjectInputStream(fis);
			vehicles = (ArrayList<Vehicle>) input.readObject();
			input.close();
		}
		File sload = new File("data/Saved_Sellers.va");
		if (sload.exists()) {
			FileInputStream fis = new FileInputStream(sload);
			ObjectInputStream input = new ObjectInputStream(fis);
			sellers =  (ArrayList<Seller>) input.readObject();
			input.close();
		}
	}
	public String bubbleSortSellers() {
		String info = "";
		if (this.getSellers() != null) {
			int x = this.getSellers().size();
			Seller[] matrix = new Seller[x];
			for (int i = 0; i < x; i++) {
				matrix[i] = this.getSellers().get(i);
			}
			Seller temp;
			for (int i = 1; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length - 1; j++) {
					if (matrix[j].getLastName().compareToIgnoreCase(matrix[j + 1].getLastName()) == 0 ) {
						//https://es.stackoverflow.com/questions/241249/como-hacer-el-metodo-de-burbuja-para-ordenar-strings
						if(matrix[j].getCedula() > matrix[j].getCedula()) {
							temp = matrix[j];
							matrix[j] = matrix[j + 1];
							matrix[j + 1] = temp;
						}
					}else if (matrix[j].getLastName().compareToIgnoreCase(matrix[j + 1].getLastName()) > 0 )	{
						temp = matrix[j];
						matrix[j] = matrix[j + 1];
						matrix[j + 1] = temp;
					}

				}
			}
			for (int i = 0; i < x; i++) {
				info +=  (i+1) +") " +matrix[i].infoSeller() + "========================\n";


			}
		}
		return info;
	}
	public String insercionSortVehicles() {
		String info = "";
		int con = 1;
		int x = vehicles.size();
		Vehicle[] vector = new Vehicle[x];
		for (int i = 0; i < vector.length; i++) {
			vector[i] = vehicles.get(i);
		}
		for (int i = 1; i < vector.length; i++) {
			Vehicle aux = vector[i];
			int j;
			for (j = i - 1; j >= 0 && vector[j].getModel() < aux.getModel(); j--) {
				vector[j + 1] = vector[j];
			}
			vector[j + 1] = aux;
		}

		for(Vehicle e : vector ) {
			info +=   (con) +") " + e.basicInfo() + "\n==========================================================\n";
			con++;
		}
		return info;
	}
	public String searchSeller(int cedula) {
		Collections.sort(sellers, new SellerIdSort());
		long startTime = System.currentTimeMillis();
		Seller sel = null;
		String str = "";
		boolean found = false;
		int start = 0;
		int end = sellers.size();
		while (start <= end && !found) {
			int medium = (int) Math.floor((start + end) / 2);
			if (medium != sellers.size()) {
				int mediumElement = sellers.get(medium).getCedula();
				int compareResult = cedula - mediumElement ;
				if (compareResult == 0) {
					found = true;
					sel = sellers.get(medium);
					str += sel.infoSeller() + "\n";
				} else if (compareResult < 0)
					end = medium - 1;
				else if (compareResult > 0)
					start = medium + 1;
			}
		}
		if (found == false) {
			str = "No hay ningun asesor de venta con la cedula: " + cedula + "\n";
		}
		long endTime = System.currentTimeMillis();
		str += "Duracion de la busqueda: " + (endTime - startTime)+ " ms";
		return str;
	}
	public String searchVehicle(String placa) {
		Collections.sort(vehicles, new VehiclePlateSort());
		long startTime = System.currentTimeMillis();
		Vehicle veh = null;
		String str = "";
		boolean found = false;
		int start = 0;
		int end = vehicles.size();
		while (start <= end && !found) {
			int medium = (int) Math.floor((start + end) / 2);
			if (medium != vehicles.size()) {
				String mediumElement = vehicles.get(medium).getPlaca();
				int compareResult = placa.compareToIgnoreCase(mediumElement);
				if (compareResult == 0) {
					found = true;
					veh = vehicles.get(medium);
					str +=veh.basicInfo() + "\n\n";
				} else if (compareResult < 0)
					end = medium - 1;
				else if (compareResult > 0)
					start = medium + 1;
			}
		}
		if (found == false) {
			str = "No se encontró ningun vehiculo con placa " + placa +"\n";
		}
		long endTime = System.currentTimeMillis();
		str += "\nDuracion de la busqueda: " + (endTime - startTime) + " ms";
		return str;
	}
	public String deleteVehicle(String placa) {
		Collections.sort(vehicles, new VehiclePlateSort());
		Vehicle veh = null;
		String str = "";
		boolean found = false;
		int start = 0;
		int end = vehicles.size();
		while (start <= end && !found) {
			int medium = (int) Math.floor((start + end) / 2);
			if (medium != vehicles.size()) {
				String mediumElement = vehicles.get(medium).getPlaca();
				int compareResult = placa.compareToIgnoreCase(mediumElement);
				if (compareResult == 0) {
					found = true;
					veh = vehicles.get(medium);
					str += "Se eliminó el siguiente vehiculo";
					str +=veh.basicInfo() + "\n\n";
					vehicles.remove(veh);
				} else if (compareResult < 0)
					end = medium - 1;
				else if (compareResult > 0)
					start = medium + 1;
			}
		}
		if (found == false) {
			str = "No se encontró ningun vehiculo con placa " + placa +"\n";
		}

		return str;
	
	}
	public String deleteSeller(int cedula) {
		Collections.sort(sellers, new SellerIdSort());
		
		Seller sel = null;
		String str = "";
		boolean found = false;
		int start = 0;
		int end = sellers.size();
		while (start <= end && !found) {
			int medium = (int) Math.floor((start + end) / 2);
			if (medium != sellers.size()) {
				int mediumElement = sellers.get(medium).getCedula();
				int compareResult = cedula - mediumElement ;
				if (compareResult == 0) {
					found = true;
					sel = sellers.get(medium);
					str += "Se eliminó el siguiente vendedor";
					str += sel.infoSeller() + "\n";
					sellers.remove(sel);
				} else if (compareResult < 0)
					end = medium - 1;
				else if (compareResult > 0)
					start = medium + 1;
			}
		}
		if (found == false) {
			str = "No hay ningun asesor de venta con la cedula: " + cedula + "\n";
		}
		
		return str;
	}
	public AdditionalServices getFirst() {
		return first;
	}
	public void setFirst(AdditionalServices first) {
		this.first = first;
	}
	public AdditionalServices getLast() {
		return last;
	}
	public void setLast(AdditionalServices last) {
		this.last = last;
	}
	
	public void addAdditionalServices(AdditionalServices newService) {
		if(first==null) {
			first = newService;
			last = first;
		}else {
			AdditionalServices current = last;
			newService.setPrev(last);
			current.setNext(newService);
			last = newService;			
		}
	}
	public String infoServices() {
		String info = "";
		while(last.getNext()==null) {
			
		}
		return info;
	}
	 public void toExportVehiclesCSV(int opt, String nameFile) throws IOException {
	    	File output = new File("data/"+nameFile+".csv");
	    	FileWriter fw = new FileWriter(output);
	    	BufferedWriter bw = new BufferedWriter(fw);
	    	String message  = "";	
	    	switch(opt) {
	    	case 1:				
	    		message = "Carro  " + CSVS + "Marca" + CSVS + "Modelo" + CSVS + "Cilindraje" + CSVS + "Kilometraje" + CSVS + "Placa" + CSVS
	    		+ "Usado" + CSVS + "Precio base" + CSVS + "Tipo de carro" + CSVS + 
	    		"Polarizado" + CSVS + "Numero de puertas" + CSVS + "Tipo de gasolina "
	    		+ CSVS + "Capacidad del tanque" + CSVS + "Consumo De Gasolina por kilometro\n";    
	    		int x = 1;
	    		for (int i = 0; i < vehicles.size(); i++) {
	    			if (vehicles.get(i) != null) {
	    				if (!vehicles.get(i).getSoldStatus() && vehicles.get(i) instanceof GasolineCar) {
	    					GasolineCar g = (GasolineCar) vehicles.get(i);
	    					message += "" +x+";"+ g.infoCSV()+ g.getType() + CSVS + g.getPolarizado() +CSVS + g.getNumberOfDoors() + CSVS + g.getGasolineType() + CSVS +
	    							g.getGasolineCapacity() + CSVS + g.getGasolineConsume() + "\n";
	    					x++;
	    				}
	     					
	    			}
	    		}message += "\nNo hay más carros a gasolina \n\n";
	    		break;
	    	case 2:
	    		message = "Carro  " + CSVS + "Marca" + CSVS + "Modelo" + CSVS + "Cilindraje" + CSVS + "Kilometraje" + CSVS + "Placa" + CSVS
	    	    		+ "Usado" + CSVS + "Precio base" + CSVS + "Tipo de carro" + CSVS + 
	    	    		"Polarizado" + CSVS + "Numero de puertas" + CSVS + "Tipo de carga "
	    	    		+ CSVS + "Capacidad de la bateria" + CSVS + "Consumo De bateria por kilometro\n"; 
	    		int y = 1;
	    		for (int i = 0; i < vehicles.size(); i++) {
	    			if (vehicles.get(i) != null) {
	    				if (!vehicles.get(i).getSoldStatus() && vehicles.get(i) instanceof ElectricCar ) {
	    					ElectricCar elec = (ElectricCar) vehicles.get(i);
	    					message += "" +y+";"+ elec.infoCSV()+ elec.getType() + CSVS + elec.getPolarizado() +CSVS + elec.getNumberOfDoors() + CSVS + elec.getChargerType() + CSVS +
	    							elec.getBatteryLife() + CSVS + elec.getBatteryConsume() + "\n";
	    					y++;
	    				}
	    			}
	    		}message += "\nNo hay más carros electricos registrados en el sistema.\n\n";
	    		break;
	    	case 3:
	    		message = "Carro  " + CSVS + "Marca" + CSVS + "Modelo" + CSVS + "Cilindraje" + CSVS + "Kilometraje" + CSVS + "Placa" + CSVS
	    		+ "Usado" + CSVS + "Precio base" + CSVS + "Tipo de carro" + CSVS + 
	    		"Polarizado" + CSVS + "Numero de puertas" + CSVS + "Tipo de carga "
	    		+ CSVS + "Capacidad de la bateria" + CSVS + "Consumo De bateria por kilometro" + CSVS + "Tipo de gasolina " 
	    				    		+ CSVS + "Capacidad del tanque" + CSVS + "Consumo De Gasolina por kilometro\n";
				int z = 1;
				for (int i = 0; i < vehicles.size(); i++) {
					if (vehicles.get(i) != null) {
						if (!vehicles.get(i).getSoldStatus() && vehicles.get(i) instanceof HibritCar ) {
							HibritCar hyb = (HibritCar) vehicles.get(i);
							message += "" +z+";"+ hyb.infoCSV()+ hyb.getType() + CSVS + hyb.getPolarizado() +CSVS + hyb.getNumberOfDoors() + CSVS + hyb.getChargerType() + CSVS +
									hyb.getBatteryLife() + CSVS + hyb.getBatteryConsume() + CSVS + hyb.getGasolineType() + CSVS + hyb.getGasolineCapacity() + 
									CSVS + hyb.getGasolineConsume() +"\n";
							z++;
						} 
					}
				}message += "\nNo hay más carros hibridos registrados en el sistema.\n\n";

				break;
			case 4:
				message +="Moto  " + CSVS + "Marca" + CSVS + "Modelo" + CSVS + "Cilindraje" + CSVS + "Kilometraje" + CSVS + "Placa" + CSVS
			    		+ "Usado" + CSVS + "Precio base" + CSVS + "Tipo de moto" +
						CSVS + "Capacidad de gasolina" + CSVS + "Consumo de gaolina por kilometro\n";
				int w = 1;
				for (int i = 0; i < vehicles.size(); i++) {
					if (vehicles.get(i) != null) {
						if (!vehicles.get(i).getSoldStatus() && vehicles.get(i) instanceof Motocycle ) {
							Motocycle moto = (Motocycle) vehicles.get(i);
							message += "" + w + ";" + moto.infoCSV() + moto.getTypeM() + CSVS + moto.getGasolineCapacity() + CSVS + moto.getGasolineConsume() +"\n"; 
							w++;
						} 
							
					}
				}message += "\nNo hay mas motos registradas en el sistema.\n\n";
				break;
			}
	    	bw.write(message);
			bw.close();
	    	fw.close(); 
		}
}

