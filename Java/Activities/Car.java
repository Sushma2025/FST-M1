package activities;

public class Car {
//defining variables
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
//constructors to initialize variables
	public Car(String color, String transmission, int make) {
		this.color= color;
		this.transmission=transmission;
		this.make=make;
		this.tyres=4; //default value
		this.doors=4; //default doors
	}

//define methods
	public void displayCharacteristics(){
		System.out.println("Car Color:" + color);
		System.out.println("Transmission:" + transmission);
		System.out.println("Make:" + make);
		System.out.println("Tyres:" + tyres);
		System.out.println("Doors:" + doors);
	}

	public void accelerate(){
		System.out.println("Car is moving forward.");
	}
	
	public void brake(){
		System.out.println("Car has Stopped.");
	}

}
