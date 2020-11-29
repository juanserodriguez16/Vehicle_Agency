package model;

public abstract class AdditionalServices {
	private int id;
	private int price;
	private AdditionalServices next;
	private AdditionalServices prev;
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
	

}
