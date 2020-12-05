package model;

public class Upholstery extends AdditionalServices{
	private String type;
	private String colour;
	/**
	 * Constructor of the class Upholstery<br>
	 * <b> pre: </b>
	 * <b> post: </b>New object create.
	 * @param id. identifier of the product. id != null.
	 * @param price price of the product. price 1= null.
	 * @param type of the product. type != null.
	 * @param colour of the product. color != null.
	 */
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
	@Override
	public String infoService() {
		String info = super.infoService();
		info += "Tipo: " + getType() + "\nColor: " + getColour() + "\n";
		return info;
	}
	

}
