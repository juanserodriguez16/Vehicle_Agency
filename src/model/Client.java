package model;

public class Client {
	private String name;
	private String lastName;
	private int cedula;
	private int phone;
	private String email;
	private Client left;
	private Client right;
	private Client parent;
	
	 /** 
	 * will transform the parameters into a variables of this class and create type of object <br> 
	 * <b>pre: </b> the parameters cannot be null<br> 
	 * <b>post: </b>transform the parameter to a variable of this class and create a object. 
	 * @param name the selection variable of the name. name!= null. 
	 * @param lastName the selection variable of the lastName. lastName!=null.
	 * @param cedula the selection variable of the cedula. cedula!=null.
	 * @param phone the selection variable of the phone. phone != null. 
	 * @param email the selection variable of the email. email !=null.
	 * @param seller the selection variable of the seller. seller!=null.
	 */
	public Client (String name, String lastName, int cedula, int phone, String email) {
		this.name = name;
		this.lastName = lastName;
		this.cedula = cedula;
		this.phone = phone;
		this.email = email;
		this.parent = null;
		this.left = null;
		this.right = null;

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
	 * @return lastname. 
	 */	
	public String getLastName() {
		return lastName;
	}
	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param lastName the selection variable of the last Name. lastName != null. 
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	 /** 
	 * get the element that you selected<br> 
	 * <b>pre: </b>the variable to return must be entered <br> 
	 * <b>post: </b>get the object selected.
	 * @return cedula. 
	 */	
	public int getCedula() {
		return cedula;
	}
	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param cedula the selection variable of the cedula. cedula != null. 
	 */
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	 /** 
	 * get the element that you selected<br> 
	 * <b>pre: </b>the variable to return must be entered <br> 
	 * <b>post: </b>get the object selected.
	 * @return phone. 
	 */	
	public int getPhone() {
		return phone;
	}
	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param phone the selection variable of the phone. phone != null. 
	 */
	public void setPhone(int phone) {
		this.phone = phone;
	}
	 /** 
	 * get the element that you selected<br> 
	 * <b>pre: </b>the variable to return must be entered <br> 
	 * <b>post: </b>get the object selected.
	 * @return email. 
	 */	
	public String getEmail() {
		return email;
	}
	 /** 
	 * will transform the parameter into a variable of this class <br> 
	 * <b>pre: </b>The required parameter cannot be null <br> 
	 * <b>post: </b>transform the parameter to a variable of this class. 
	 * @param email the selection variable of the email. email != null. 
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/** 
	* Accumulates the data in a chain of information <br> 
	* <b>pre: </b>The required parameter cannot be null <br> 
	* <b>post: </b>returns a string of accumulated information. 
	* @return info. 
	*/
	public String infoClient() {
		String infoClient = "Nombre: " +getName() +  "\nApellido: " + getLastName() + "\nCedula: "
				+ getCedula() +  "\nTelefono: " + getPhone() + "\nE-mail: "+ getEmail();
		return infoClient;
	}
	public Client getLeft() {
		return left;
	}
	public void setLeft(Client left) {
		this.left = left;
	}
	public Client getRight() {
		return right;
	}
	public void setRight(Client right) {
		this.right = right;
	}
	public Client getParent() {
		return parent;
	}
	public void setParent(Client parent) {
		this.parent = parent;
	}
}