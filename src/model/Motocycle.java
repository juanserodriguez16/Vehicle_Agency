package model;

public class Motocycle extends Vehicle implements GasolineConsumeCalculable{
	private String typeM;
	private int gasolineCapacity;
	private double gasolineConsume;
	public final static int ESTANDAR = 1;
	public final static int DEPORTIVA = 2;
	public final static int SCOOTER = 3;
	public final static int CROSS = 4;

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
 	 * @param typeM the selection variable of the type. typeM !=null.
 	 * @param gasolineCapacity the selection variable of the gasoline Capacity. gasolineCapacity !=null.
 	 */	
	public Motocycle(float totalPrice, float BasePrice, String mark, int model, int cilindraje, int mileaje,
			boolean used, String placa, String typeM, int gasolineCapacity ) {
		super(totalPrice, BasePrice, mark, model, cilindraje, mileaje, used, placa);
		this.typeM = typeM;
		this.gasolineCapacity =  gasolineCapacity;
		this.gasolineConsume = calculateGasolineConsume(gasolineCapacity, cilindraje);
		setAdicionalCost (0.04);
		setUseddiscount ( 0.02);
	  
  }
	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return typeM. 
 	 */	
	public String getTypeM() {
		return typeM;
	}
	/** 
	* will transform the parameter into a variable of this class <br> 
	* <b>pre: </b>The required parameter cannot be null <br> 
	* <b>post: </b>transform the parameter to a variable of this class. 
	* @param typeM the selection variable of the type. typeM != null. 
	*/
	public void setTypeM(String typeM) {
		this.typeM = typeM;
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
		 basicInfo+="\nTipo: " +getTypeM() +  "\nCapacidad de gasolina: " + getGasolineCapacity() + 
				 "\nConsumo de gasolina por kilometro: " +  getGasolineConsume();
		 return basicInfo;
	  }
}