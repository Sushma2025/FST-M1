package activities;

import java.util.Date;

public class Activity6 {
	public static void main(String[] args) throws InterruptedException {
        // Create an object of Plane class with a maximum of 10 passengers
        Plane plane = new Plane(10);
        
        // Add passengers to the plane
        plane.onboard("John Doe");
        plane.onboard("Jane Smith");
        plane.onboard("Alice Johnson");
        plane.onboard("Bob Brown");
        plane.onboard("Charlie White");
        
        // Print take-off time
        Date takeOffTime = plane.takeOff();
        System.out.println("Take-off time: " + takeOffTime);

        // Print the list of passengers
        System.out.println("Passengers on board: " + plane.getPassengers());

        // Emulate the plane being in flight for 5 seconds
        Thread.sleep(5000); // Pause for 5 seconds

        // Land the plane
        plane.land();

        // Print the landing time
        System.out.println("Landing time: " + plane.getLastTimeLanded());

        // Print the list of passengers after landing (it should be empty)
        System.out.println("Passengers after landing: " + plane.getPassengers());
    }
}
