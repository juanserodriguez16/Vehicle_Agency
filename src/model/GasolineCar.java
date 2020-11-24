package model;

import java.util.ArrayList;

public class GasolineCar extends Car implements GasolineConsumeCalculable{
	
	private String gasolineType;
	private int gasolineCapacity; 
	private double gasolineConsume;
	public final static int EXTRA = 1;
	public final static int CORRIENTE = 2;
	public final static int DIESEL = 3;
    
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
	 * @param gasolineType the selection variable of the gasoline Type. gasolineType !=null.
	 * @param gasolineCapacity the selection variable of the  gasolineCapacity. gasolineCapacity !=null.
	 */	
	
	public GasolineCar (float totalPrice, float BasePrice, String mark, int model, 
			int cilindraje, int mileaje, boolean used, String placa, String type, int numberOfDoors, 
			boolean polarizado, String gasolineType, int gasolineCapacity) {
		
		super(totalPrice, BasePrice, mark, model, cilindraje, mileaje, used, placa, type, numberOfDoors, polarizado);
		this.gasolineType = gasolineType;
		this.gasolineCapacity = gasolineCapacity;
		this.gasolineConsume = calculateGasolineConsume(gasolineCapacity, cilindraje);
		setAdicionalCost (0);
		setUseddiscount ( 0.1);
  }
	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return gasolineType. 
 	 */	
	public String getGasolineType() {
		return gasolineType;
	}

	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param gasolineType the selection variable of the gasoline Type. gasolineType != null. 
	 */
	public void setGasolineType(String gasolineType) {
		this.gasolineType = gasolineType;
	}

	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return gasolineCapacity. 
 	 */	
	public int getGasolineCapacity() {
		return gasolineCapacity;
	}

	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param gasolineCapacity the selection variable of the gasoline Capacity. gasolineCapacity != null. 
	 */
	public void setGasolineCapacity(int gasolineCapacity) {
		this.gasolineCapacity = gasolineCapacity;
	}

	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return gasolineConsume. 
 	 */	
	public double getGasolineConsume() {
		return gasolineConsume;
	}

	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param gasolineConsume the selection variable of the gasoline Consume. gasolineConsume != null. 
	 */
	public void setGasolineConsume(double gasolineConsume) {
		this.gasolineConsume = gasolineConsume;
	}

	/** 
	* Modify a variable and return the modified variable <br> 
	* <b>pre: </b>The required parameter cannot be null <br> 
	* <b>post: </b>Return the modified variable. 
	* @return gasolineConsume.
	* @param gasolineCapacity the selection variable of the gasolineCapacity. gasolineCapacity != null.
	* @param cilindraje the selection variable of the cilindraje. cilindraje != null.  
	*/
	@Override
	public double calculateGasolineConsume(int gasolineCapacity, int cilindraje) {
	gasolineConsume = getGasolineCapacity()*(getCilindraje()/100);
		return gasolineConsume;
		
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
		 basicInfo+="\nTipo de gasolina: " +getGasolineType() +  "\nCapacidad del tanque: " +  getGasolineCapacity() + 
				 "\nConsumo de gasolina por kilometro: " +  getGasolineConsume();
		 return basicInfo;
	  }
  
}
