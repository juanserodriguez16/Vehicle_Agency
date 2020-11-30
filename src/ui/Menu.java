package ui;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

import exception.SellerNoFoundException;
import exception.VehicleNoFoundException;
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
		System.out.println("7) Informacion de la empresa");
		System.out.println("8) SALIR");
	}
	public void menuVehicles() {
		System.out.println("=================================Vehiculos=================================");
		System.out.println("Digita el numero que corresponda con la opcion que deseas desarrollar");//
		System.out.println("1) Mostrar vehiculos de interes e informe completo de estos");//
		System.out.println("2) Agregar un vehiculo");//
		System.out.println("3) Buscar un vehiculo");
		System.out.println("4) Hacer una venta de vehiculo");
		System.out.println("5) Eliminar un vehiculo de la empresa ");
		System.out.println("6) SALIR ");
	}
	public void menuClients() {
		System.out.println("=================================Clientes=================================");
		System.out.println("Digita el numero que corresponda con la opcion que deseas desarrollar");//
		System.out.println("1) Ingresa un nuevo cliente");//
		System.out.println("2) Mostrar los clientes ingresados y la informacion de cada uno");//
		System.out.println("3) Buscar un cliente");
		System.out.println("4) Eliminar un cliente");
		System.out.println("5) SALIR ");
		
	}
	public void menuSellers() {
		System.out.println("=================================Vendedor=================================");
		System.out.println("Digita el numero que corresponda con la opcion que deseas desarrollar");//
		System.out.println("1) Mostrar los asesores de venta ordenados por su apellido o cedula y los clientes que han asesorado");//	
		System.out.println("2) Agregar un asesor de venta");
		System.out.println("3) Buscar un asesor de venta");
		System.out.println("4) Eliminar un asesor de venta");
		System.out.println("5) SALIR ");
		
	}
	public void nemuAditionalServices() {
		System.out.println("=================================Servicios Adicionales=================================");
		System.out.println("Digita el numero que corresponda con la opcion que deseas desarrollar");//
		System.out.println("1) Agregar un servicio adicional nuevo");
		System.out.println("2) Mostrar los servicios adicionales ordenados por su precio");
		System.out.println("3) Buscar un servicio adicional por su id ");
		System.out.println("4) SALIR ");
	}
	public void menuParking() {
		System.out.println("=================================Parqueadero=================================");
		System.out.println("Digita el numero que corresponda con la opcion que deseas desarrollar");//
		System.out.println("1) Habilitar parqueadero y consultar su estado ");//
		System.out.println("2) Consulatr informacion de los carros del parqueadero");
		System.out.println("3) SALIR ");
	}
	public void menuPersistencia() {
		System.out.println("=================================Manejo de datos de la agencia=================================");
		System.out.println("Digita el numero que corresponda con la opcion que deseas desarrollar");//
		System.out.println("1) Importar informacion de vendedores");
		System.out.println("2) Importar informacion de vehiculos");
		System.out.println("3) Exportar informacion de vendedores en archivos csv");
		System.out.println("4) Exportar informacion de vehiculos en archivos csv");
		System.out.println("5) SALIR ");
	}
	public void menuinfoEnterprice() {
		System.out.println("=================================Informacion de la Agencia=================================");
		System.out.println("Digita el numero que corresponda con la opcion que deseas desarrollar");//
		System.out.println("1) Total de ventas de la empresa");
		System.out.println("2) Listado de vehiculos vendidos");
		System.out.println("3) SALIR ");
	}
	public void startMenu() throws IOException, ClassNotFoundException, SellerNoFoundException {
		initialize();	
		int x= 0;
		int opt = 0;
		while(x !=8){
			
			menuRamas();
			x = Integer.parseInt(sc.nextLine());
			switch (x) {
			case 1:			//Rama de vehiculos 
				menuVehicles();
				opt = Integer.parseInt(sc.nextLine());
				switch(opt) {
				case 1:
					System.out.println("Digita en que forma deseas que sean mostrados los vehiculos ");
					System.out.println("1) Filtrados por vehiculos de distintos tipos");
					System.out.println("2) Filtrado por vehiculos nuevos o usados");
					System.out.println("3) Todos los vehiculos ordenados por modelo y kilometraje");
					int show = Integer.parseInt(sc.nextLine());
					switch(show) {
					case 1: 
						CatalogoTypeVehicle();
						break;
					case 2: 
						catalogoUsedVehicles();
						break;
					case 3: 
						ShowVehicles();
						break;
					}
					break;
				case 2:
					ReadVehicle();
					break;
				case 3:
					System.out.println("Ingresa la placa del vehiculo que deseas buscar");
					String placa = sc.nextLine();
					try {
						System.out.println(enterprice.searchVehicle(placa));
					}catch (VehicleNoFoundException e) {
						System.out.println(e.getMessage());
					}
					break;
				case 4:
					createSale();
					break;
				case 5:
					System.out.println("Ingresa la placa del vehiculo que deseas eliminar");
					String placa1 = sc.nextLine();
					try {
						System.out.println(enterprice.deleteVehicle(placa1));
					}catch (VehicleNoFoundException e) {
						System.out.println(e.getMessage());
					}
					enterprice.saveVehicles();
					break;
				case 6:
					break;

				}
				break;
			case 2://Rama de vendedores
				menuSellers();
				opt = Integer.parseInt(sc.nextLine());
				switch(opt) {
				case 1:
					ShowSellers();
					break;
				case 2:
					readSeller();
					break;
				case 3:
					System.out.println("Digita la cedula del vendedor");
					int cedula = Integer.parseInt(sc.nextLine());
					try {
						System.out.println(enterprice.searchSeller(cedula));
					}catch (SellerNoFoundException e) {
						System.out.println(e.getMessage());
					}
					
					break;
				case 4: 
					System.out.println("Digita la cedula del vendedor");
					int cedula2 = Integer.parseInt(sc.nextLine());
					try {
						System.out.println(enterprice.deleteSeller(cedula2));
					}catch (SellerNoFoundException e) {
						System.out.println(e.getMessage());
					}
					
					break;
				case 5:
					break;
					
				}
				
				break;
			case 3:	//Rama de clientes
				menuClients();
				opt = Integer.parseInt(sc.nextLine());
				switch(opt) {
				case 1:
					ReadClient();
					break;
				case 2:
					ShowClients();
					break;
				case 3:
					//metodo buscar cliente
					break;
				case 4: 
					//eliminar cliente
					break;
				case 5:
					break;
					
				}
			
				break;
			case 4:
				//Rama de Servicios adicionales
				nemuAditionalServices();
				opt = Integer.parseInt(sc.nextLine());
				switch(opt) {
				case 1:
					//readAdS();
					break;
				case 2:
					//showAdS();
					break;
				case 3:
					//metodo buscar servicio
					break;
				case 4: 
					
					break;
					
				}
				
				break;
			case 5:
				//Rama de Importar o exportar informacion de la empresa
				menuPersistencia();
				opt = Integer.parseInt(sc.nextLine());
				switch(opt) {
				case 1:
					//importSellers();
					break;
				case 2:
					//importVehicles();
					break;
				case 3:
					//exportSellers();
					break;
				case 4: 
					//exportVehicles();
					break;
				case 5:
					break;
					
				}
				break;
			case 6:
				//rama de Parqueadero de carros
				menuParking();
				opt = Integer.parseInt(sc.nextLine());
				switch(opt) {
				case 1:
					updateParking();
					break;
				case 2:
					infoparkingmenu();
					
					break;
				case 3:
					break;
				}
				break;
			case 7:
				// Informacion de la empresa
				menuinfoEnterprice();
				opt = Integer.parseInt(sc.nextLine());
				switch(opt) {
				case 1:
					totalProfitEnterprice();
					break;
				case 2:
					//vehiculosVnedidos();
					break;
				case 3:
					break;
				}
				break;

			}
		}
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
		int type = Integer.parseInt(sc.nextLine());
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
		int type = Integer.parseInt(sc.nextLine());
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
		String nameClient = sc.nextLine();
		System.out.println("Digita el apellido del cliente");
		String lastNane = sc.nextLine();
		System.out.println("digita la cedula del cliente");
		int cedula = Integer.parseInt(sc.nextLine());
		System.out.println("Digita el telefono del cliente");
		int phone =  Integer.parseInt(sc.nextLine());
		System.out.println("Digita el correo electronico del cliente");
		String email = sc.nextLine();
		System.out.println("Digita el numero que corresponde al asesor de venta\n");
		System.out.println(enterprice.ShowNameSellers());
		int seller =Integer.parseInt(sc.nextLine());
		
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
		System.out.println(enterprice.bubbleSortSellers());
		}
		/**
		* Show vehicles and his information <br>
		* <b>pre: </b> variables must be created in class  <br>
		* <b>post: </b> Show vehicles and his information and show on screan.
		*/
		public void ShowVehicles() {
			System.out.println(enterprice.insercionSortVehicles());
			
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
			int option = Integer.parseInt(sc.nextLine());
			System.out.println("Digita la marca del vehiculo");
			String mark = sc.nextLine();
			System.out.println("Digita el precio de el vehiculo");
			float price = Integer.parseInt(sc.nextLine());
			System.out.println("Digita el modelo del vehiculo");
			int model = Integer.parseInt(sc.nextLine());
			System.out.println("Digita el cilindraje del vehiculo");
			int cilindraje = Integer.parseInt(sc.nextLine());
			System.out.println("Digita el kilometraje del vehiculo");
			int mileaje = Integer.parseInt(sc.nextLine());
			System.out.println("Digita 1 si el vehiculo es usado o  digita 0 si no lo es");
			int usedString = Integer.parseInt(sc.nextLine());
			boolean used = false;
			if(usedString == 1) {
				used = true;
			}else{
				used = false;
			}
			System.out.println("Digita la placa del vehiculo");
			String placa = sc.nextLine();
			if (option == 1 || option == 2 || option == 3) {
				System.out.println("Digita el tipo de vehiculo (Sedan o Camioneta)");
				String type = sc.nextLine();
				
				System.out.println("Digita la cantidad de puertas del vehiculo");
				int numberOfDoors = Integer.parseInt(sc.nextLine());
				System.out.println("Digita 1 si el auto es polarizado o  digita 0 si no lo es");
				int polarizadoint = Integer.parseInt(sc.nextLine());
				boolean polar = false;
				if(polarizadoint == 1) {
					polar = true;
				}else{
					polar = false;
				}
					switch (option){
							case 1:
								System.out.println("Digita el tipo de gasolina que usa el vehiculo\n EXTRA\n CORRIENTE\n DIESEL");
								
								String gasolineType = sc.nextLine();
								System.out.println("Digita la capacidad del tanque");
								int gasolineCapacity = Integer.parseInt(sc.nextLine());
								GasolineCar newGasolineCar = new GasolineCar(0, price, mark
										, model, cilindraje, mileaje, used, placa, type, numberOfDoors, polar, gasolineType, gasolineCapacity);
								enterprice.addVehicle(newGasolineCar);
								int x = 0;
								while(x != 3) {
									System.out.println("Desea agregarle algun documento al vehiculo\n 1)SOAT\n 2)Servicio de revision tecnicomecanica\n 3)Salir");
								 x = Integer.parseInt(sc.nextLine());
								 switch (x) {
								 case 1:
										System.out.println("Digita el precio del SOAT");
										Float priceSOAT = Float.parseFloat(sc.nextLine());
										System.out.println("Digita el año de vigencia del documento");
										int year = Integer.parseInt(sc.nextLine());
										System.out.println("Digita el monto de la covertura que tiene el SOAT");
										Float coverage = Float.parseFloat(sc.nextLine());
										
										SOAT newSOAT = new SOAT (priceSOAT, year, coverage);
										newGasolineCar.addSOAT(newSOAT);
									 break;
								 case 2:
									 System.out.println("Digita el precio del servicio tecnicomecanico");
										Float priceMS =  Float.parseFloat(sc.nextLine());
										
										System.out.println("Digita el año de vigencia del documento");
										int yearms = Integer.parseInt(sc.nextLine());
										System.out.println("Digita las emisiones de gases que produce");
										Float gasLevels =  Float.parseFloat(sc.nextLine());
										
										MechanicService newMechanicService = new MechanicService (priceMS, yearms, gasLevels);
										newGasolineCar.addMechanicService(newMechanicService);
									 break;
								 }
								 }
								
								break;
							case 2:
								System.out.println("Escribe el tipo de cargador que usa el vehiculo\n RAPIDO\n NORMAL");
								
								String ChargerType = sc.nextLine();
								System.out.println("Digita la autonomia de la bateria en Kwatts");
								int batteryLife = Integer.parseInt(sc.nextLine());
								ElectricCar newElectricCar = new ElectricCar(0, price, mark
										, model, cilindraje, mileaje, used, placa, type, numberOfDoors, 
										polar, ChargerType, batteryLife);
								enterprice.addVehicle(newElectricCar);
								
								int y = 0;
								while(y != 3) {
									System.out.println("Desea agregarle algun documento al vehiculo\n 1)SOAT\n 2)Servicio de revision tecnicomecanica\n 3)Salir");
								 y = Integer.parseInt(sc.nextLine());
								 switch (y) {
								 case 1:
										System.out.println("Digita el precio del SOAT");
										Float priceSOAT =  Float.parseFloat(sc.nextLine());
										
										System.out.println("Digita el año de vigencia del documento");
										int year = Integer.parseInt(sc.nextLine());
										System.out.println("Digita el monto de la covertura que tiene el SOAT");
										Float coverage = Float.parseFloat(sc.nextLine());
										
										SOAT newSOAT = new SOAT (priceSOAT, year, coverage);
										newElectricCar.addSOAT(newSOAT);
									 break;
								 case 2:
									 System.out.println("Digita el precio del servicio tecnicomecanico");
										Float priceMS = Float.parseFloat(sc.nextLine());
										
										System.out.println("Digita el año de vigencia del documento");
										int yearms = Integer.parseInt(sc.nextLine());
										System.out.println("Digita las emisiones de gases que produce");
										Float gasLevels =  Float.parseFloat(sc.nextLine());
										
										MechanicService newMechanicService = new MechanicService (priceMS, yearms, gasLevels);
										newElectricCar.addMechanicService(newMechanicService);
									 break;
								 }
								 }
								
								
								break;
							case 3:
								System.out.println("Escribe el tipo de cargador que usa el vehiculo\n RAPIDO\n NORMAL");
								
								String a = sc.nextLine();
								System.out.println("Digita la autonomia de la bateria en kwatts");
								int b = Integer.parseInt(sc.nextLine());
								System.out.println("Digita el tipo de gasolina que usa el vehiculo\n EXTRA\n CORRIENTE\n DIESEL");
								
								String c = sc.nextLine();
								System.out.println("Digita la capacidad del tanque");
								int d = Integer.parseInt(sc.nextLine());
								HibritCar newHibritCar = new HibritCar(0, price, mark
										, model, cilindraje, mileaje, used, placa, type, numberOfDoors, 
										polar, a, b,c, d);
								enterprice.addVehicle(newHibritCar);
								int z = 0;
								while(z != 3) {
									System.out.println("Desea agregarle algun documento al vehiculo\n 1)SOAT\n 2)Servicio de revision tecnicomecanica\n 3)Salir");
								 z = Integer.parseInt(sc.nextLine());
								 switch (z) {
								 case 1:
										System.out.println("Digita el precio del SOAT");
										Float priceSOAT =  Float.parseFloat(sc.nextLine());
										
										System.out.println("Digita el año de vigencia del documento");
										int year = Integer.parseInt(sc.nextLine());
										System.out.println("Digita el monto de la covertura que tiene el SOAT");
										Float coverage =  Float.parseFloat(sc.nextLine());
										
										SOAT newSOAT = new SOAT (priceSOAT, year, coverage);
										newHibritCar.addSOAT(newSOAT);
									 break;
								 case 2:
									 System.out.println("Digita el precio del servicio tecnicomecanico");
										Float priceMS = Float.parseFloat(sc.nextLine());
										
										System.out.println("Digita el año de vigencia del documento");
										int yearms = Integer.parseInt(sc.nextLine());
										System.out.println("Digita las emisiones de gases que produce");
										Float gasLevels =  Float.parseFloat(sc.nextLine());
										
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
				System.out.println("Digita la capacidad del tanque");
				int gasolineCapacitym = Integer.parseInt(sc.nextLine());
				Motocycle newMotocycle = new Motocycle(0, price, mark
						, model, cilindraje, mileaje, used, placa,typeM,gasolineCapacitym);
				enterprice.addVehicle(newMotocycle);
				int x = 0;
				while(x != 3) {
					System.out.println("Desea agregarle algun documento al vehiculo\n 1)SOAT\n 2)Servicio de revision tecnicomecanica\n 3)Salir");
				 x = Integer.parseInt(sc.nextLine());
				 switch (x) {
				 case 1:
						System.out.println("Digita el precio del SOAT");
						Float priceSOAT =  Float.parseFloat(sc.nextLine());
						
						System.out.println("Digita el año de vigencia del documento");
						int year = Integer.parseInt(sc.nextLine());
						System.out.println("Digita el monto de la covertura que tiene el SOAT");
						Float coverage =  Float.parseFloat(sc.nextLine());
						
						SOAT newSOAT = new SOAT (priceSOAT, year, coverage);
						newMotocycle.addSOAT(newSOAT);
					 break;
				 case 2:
					 System.out.println("Digita el precio del servicio tecnicomecanico");
						Float priceMS =  Float.parseFloat(sc.nextLine());
						
						System.out.println("Digita el año de vigencia del documento");
						int yearms = Integer.parseInt(sc.nextLine());
						System.out.println("Digita las emisiones de gases que produce");
						Float gasLevels = Float.parseFloat(sc.nextLine());
						
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
		 * @throws IOException 
		*/
	
		public void createSale() throws IOException {
			String infoSale = "La informacion de la venta es:\n";
			System.out.println(enterprice.ShowNameSellers());
			System.out.println("Digita que vendedor que Asesoro");			
			int seller = Integer.parseInt(sc.nextLine());
			ShowClients(seller);
			System.out.println("Digita que cliente va a hacer la compra");
			int client = Integer.parseInt(sc.nextLine());
			Client lClient = enterprice.getSeller(seller).getClient(client);
			infoSale += "=============================== \n La informacion completa del cliente es\n " + lClient.infoClient() + "\n";	
			System.out.println(enterprice.infoVehicles());
			System.out.println("Digita que Vehiculo deseas comprar");
			int vehicle = Integer.parseInt(sc.nextLine());
			Vehicle lVehicle = enterprice.getVehicle(vehicle);
			infoSale += "\n=============================== \n La informacion completa del vehiculo comprado es:" + lVehicle.basicInfo() + "\n";	
			float total = enterprice.getTotalProfit() + (float)lVehicle.getSalesPrice();
			enterprice.setTotalProfit(total);
			enterprice.getVehicle(vehicle).setSoldStatus(true);
			enterprice.getSeller(seller).setSalesQuantity(enterprice.getSeller(seller).getSalesQuantity()+1);
			infoSale += "\n===============================\n la informacion del asesor de venta:" + enterprice.getSeller(seller).infoSeller() + "\n";
			infoSale += "Valor Total Venta: " + myFormatter.format(lVehicle.getSalesPrice());
			System.out.println(infoSale);
			enterprice.getVehicles().remove(lVehicle);
			enterprice.saveVehicles();
			}
			/**
			* Show total Profit of the enterprice <br>
			* <b>pre: </b> variables must be created in class  <br>
			* <b>post: </b>  Show total Profit of the enterprice and show on screan.
			*/	
		
		public void totalProfitEnterprice() {
			System.out.println("Las ventas totales de la empresa son :\n");
			System.out.println(myFormatter.format(enterprice.getTotalProfit()));
		}
		public void readSeller() throws IOException {
			System.out.println("Ingresa el nombre del nuevo Vendedor");
			String name = sc.nextLine();
			System.out.println("Ingresa el apellido del vendedor");
			String lastname = sc.nextLine();
			System.out.println("Ingresa la cedula del vendedor");
			int cedula = Integer.parseInt(sc.nextLine());
			Seller newSeller = new Seller(name, lastname, cedula, 0);
			enterprice.addSeller(newSeller);
			
		}
		
	}


