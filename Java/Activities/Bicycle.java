package activities;

public class Bicycle implements BicycleParts, BicycleOperations{
	 int gears;
	 int currentSpeed;
	 
	 public Bicycle(int gears, int currentSpeed) {
	        this.gears = gears;
	        this.currentSpeed = currentSpeed;
	    }
	 
	 public void applyBrake(int decrement) {
	        currentSpeed -= decrement;
	        System.out.println("Current speed after applying brake: " + currentSpeed);
	    }
	 
	 public void speedUp(int increment) {
	        currentSpeed += increment;
	        System.out.println("Current speed after speeding up: " + currentSpeed);
	    }
	 
	 public void bicycleDesc() {
	        System.out.println("Number of gears: " + gears);
	        System.out.println("Max speed: " + maxSpeed);
	    }

}


