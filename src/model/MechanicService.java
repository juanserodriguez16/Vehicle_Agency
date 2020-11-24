package model;

import java.text.DecimalFormat;

public class MechanicService extends Document {
	private float gasLevels;
	private String code;
	  private static DecimalFormat myFormatter;
	 /** 
	 * will transform the parameters into a variables of this class and create type of object <br> 
	 * <b>pre: </b> the parameters cannot be null<br> 
	 * <b>post: </b>transform the parameter to a variable of this class and create a object. 
	 * @param price the selection variable of the price. price!= null. 
	 * @param year the selection variable of the year. year!=null.
	 * @param gasLevels the selection variable of the gas Levels. gasLevels != null. 
	 */
	public MechanicService(float price, int year, float gasLevels) {
		super(price, year);
	this.gasLevels = gasLevels;
	this.code = generateCode();
	}
	public String Info() {
		 myFormatter = new DecimalFormat("###,###.###");
		String basicInfo = "Precio: " +  myFormatter.format(getPrice()) +  "\nAño: " + getYear() + "\nCodigo: "
	+ getCode() + "\nEmicion de gases: "
			+ getGasLevels();
		  return basicInfo;
	}
	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return code. 
 	 */	
	public String getCode() {
		return code;
	}
	/** 
	* will transform the parameter into a variable of this class <br> 
	* <b>pre: </b>The required parameter cannot be null <br> 
	* <b>post: </b>transform the parameter to a variable of this class. 
	* @param code the selection variable of the code. code != null. 
	*/
	public void setCode(String code) {
		this.code = code;
	}
    public String generateCode() {
    	String code = "";
    	for (int x=0; x < SIZE; x++) {
			code += (getImage()[0][x] + " ");   
			  
			}
    	for (int i = 0; i < SIZE; i++) {
    		code += (getImage()[i][SIZE-1-i] + " ");
    	}
    	for (int i = 0; i < SIZE; i++) {
    		code += (getImage()[SIZE -1][i] + " ");
    	}
    	return code;
    }
	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return gasLevels. 
 	 */	
	public float getGasLevels() {
		return gasLevels;
	}
	/** 
	* will transform the parameter into a variable of this class <br> 
	* <b>pre: </b>The required parameter cannot be null <br> 
	* <b>post: </b>transform the parameter to a variable of this class. 
	* @param gasLevels the selection variable of the gas Levels. gasLevels != null. 
	*/
	public void setGasLevels(float gasLevels) {
		this.gasLevels = gasLevels;
	}

	
}
