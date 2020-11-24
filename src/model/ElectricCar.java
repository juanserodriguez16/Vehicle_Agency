package model;

import java.util.ArrayList;

public class ElectricCar extends Car implements BateryConsumeCalculable{
	
	private String ChargerType;
	private int batteryLife;
	private double batteryConsume;
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
	 * @param ChargerType the selection variable of the Charger Type. ChargerType !=null.
	 * @param batteryLife the selection variable of the battery Life. batteryLife !=null.
	 */	
	public ElectricCar(float totalPrice, float BasePrice, String mark, int model, int cilindraje, int mileaje,
			boolean used, String placa, String type, int numberOfDoors, boolean polarizado, String ChargerType,
			int batteryLife) {
		super(totalPrice, BasePrice, mark, model, cilindraje, mileaje, used, placa, type, numberOfDoors, polarizado);
		this.ChargerType = ChargerType;
		this.batteryLife = batteryLife;
		this.batteryConsume = calculateBatteryConsume(batteryLife, cilindraje);
		setAdicionalCost (0.2);
		setUseddiscount ( 0.1);
  }
	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return chargeType. 
 	 */	
	public String getChargerType() {
		return ChargerType;
	}
	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param chargerType the selection variable of the charger Type. chargerType != null. 
	 */
	public void setChargerType(String chargerType) {
		this.ChargerType = chargerType;
	}
	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return batteryConsume. 
 	 */	
	public double getBatteryConsume() {
		return batteryConsume;
	}
	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param batteryConsume the selection variable of the battery Consume. batteryConsume != null. 
	 */
	public void setBatteryConsume(double batteryConsume) {
		this.batteryConsume = batteryConsume;
	}
	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return batteryLife. 
 	 */	
	public int getBatteryLife() {
		return batteryLife;
	}
	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param batteryLife the selection variable of the battery Life. batteryLife != null. 
	 */
	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}
	/** 
	* Modify a variable and return the modified variable <br> 
	* <b>pre: </b>The required parameter cannot be null <br> 
	* <b>post: </b>Return the modified variable. 
	* @return batteryConsume.
	* @param batteryLife the selection variable of the batteryLife. batteryLife != null.
	* @param cilindraje the selection variable of the cilindraje. cilindraje != null.  
	*/
	  @Override
	public double calculateBatteryConsume(int batteryLife, int cilindraje) {
		batteryConsume = getBatteryLife()*(getCilindraje()/100);
		return batteryConsume;
		
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
		 basicInfo+="\nTipo de cargador: " +getChargerType() +  "\nCapacidad de bateria: " +  getBatteryLife() + 
				 "\nConsumo de bateria por kilometro: " +  getBatteryConsume();
		 return basicInfo;
	  }
}
