package model;
import java.io.Serializable;
import java.util.*;
public abstract class Document implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private float price;
	private int year;
	private int [][] image; 
	final int SIZE = 4;
	private boolean status;
	final private int ACTUALYEAR = 2020;
	 /** 
	 * will transform the parameters into a variables of this class and create type of object <br> 
	 * <b>pre: </b> the parameters cannot be null<br> 
	 * <b>post: </b>transform the parameter to a variable of this class and create a object. 
	 * @param price the selection variable of the price. price!= null. 
	 * @param year the selection variable of the year. year!=null.
	 */
	public Document (float price, int year) {
		this.price = price;
		this.year = year;
		if (year == ACTUALYEAR
				) {
			this.status = true;
		}else
			this.status = false;
			
		image = getImage();
	}
	
	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return price. 
 	 */	
	public float getPrice() {
		return price;
	}
	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param price the selection variable of the price. price != null. 
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return image. 
 	 */	
	public int [][] getImage() {
		image = new int [SIZE][SIZE];
		Random rand  = new Random();
		for (int x=0; x < SIZE; x++) {
			  for (int y=0; y < SIZE; y++) {
			    image[x][y] = rand.nextInt(100);
			  }
			}
		
		return image;
	}
	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param image the selection variable of the image. image != null. 
	 */
	public void setImage(int [][] image) {
		this.image = image;
	}
	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return year. 
 	 */	
	public int getYear() {
		return year;
	}
	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param year the selection variable of the year. year != null. 
	 */
	public void setYear(int year) {
		this.year = year;
	}

	 /** 
 	 * get the element that you selected<br> 
 	 * <b>pre: </b>the variable to return must be entered <br> 
 	 * <b>post: </b>get the object selected.
 	 * @return status. 
 	 */	
	public boolean getStatus() {
		return status;
	}

	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param status the selection variable of the status. status != null. 
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
