package model;

public class Sound  extends AdditionalServices{
private String typeOfSound;
private int numberOfSpeakers;
/**
 * Constructor of the class sound<br>
 * <b> pre: </b>
 * <b> post: </b>New object create.
 * @param id. identifier of the product. id != null.
 * @param price price of the product. price 1= null.
 * @param typeOfSound != null.
 * @param numberOfSpeakers 1= null.
 */
	public Sound(int id, int price, String typeOfSound, int numberOfSpeakers) {
		super(id, price);
		this.typeOfSound = typeOfSound;
		this.numberOfSpeakers = numberOfSpeakers;
		
	}
	public String getTypeOfSound() {
		return typeOfSound;
	}
	public void setTypeOfSound(String typeOfSound) {
		this.typeOfSound = typeOfSound;
	}
	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}
	public void setNumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}
	public String infoService() {
		String info = super.infoService();
		info += "Tipo de sonido: " + getTypeOfSound() + "\nNumero de bocinas: " + getNumberOfSpeakers() + "\n";
		return info;
	}
}
