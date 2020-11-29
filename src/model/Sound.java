package model;

public class Sound  extends AdditionalServices{
private String typeOfSound;
private int numberOfSpeakers;
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

}
