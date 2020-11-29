package model;

public class Wheels extends AdditionalServices{
private int size;
private String material;

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

}
