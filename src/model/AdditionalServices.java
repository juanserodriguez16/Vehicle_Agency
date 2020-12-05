package model;

import java.io.Serializable;

public abstract class AdditionalServices implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int price;
	private AdditionalServices next;
	private AdditionalServices prev;
/**
 * Constructor of the class sound<br>
 * <b> pre: </b>
 * <b> post: </b>New object create.
 * @param id. identifier of the product. id != null.
 * @param price price of the product. price 1= null.
 */
	public AdditionalServices(int id,int price) {
		this.id = id;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public AdditionalServices getNext() {
		return next;
	}
	public void setNext(AdditionalServices next) {
		this.next = next;
	}
	public AdditionalServices getPrev() {
		return prev;
	}
	public void setPrev(AdditionalServices prev) {
		this.prev = prev;
	}
	public String infoService() {
		String info = "";
		info += "Id: " + getId() + "\nPrecio: " + getPrice() + "\n";
		return info;
	}

}
