package ui;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

import model.*;
public class Menu {
	private static Scanner sc;
	private static Enterprice enterprice;
	private static DecimalFormat myFormatter;
	
	/**
	* Initialize all variables  <br>
	* <b> pre: </b> variables must be created in class <br>
	* <b> post: </b> the variables are initialized, and create the objects.
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	*
	*/
	public static void initialize() throws IOException, ClassNotFoundException {
		enterprice = new Enterprice("Concesionario", 1005965741, 0, 0);
		
		/**Seller s1 = new Seller("Camilo", "Perdomo", 133427583, 0);
		Seller s2 = new Seller("juan", "Patiño", 123456865, 0);
		Seller s3 = new Seller("David", "Garcia", 987543265, 0);
		Seller s4 = new Seller("Laura", "Uribe", 8765432, 0);
		Seller s5 = new Seller("Juan", "Rodriguez", 876543, 0);
		Seller s6 = new Seller("Sebastian", "Garcia", 0000, 0);
		Seller s7 = new Seller("Andres", "Rogelis", 65435, 0);
		Seller s8 = new Seller("Isabella", "Martinez", 2342121, 0);
		Seller s9 = new Seller("Claudia", "Medina", 45611178, 0);
		Seller s10 = new Seller("Felipe", "Eraso", 656565, 0);
		
		
		enterprice.addSeller(s1);
		enterprice.addSeller(s2);
		enterprice.addSeller(s3);
		enterprice.addSeller(s4);
		enterprice.addSeller(s5);
		enterprice.addSeller(s6);
		enterprice.addSeller(s7);
		enterprice.addSeller(s8);
		enterprice.addSeller(s9);
		enterprice.addSeller(s10);
		

		
		
		GasolineCar gc1 = new GasolineCar(0, 80000000, "Ferrari"
				, 2013, 2000, 0, true, "GHY-289", "SEDAN", 2, false, "EXTRA", 75);
		
		ElectricCar ec1 = new ElectricCar(0, 65000000, "Audi"
				, 2020, 1600, 0, false, "CPY-256", "SEDAN", 4, true, "RAPIDO", 50);
		
		GasolineCar gc3 = new GasolineCar(0, 90000000, "Porsche"
				, 2013, 2200, 7000, true, "TYU-765", "SEDAN", 4, true, "CORRIENTE", 50);
		
		GasolineCar gc5 = new GasolineCar(0, 30000000, "Chevrolet"
				, 2020, 1600, 0, false, "ADF-890", "SEDAN", 4, true, "DIESEL", 50);
		
		GasolineCar gc4 = new GasolineCar(0, 30000000, "Mazda"
				, 2013, 2000, 20000, true, "BNM-543", "CAMIONETA", 4, true, "DIESEL", 80);
		
		ElectricCar ec2 = new ElectricCar(0, 60000000, "Lamborghini"
				, 2018, 2200, 50000, true, "MHQ-064", "CAMIONETA", 4, false, "RAPIDO", 50);
		
		ElectricCar ec3 = new ElectricCar(0, 100000000, "Nissan"
				, 2018, 2200, 80000, true, "CMM-111", "CAMIONETA", 4, false, "RAPIDO", 50);
		
		ElectricCar ec4 = new ElectricCar(0, 95000000, "Kia"
				, 2012, 2200, 0, true, "KIA-256", "SEDAN", 4, false, "RAPIDO", 50);
		
		Motocycle m1 = new Motocycle(0, 5000000, "AKT"
				, 2013, 2000, 0, false, "CMM-28D", "ESTANDAR", 8);
		
		Motocycle m2 = new Motocycle(0, 20000000, "DUCATTI"
				, 2013, 2000, 0, false, "GHY-78H", "ESTANDAR", 8);
		HibritCar h1 = new HibritCar(0, 120000000, "Tezla"
				, 2012, 2200, 0, true, "KTM-006", "SEDAN", 2, true, "RAPIDO", 50, "DIESEL", 30);
		HibritCar h2 = new HibritCar(0, 200000000, "Tezla"
				, 2011, 1600, 0, false, "PLM-016", "SEDAN", 2, true, "RAPIDO", 50, "EXTRA", 80);
		SOAT soat1 = new SOAT(450000, 2020, 20000000);
		h2.addSOAT(soat1);
		
	
		enterprice.addVehicle(ec4);
		enterprice.addVehicle(ec2);
		enterprice.addVehicle(ec3);
		enterprice.addVehicle(gc1);
		enterprice.addVehicle(ec1);
		enterprice.addVehicle(gc3);
		enterprice.addVehicle(gc4);
		enterprice.addVehicle(gc5);
		enterprice.addVehicle(m1);
		enterprice.addVehicle(m2);
		enterprice.addVehicle(h1);
		enterprice.addVehicle(h2);
		// Crear Tipos de Mercancia
		
		*/
		
		// Escaner para peticion de datos
		  sc = new Scanner(System.in);
		  myFormatter = new DecimalFormat("###,###.###");
		
	}
	/**
	* will show on the screen the options menu<br>
	* <b>pre: </b>  <br>
	* <b>post: </b> The user has been informed of the options they have.
	*/	
	public static void menu() {
		System.out.println("=================================Menu=================================");
		System.out.println("Digita el numero que corresponda con la opcion que deseas desarrollar");//
		System.out.println("1) Ingresa un nuevo cliente");//
		System.out.println("2) Mostrar los clientes ingresados y la informacion de cada uno");//
		System.out.println("3) Mostrar los asesores de venta y los clientes que han asesorado");//	
		System.out.println("4) Mostrar vehiculos de interes e informe completo de estos");//
		System.out.println("5) Catalogo de vehiculos filtrado por tipo de vehiculo");	//
		System.out.println("6) Catalogo de autos usados y nuevos");	//
		System.out.println("7) Agregar un vehiculo");//	
		System.out.println("8) Hacer una venta de vehiculo");	
		System.out.println("9) Mostrar ventas totales de la empresa");	//
		System.out.println("10) Consulta del parqueadero y su estado");//
		System.out.println("11) Consulatr informacion de los carros del parqueadero");
		System.out.println("12) SALIR");//
	}
	public void menuRamas() {
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("                        Vehicle Agency                               ");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("");
		System.out.println("Elige la rama de la opcion que se va a desarrolar ");
		System.out.println("1) Vehiculos");
		System.out.println("2) Vendedores");
		System.out.println("3) Clientes ");
		System.out.println("4) Servicios adicionales");
		System.out.println("5) Importar o exportar informacion de la empresa");
		System.out.println("6) Parqueadero de carros");
	}
	public void menuVehicles() {
		System.out.println("=================================Vehiculos=================================");
		System.out.println("Digita el numero que corresponda con la opcion que deseas desarrollar");//
		System.out.println("1) Mostrar vehiculos de interes e informe completo de estos");//
		System.out.println("2) Agregar un vehiculo");//
		System.out.println("3) Buscar un vehiculo");
		System.out.println("3) Hacer una venta de vehiculo");
		System.out.println("4) Eliminar un vehiculo de la empresa ");
	}
	public void menuClients() {
		System.out.println("=================================Clientes=================================");
		System.out.println("Digita el numero que corresponda con la opcion que deseas desarrollar");//
		System.out.println("1) Ingresa un nuevo cliente");//
		System.out.println("2) Mostrar los clientes ingresados y la informacion de cada uno");//
		System.out.println("3) Buscar un cliente");
		System.out.println("4) Eliminar un cliente");
		
	}
	public void menuSellers() {
		System.out.println("=================================Vendedor=================================");
		System.out.println("Digita el numero que corresponda con la opcion que deseas desarrollar");//
		System.out.println("1) Mostrar los asesores de venta y los clientes que han asesorado");//	
		System.out.println("2) Agregar un asesor de venta");
		System.out.println("3) Buscar un asesor de venta");
		System.out.println("4) Eliminar un asesor de venta");
		
	}
	public void nemuAditionalServices() {
		System.out.println("=================================Servicios Adicionales=================================");
		System.out.println("Digita el numero que corresponda con la opcion que deseas desarrollar");//
		System.out.println("1) Agregar un servicio adicional nuevo");
		System.out.println("2) Mostrar los servicios adicionales ordenados por su precio");
		System.out.println("3) ");
	}
	/**
	* will show on the screen the information of the parking<br>
	* <b>pre: </b>  <br>
	* <b>post: </b> The user has been informed of the options they have.
	*/		
	public void infoparkingmenu() {
		System.out.println(enterprice.getInfoParking());
	}
	/**
	* will show on the screen the information of the parking and the space in this<br>
	* <b>pre: </b> variables must be created in class  <br>
	* <b>post: </b> The user has been informed of the options they have and show in screen.
	*/		
	public void updateParking() {
		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
		int ix=0; //Indici sobre el que se busca el parqueadero 

		
			for( int i = 0; i < enterprice.getVehicles().size();i++) {
				 if(enterprice.getVehicles().get(i) instanceof Car) {
					 if (enterprice.getVehicles().get(i).getModel() <= 2014) {
						 ix = 2014 - enterprice.getVehicles().get(i).getModel();
					 	 if (ix > 4) {ix = 4;}
					
						if ( enterprice.getVehicles().get(i).getUsed() && !enterprice.getVehicles().get(i).getSoldStatus()) {
							for(int j = 0; j < enterprice.getParkingSpace().length ;j++) {
							if (enterprice.getParkingSpace()[j][ix] == null) {
								enterprice.getParkingSpace()[j][ix] = (Car) enterprice.getVehicles().get(i);
								break;
							}else if(enterprice.getParkingSpace()[j][ix].equals((Car) enterprice.getVehicles().get(i))) {
									break;	
								}
										
							}
					   }
				   }
				 }
				
			}

			for (int i = 0; i < enterprice.getParkingSpace().length; i++ ) {
				if (enterprice.getParkingSpace()[i][0] != null) {
					cont1 += 1;
				}
				if (enterprice.getParkingSpace()[i][1] != null) {
					cont2 += 1;
				}
				if (enterprice.getParkingSpace()[i][2] != null) {
					cont3 += 1;
				}
				if (enterprice.getParkingSpace()[i][3] != null) {
					cont4 += 1;
				}
				if (enterprice.getParkingSpace()[i][4] != null) {
					cont5 += 1;
				}
			}

			if (cont1 <10) 
				System.out.println("parqueaderos disponibles para carros de modelos 2014 som :" + (10 - cont1));
			else
				System.out.println("No hay parqueaderos disponibles para carros de modelos 2014");				
			
			if (cont2 <10) 
				System.out.println("parqueaderos disponibles para carros de modelos 2013 som :" + (10 - cont2));
			else
				System.out.println("No hay parqueaderos disponibles para carros de modelos 2013");				

			if (cont3 <10) 
				System.out.println("parqueaderos disponibles para carros de modelos 2012 som :" + (10 - cont3));
			else
				System.out.println("No hay parqueaderos disponibles para carros de modelos 2012");				
			
			if (cont4 <10) 
				System.out.println("parqueaderos disponibles para carros de modelos 2011 som :" + (10 - cont4));
			else
				System.out.println("No hay parqueaderos disponibles para carros de modelos 2011");				
			if (cont5 <10) 
				System.out.println("parqueaderos disponibles para carros de modelos menores a el 2010 som :" + (10 - cont5));
			else
				System.out.println("No hay parqueaderos disponibles para carros de modelos menores al 2010");				

	}
	/**
	* will show on the screen the information of the every vehicles<br>
	* <b>pre: </b> variables must be created in class  <br>
	* <b>post: </b> The user has been informed of the options they have and show in screen.
	*/
	public void CatalogoTypeVehicle() {
		int x = 0;
		while (x != 5) {
		System.out.println("Digita el tipo de vehiculo del cual deseas ver el catalogo\n 1) CARRO A GASOLINA\n 2) CARRO ELECTRICO\n 3) CARRO HIBRIDO\n 4) MOTOCICLETA\n 5) SALIR");
		sc.nextLine();
		int type = sc.nextInt();
		x = type;
		System.out.println(enterprice.getInfoTypeVehicle(type));
		}
	}
	/**
	* will show on the screen the information of the every vehicles<br>
	* <b>pre: </b> variables must be created in class  <br>
	* <b>post: </b> The user has been informed of the options they have and show in screen.
	*/
	public void catalogoUsedVehicles() {
		int x = 0;
		while (x != 4) {
		System.out.println("Digita la opcion para desplegar el catalogo\n 1) VEHICULOS USADOS\n 2 )VEHICULOS NUEVOS\n 3 )TODOS LOS VEHICULOS NUESVOS Y USADOS\n 4 )SALIR");
		sc.nextLine();
		int type = sc.nextInt();
		x = type;
		System.out.println(enterprice.infoIfUsed(type));
		}
	}
	/**
	* Create a new client and add in the enterprice<br>
	* <b>pre: </b> variables must be created in class  <br>
	* <b>post: </b> create a new client an add in the enterprice.
	*/
	public void ReadClient() {
		System.out.println("Digita el Nombre del Nuevo cliente");
		sc.nextLine();
		String nameClient = sc.nextLine();
		System.out.println("Digita el apellido del cliente");
		String lastNane = sc.nextLine();
		System.out.println("digita la cedula del cliente");
		int cedula = sc.nextInt();
		sc.nextLine();
		System.out.println("Digita el telefono del cliente");
		int phone = sc.nextInt();
		sc.nextLine();
		System.out.println("Digita el correo electronico del cliente");
		String email = sc.nextLine();
		System.out.println("Digita el numero que corresponde al asesor de venta\n");
		String pr = enterprice.ShowNameSellers();
		System.out.println(pr);
		sc.hasNextLine();
		int seller = sc.nextInt();
		
		Client newClient = new Client(nameClient, lastNane, cedula, phone, email);
		enterprice.getSeller(seller).addClient(newClient);
	}
	/**
	* Show clients and his information <br>
	* <b>pre: </b> variables must be created in class  <br>
	* <b>post: </b> Show clients and his information and show on screan.
	*/
		public void ShowClients() {
		System.out.println(enterprice.infoClients());
		}
		/**
		* Show client and his information <br>
		* <b>pre: </b> variables must be created in class  <br>
		* <b>post: </b> Show clients and his information and show on screan.
		* @param ix the selection variable of the index. ix != null.
		*/
		public void ShowClients(int ix ) {
		System.out.println(enterprice.infoClients(ix-1));
		}
		/**
		* Show sellers and his information <br>
		* <b>pre: </b> variables must be created in class  <br>
		* <b>post: </b> Show sellers and his information and show on screan.
		*/
		public void ShowSellers() {
			System.out.println(enterprice.infoSellers());
		}
		/**
		* Show vehicles and his information <br>
		* <b>pre: </b> variables must be created in class  <br>
		* <b>post: </b> Show vehicles and his information and show on screan.
		*/
		public void ShowVehicles() {
			System.out.println(enterprice.infoVehicles());
			
		}
		/**
		* Create a new vehicle and add in the enterprice<br>
		* <b>pre: </b> variables must be created in class  <br>
		* <b>post: </b> create a new vehicle an add in the enterprice.
		 * @throws IOException 
		*/
		public void ReadVehicle() throws IOException {
			System.out.println("Que tipo de vehiculo va a ingresar:");
			System.out.println("1) Carro a gasolina");
			System.out.println("2) Carro Electrico");
			System.out.println("3) Carro hibrido");
			System.out.println("4) Motocicleta");
			int option = sc.nextInt();
			System.out.println("Digita la marca del vehiculo");
			String mark = sc.nextLine();
			sc.nextLine();
			System.out.println("Digita el precio de el vehiculo");
			float price = sc.nextInt();
			sc.nextLine();
			System.out.println("Digita el modelo del vehiculo");
			
			int model = sc.nextInt();
			sc.nextLine();
			System.out.println("Digita el cilindraje del vehiculo");
			int cilindraje = sc.nextInt();
			sc.nextLine();
			System.out.println("Digita el kilometraje del vehiculo");
			int mileaje = sc.nextInt();
			sc.nextLine();
			System.out.println("Digita 1 si el vehiculo es usado o  digita 0 si no lo es");
			int usedString = sc.nextInt();
			boolean used = false;
			if(usedString == 1) {
				used = true;
			}else{
				used = false;
			}
			System.out.println("Digita la placa del vehiculo");
			String placa = sc.nextLine();
			sc.nextLine();
			if (option == 1 || option == 2 || option == 3) {
				System.out.println("Digita el tipo de vehiculo (Sedan o Camioneta)");
				String type = sc.nextLine();
				
				System.out.println("Digita la cantidad de puertas del vehiculo");
				int numberOfDoors = sc.nextInt();
				sc.nextLine();
				System.out.println("Digita 1 si el auto es polarizado o  digita 0 si no lo es");
				int polarizadoint = sc.nextInt();
				boolean polar = false;
				if(polarizadoint == 1) {
					polar = true;
				}else{
					polar = false;
				}
					switch (option){
							case 1:
								System.out.println("Digita el tipo de gasolina que usa el vehiculo\n EXTRA\n CORRIENTE\n DIESEL");
								sc.nextLine();
								String gasolineType = sc.nextLine();
								System.out.println("Digita la capacidad del tanque");
								int gasolineCapacity = sc.nextInt();
								sc.nextLine();
								GasolineCar newGasolineCar = new GasolineCar(0, price, mark
										, model, cilindraje, mileaje, used, placa, type, numberOfDoors, polar, gasolineType, gasolineCapacity);
								enterprice.addVehicle(newGasolineCar);
								int x = 0;
								while(x != 3) {
									System.out.println("Desea agregarle algun documento al vehiculo\n 1)SOAT\n 2)Servicio de revision tecnicomecanica\n 3)Salir");
								 x = sc.nextInt();
								 switch (x) {
								 case 1:
										System.out.println("Digita el precio del SOAT");
										Float priceSOAT = sc.nextFloat();
										sc.nextLine();
										System.out.println("Digita el año de vigencia del documento");
										int year = sc.nextInt();
										sc.nextLine();
										System.out.println("Digita el monto de la covertura que tiene el SOAT");
										Float coverage = sc.nextFloat();
										sc.nextLine();
										SOAT newSOAT = new SOAT (priceSOAT, year, coverage);
										newGasolineCar.addSOAT(newSOAT);
									 break;
								 case 2:
									 System.out.println("Digita el precio del servicio tecnicomecanico");
										Float priceMS = sc.nextFloat();
										sc.nextLine();
										System.out.println("Digita el año de vigencia del documento");
										int yearms = sc.nextInt();
										sc.nextLine();
										System.out.println("Digita las emisiones de gases que produce");
										Float gasLevels = sc.nextFloat();
										sc.nextLine();
										MechanicService newMechanicService = new MechanicService (priceMS, yearms, gasLevels);
										newGasolineCar.addMechanicService(newMechanicService);
									 break;
								 }
								 }
								
								break;
							case 2:
								System.out.println("Escribe el tipo de cargador que usa el vehiculo\n RAPIDO\n NORMAL");
								sc.nextLine();
								String ChargerType = sc.nextLine();
								System.out.println("Digita la autonomia de la bateria en Kwatts");
								int batteryLife = sc.nextInt();
								sc.nextLine();
								ElectricCar newElectricCar = new ElectricCar(0, price, mark
										, model, cilindraje, mileaje, used, placa, type, numberOfDoors, 
										polar, ChargerType, batteryLife);
								enterprice.addVehicle(newElectricCar);
								
								int y = 0;
								while(y != 3) {
									System.out.println("Desea agregarle algun documento al vehiculo\n 1)SOAT\n 2)Servicio de revision tecnicomecanica\n 3)Salir");
								 y = sc.nextInt();
								 switch (y) {
								 case 1:
										System.out.println("Digita el precio del SOAT");
										Float priceSOAT = sc.nextFloat();
										sc.nextLine();
										System.out.println("Digita el año de vigencia del documento");
										int year = sc.nextInt();
										sc.nextLine();
										System.out.println("Digita el monto de la covertura que tiene el SOAT");
										Float coverage = sc.nextFloat();
										sc.nextLine();
										SOAT newSOAT = new SOAT (priceSOAT, year, coverage);
										newElectricCar.addSOAT(newSOAT);
									 break;
								 case 2:
									 System.out.println("Digita el precio del servicio tecnicomecanico");
										Float priceMS = sc.nextFloat();
										sc.nextLine();
										System.out.println("Digita el año de vigencia del documento");
										int yearms = sc.nextInt();
										sc.nextLine();
										System.out.println("Digita las emisiones de gases que produce");
										Float gasLevels = sc.nextFloat();
										sc.nextLine();
										MechanicService newMechanicService = new MechanicService (priceMS, yearms, gasLevels);
										newElectricCar.addMechanicService(newMechanicService);
									 break;
								 }
								 }
								
								
								break;
							case 3:
								System.out.println("Escribe el tipo de cargador que usa el vehiculo\n RAPIDO\n NORMAL");
								sc.nextLine();
								String a = sc.nextLine();
								System.out.println("Digita la autonomia de la bateria en kwatts");
								int b = sc.nextInt();
								sc.nextLine();
								System.out.println("Digita el tipo de gasolina que usa el vehiculo\n EXTRA\n CORRIENTE\n DIESEL");
								sc.nextLine();
								String c = sc.nextLine();
								System.out.println("Digita la capacidad del tanque");
								int d = sc.nextInt();
								sc.nextLine();
								HibritCar newHibritCar = new HibritCar(0, price, mark
										, model, cilindraje, mileaje, used, placa, type, numberOfDoors, 
										polar, a, b,c, d);
								enterprice.addVehicle(newHibritCar);
								int z = 0;
								while(z != 3) {
									System.out.println("Desea agregarle algun documento al vehiculo\n 1)SOAT\n 2)Servicio de revision tecnicomecanica\n 3)Salir");
								 z = sc.nextInt();
								 switch (z) {
								 case 1:
										System.out.println("Digita el precio del SOAT");
										Float priceSOAT = sc.nextFloat();
										sc.nextLine();
										System.out.println("Digita el año de vigencia del documento");
										int year = sc.nextInt();
										sc.nextLine();
										System.out.println("Digita el monto de la covertura que tiene el SOAT");
										Float coverage = sc.nextFloat();
										sc.nextLine();
										SOAT newSOAT = new SOAT (priceSOAT, year, coverage);
										newHibritCar.addSOAT(newSOAT);
									 break;
								 case 2:
									 System.out.println("Digita el precio del servicio tecnicomecanico");
										Float priceMS = sc.nextFloat();
										sc.nextLine();
										System.out.println("Digita el año de vigencia del documento");
										int yearms = sc.nextInt();
										sc.nextLine();
										System.out.println("Digita las emisiones de gases que produce");
										Float gasLevels = sc.nextFloat();
										sc.nextLine();
										MechanicService newMechanicService = new MechanicService (priceMS, yearms, gasLevels);
										newHibritCar.addMechanicService(newMechanicService);
									 break;
								 }
								 }
								
								break;
						
				
			}
					
		}
			else if (option == 4) {
				System.out.println("Escribe el tipo de motocicleta\n ESTANDAR\n DEPORTIVA\n SCOOTER\n SCOOTER");
				String typeM = sc.nextLine();
				sc.nextLine();
				System.out.println("Digita la capacidad del tanque");
				int gasolineCapacitym = sc.nextInt();
				Motocycle newMotocycle = new Motocycle(0, price, mark
						, model, cilindraje, mileaje, used, placa,typeM,gasolineCapacitym);
				enterprice.addVehicle(newMotocycle);
				int x = 0;
				while(x != 3) {
					System.out.println("Desea agregarle algun documento al vehiculo\n 1)SOAT\n 2)Servicio de revision tecnicomecanica\n 3)Salir");
				 x = sc.nextInt();
				 switch (x) {
				 case 1:
						System.out.println("Digita el precio del SOAT");
						Float priceSOAT = sc.nextFloat();
						sc.nextLine();
						System.out.println("Digita el año de vigencia del documento");
						int year = sc.nextInt();
						sc.nextLine();
						System.out.println("Digita el monto de la covertura que tiene el SOAT");
						Float coverage = sc.nextFloat();
						sc.nextLine();
						SOAT newSOAT = new SOAT (priceSOAT, year, coverage);
						newMotocycle.addSOAT(newSOAT);
					 break;
				 case 2:
					 System.out.println("Digita el precio del servicio tecnicomecanico");
						Float priceMS = sc.nextFloat();
						sc.nextLine();
						System.out.println("Digita el año de vigencia del documento");
						int yearms = sc.nextInt();
						sc.nextLine();
						System.out.println("Digita las emisiones de gases que produce");
						Float gasLevels = sc.nextFloat();
						sc.nextLine();
						MechanicService newMechanicService = new MechanicService (priceMS, yearms, gasLevels);
						newMotocycle.addMechanicService(newMechanicService);
					 break;
				 }
				 }
				
			}
		}

		
		/**
		* Create a new sale and Show information of this<br>
		* <b>pre: </b> variables must be created in class  <br>
		* <b>post: </b> create a new sale and show information.
		*/
	
		public void createSale() {
			String infoSale = "La informacion de la venta es:\n";
			ShowSellers();
			System.out.println("Digita que vendedor que Asesoro");			
			int seller = sc.nextInt();
			ShowClients(seller);
			System.out.println("Digita que cliente va a hacer la compra");
			int client = sc.nextInt();
			Client lClient = enterprice.getSeller(seller).getClient(client);
			infoSale += "\n=============================== \n La informacion completa del cliente es\n " + lClient.infoClient() + "\n";	
			ShowVehicles();
			System.out.println("Digita que Vehiculo deseas comprar");
			int vehicle = sc.nextInt();
			Vehicle lVehicle = enterprice.getVehicle(vehicle);
			infoSale += "\n=============================== \n La informacion completa del vehiculo comprado es ===" + lVehicle.basicInfo() + "\n";	
			infoSale += "Nombre del asesor de venta ===" + enterprice.getSeller(seller).getName() + "\n";
			infoSale += "Valor Total Venta: " + myFormatter.format(lVehicle.getSalesPrice());
			float total = enterprice.getTotalProfit() + (float)lVehicle.getSalesPrice();
			enterprice.setTotalProfit(total);
			enterprice.getVehicle(vehicle).setSoldStatus(true);
			System.out.println(infoSale);
			
			/**
			* Show total Profit of the enterprice <br>
			* <b>pre: </b> variables must be created in class  <br>
			* <b>post: </b>  Show total Profit of the enterprice and show on screan.
			*/	
		}
		public void totalProfitEnterprice() {
			System.out.println("Las ventas totales de la empresa son :\n");
			System.out.println(myFormatter.format(enterprice.getTotalProfit()));
		}
		public void startProgram() throws IOException, ClassNotFoundException{
			initialize();	
			int x= 0;
			while(x !=12){
				menuRamas();
				menu();
				x = sc.nextInt();
				switch (x) {
					case 1:
						ReadClient();
						break;
					case 2:
						ShowClients();
						break;
					case 3:
						ShowSellers();
						break;
					case 4:
						ShowVehicles();
						break;
					case 5:
						CatalogoTypeVehicle();
						break;
					case 6:
						catalogoUsedVehicles();
						break;
					case 7:
						ReadVehicle();
						break;
					case 8:
						createSale();
						break;
					case 9:
						totalProfitEnterprice();
						break;
					case 10:
						updateParking();
						break;
					case 11:
						infoparkingmenu();
						break;
						
				}
			}
		}
		
	}


