package activities;

public class Activity7 {
	
	public static void main(String[] args) {
        
        MountainBike mountainBike = new MountainBike(5, 20, 30);

        System.out.println("Initial Bicycle Details:");
        mountainBike.bicycleDesc();  
        
        mountainBike.speedUp(10);  
     
        mountainBike.applyBrake(5);  

        mountainBike.setHeight(35);  
    }

}
