package model;

import java.util.*;

public abstract class Car extends Vehicle {
	/**
	 * 
	 */

	private  String type;
	private int numberOfDoors;
	private boolean polarizado;
  
	
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
 	 * @param type the selection variable of the type. type !=null.
 	 * @param numberOfDoors the selection variable of the number Of Doors. numberOfDoors !=null.
 	 * @param polarizado the selection variable of the polarizado. polarizado !=null.
 	 */	
	public Car (float totalPrice,float BasePrice, String mark, int model, int cilindraje, 
			int mileaje, boolean used, String placa, String type, int numberOfDoors, boolean polarizado) {
		super(totalPrice, BasePrice, mark, model, cilindraje, mileaje, used, placa);
		this.type = type;
		this.numberOfDoors = numberOfDoors;
		this.polarizado = polarizado;
  }

	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return type. 
 	 */	
	public String getType() {
		return type;
	}
	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param type the selection variable of the type. type != null. 
	 */
	public void setType(String type) {
		this.type = type;
	}
	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return polarizado. 
 	 */	
	public boolean getPolarizado() {
		return polarizado;
	}
	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param polarizado the selection variable of the polarizado. polarizado!= null. 
	 */
	public void setPolarizado(boolean polarizado) {
		this.polarizado = polarizado;
	}
	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return numberOfDoors. 
 	 */	
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param numberOfDoors the selection variable of the number of Doors. numberOfDoors!= null. 
	 */
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	/** 
	* Accumulates the data in a chain of information <br> 
	* <b>pre: </b>The required parameter cannot be null <br> 
	* <b>post: </b>returns a string of accumulated information. 
	* @return basicInfo. 
	*/
	  @Override
	  public String basicInfo() {
		String basicInfo = super.basicInfo();
		 basicInfo+="\nTipo de carro: " +getType() +  "\nPolarizado: " +  getPolarizado() + 
				 "\nNumero de puertas: " +  getNumberOfDoors();
		 return basicInfo;
	  }
	  

}
