package model;

public class Wheels extends AdditionalServices{
private int size;
private String material;
/**
 * Constructor of the class wheels<br>
 * <b> pre: </b>
 * <b> post: </b>New object create.
 * @param id. identifier of the product. id != null.
 * @param price price of the product. price 1= null.
 * @param size of the wheel. size 1= null.
 * @param material of the wheel. material != null.
 */
	public Wheels(int id, int price, int size, String material) {
		super(id, price);
		this.size = size;
		this.material = material;
		
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public String infoService() {
		String info = super.infoService();
		info += "Tamaño : " + getSize() + "\nMaterial: " + getMaterial() + "\n";
		return info;
	}

}
