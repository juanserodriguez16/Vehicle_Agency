package model;

public class Upholstery extends AdditionalServices{
	private String type;
	private String colour;
	public Upholstery(int id, int price, String type, String colour) {
		super(id, price);
		this.type = type;
		this.colour = colour;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	

}
