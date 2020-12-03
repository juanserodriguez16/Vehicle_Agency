package model;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;

public abstract class Vehicle implements Serializable{
      /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private float totalPrice;
      private float BasePrice;
      private String mark;
      private int model;
      private int cilindraje;
      private int mileaje;
      private boolean used;
      private String placa;
      private SOAT soats;
      private MechanicService mechanicServices;
      private double adicionalCost; 
      private double useddiscount; 
      private boolean soldStatus;
      private static DecimalFormat myFormatter;
      public final static String CSVS = ";";
      private Vehicle left;
      private Vehicle right;
      private Vehicle parent;
      

 	 /** 
  	 * will transform the parameters into a variables of this class and create type of object <br> 
  	 * <b>pre: </b>the parameters cannot be null<br> 
  	 * <b>post: </b>transform the parameter to a variable of this class and made a object. 
  	 * @param totalPrice the selection variable of the totalPrice. totalPrice != null. 
  	 * @param BasePrice the selection variable of the BasePrice. BasePrice !=null.
  	 * @param mark the selection variable of the mark. mark !=null.
  	 * @param model the selection variable of the model. model !=null.
  	 * @param cilindraje the selection variable of the cilindraje. cilindraje !=null.
  	 * @param mileaje the selection variable of the mileaje. mileaje !=null.
  	 * @param used the selection variable of the used. used !=null.
  	 * @param placa the selection variable of the placa. placa !=null.
  	 */	
      public Vehicle (float totalPrice,float BasePrice, String mark, int model, 
    		  int cilindraje, int mileaje, boolean used, String placa) {
    	  this.totalPrice = totalPrice;
    	  this.BasePrice = BasePrice;
    	  this.mark = mark;
    	  this.model = model;
    	  this.cilindraje = cilindraje;
    	  this.mileaje = mileaje;
    	  this.used = used;
    	  this.placa = placa;
    	  this.soldStatus = false;
    	  soats = null;
    	  mechanicServices = null;
      }
 	 /** 
  	 * Add an item to a list<br> 
  	 * <b>pre: </b>The required parameter cannot be null <br> 
  	 * <b>post: </b>transform the parameter to a variable of this class and add to a list. 
  	 * @param soat the selection object of the soat. soat != null. 
  	 */
      public void addSOAT(SOAT soat) {
		  if (soats == null)
		  	soats = soat;
		  else
		  	soats.setNext(soat);
    	}
      public SOAT getSOATS() {
    		return soats;	
    	}
 	 /** 
  	 * Add an item to a list<br> 
  	 * <b>pre: </b>The required parameter cannot be null <br> 
  	 * <b>post: </b>transform the parameter to a variable of this class and add to a list. 
  	 * @param mechanicService the selection object of the mechanicService. mechanicService != null. 
  	 */
      public void addMechanicService(MechanicService mechanicService) {
    	 if (mechanicServices == null)
    		 mechanicServices = mechanicService;
    	 else 
    		 mechanicServices.setNext(mechanicService);
      }
 	 /** 
  	 * get the element that you selected<br> 
  	 * <b>pre: </b>the variable to return must be entered <br> 
  	 * <b>post: </b>get the object selected.
  	 * @return totalPrice. 
  	 */	
	public float getTotalPrice() {
		return totalPrice;
	}
	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param totalPrice the selection variable of the total price. totalPrice != null. 
	 */
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return BasePrice. 
 	 */	
	public float getBasePrice() {
		return BasePrice;
	}
	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param basePrice the selection variable of the base Price. basePrice!= null. 
	 */
	public void setBasePrice(float basePrice) {
		BasePrice = basePrice;
	}
	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return mark. 
 	 */	
	public String getMark() {
		return mark;
	}
	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param mark the selection variable of the mark. mark != null. 
	 */
	public void setMark(String mark) {
		this.mark = mark;
	}
	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return model. 
 	 */	
	public int getModel() {
		return model;
	}
	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param model the selection variable of the model . model != null. 
	 */
	public void setModel(int model) {
		this.model = model;
	}
	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return cilindraje. 
 	 */	
	public int getCilindraje() {
		return cilindraje;
	}
	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param cilindraje the selection variable of the cilindraje . cilindraje!= null. 
	 */
	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}
	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return mileaje. 
 	 */	
	public int getMileaje() {
		return mileaje;
	}
	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param mileaje the selection variable of the mileaje. mileaje != null. 
	 */
	public void setMileaje(int mileaje) {
		this.mileaje = mileaje;
	}
	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return used. 
 	 */	
	public boolean getUsed() {
		return used;
	}
	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param used the selection variable of the used . used != null. 
	 */
	public void setUsed(boolean used) {
		this.used = used;
	}
	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return placa. 
 	 */	
	public String getPlaca() {
		return placa;
	}
	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param placa the selection variable of the placa. placa!= null. 
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	/** 
	* Accumulates the data in a chain of information <br> 
	* <b>pre: </b>The required parameter cannot be null <br> 
	* <b>post: </b>returns a string of accumulated information. 
	* @return basicInfo. 
	*/
	public String basicInfo() {
		  myFormatter = new DecimalFormat("###,###.###");
		String basicInfo ="\n" + "Marca: " +getMark() +  "\nModelo: " + getModel() + "\nCilindraje: "
	+ getCilindraje() + "\nkilometraje: " + getMileaje()+ "\nPlaca: " + getPlaca()
	+ "\nUsado: " + getUsed()+ "\nPrecio Base: " + myFormatter.format(getBasePrice())+ "\n" + infoSOATS() + "\n" + infoMC();;
		  return basicInfo;
	}
	public String infoCSV() {
		 myFormatter = new DecimalFormat("###,###.###");
		 String csvinfo = getMark() + CSVS + getModel() + CSVS + getCilindraje() + CSVS + getMileaje() + CSVS + getPlaca() + CSVS + getUsed() + CSVS + myFormatter.format(getBasePrice())
		 + CSVS;
		 return  csvinfo;
	}
	/** 
	* Accumulates the data in a chain of information <br> 
	* <b>pre: </b>The required parameter cannot be null <br> 
	* <b>post: </b>returns a string of accumulated information. 
	* @return basicInfo. 
	*/
	public String infoSOATS() {
		SOAT current;
			current = soats;
		  String info = "Los SOATS de este vehiculo son:\n";
		  if(current != null) {
			int i = 1;  		  
			while (current != null){
					info += "- "+ (i) + ") " +  current.Info();
					i++;
					current = (SOAT) current.getNext();
			}
		  }else 
			  info = "El vehiculo no tiene SOATS";
	return info;


	}
	/** 
	* Accumulates the data in a chain of information <br> 
	* <b>pre: </b>The required parameter cannot be null <br> 
	* <b>post: </b>returns a string of accumulated information. 
	* @return basicInfo. 
	*/
	public String infoMC() {
		MechanicService current;
		current = mechanicServices;
		 String info = "Los servicios de revision tecnicomecanica de este vehiculo son:\n";
		if(mechanicServices != null) {
		 int i = 1;
			while(current != null) {
					
				info += "- "+ (i) + ") " +  current.Info();
				i++;
				current = (MechanicService) current.getNext();
			}
		}else info = "El vehiculo no tiene Documentos de servicio tecnicomecanico";
	return info;


	}

	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param placa the selection variable of the placa. placa!= null. 
	 */
	public void setAdicionalCost(double add) {
		this.adicionalCost = add;
	}

	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param placa the selection variable of the placa. placa!= null. 
	 */
	public void setUseddiscount(double dis) {
		this.useddiscount = dis;
	}

	 /** 
	 * will retur active documnet <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param active the selection variable of the active. active != null. 
	 */
	public boolean ActiveSoat() {
		SOAT current;
		boolean active = false;
		current = soats;
		
		if(current != null) {
					  
			while (current != null){
				if (current.getStatus())
					active = current.getStatus();
					current = (SOAT) current.getNext();
			}
		}
		return active;
	}	
	
	 /** 
	 * will retur active documnet <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param active the selection variable of the active. active != null. 
	 */
	public boolean ActiveMechanicSer() {
		MechanicService current;
		boolean active = false;
		current = mechanicServices;
		
		if(current != null) {
					  
			while (current != null){
				if (current.getStatus())
					active = current.getStatus();
					current = (MechanicService) current.getNext();
			}
		}

		
		return active;
	}	
	 /** 
	 * get the element that you selected<br> 
	 * <b>pre: </b>the variable to return must be entered <br> 
	 * <b>post: </b>get the object selected.
	 * @return Sales Price. 
	 */	
	public double getSalesPrice() {
		double price;
		price = getBasePrice() * (1 + adicionalCost);
		if (getUsed()) {price =  price * (1 - useddiscount);}
		if(!ActiveSoat()) {price += 500000;}
		if(!ActiveMechanicSer()) {price += 500000;}

		return price;
	}
	 /** 
	 * get the element that you selected<br> 
	 * <b>pre: </b>the variable to return must be entered <br> 
	 * <b>post: </b>get the object selected.
	 * @return soldStatus. 
	 */	
	public boolean getSoldStatus() {
		return soldStatus;
	}
	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param soldStatus the selection variable of the soldStatus. soldStatus != null. 
	 */
	public void setSoldStatus(boolean soldStatus) {
		this.soldStatus = soldStatus;
	}
	public Vehicle getLeft() {
		return left;
	}
	public void setLeft(Vehicle left) {
		this.left = left;
	}
	public Vehicle getRight() {
		return right;
	}
	public void setRight(Vehicle right) {
		this.right = right;
	}
	public Vehicle getParent() {
		return parent;
	}
	public void setParent(Vehicle parent) {
		this.parent = parent;
	}
    

}
