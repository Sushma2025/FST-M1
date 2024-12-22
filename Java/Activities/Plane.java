package activities;

import java.util.ArrayList;
import java.util.Date;

public class Plane {
	private int maxPassengers;
    private ArrayList<String> passengers;
    private Date lastTimeLanded;

    // Constructor to initialize maxPassengers and passengers array
    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }
    
    public void onboard(String passenger) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passenger);
        } else {
            System.out.println("Cannot add more passengers. The plane is full.");
        }
    }
    
    public Date takeOff() {
        return new Date(); // Current date and time of takeoff
    }
    
    public void land() {
        lastTimeLanded = new Date(); // Set the current date and time as landing time
        passengers.clear(); // Clear the list of passengers
    }
    
    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }
    
    public ArrayList<String> getPassengers() {
        return passengers;
    }
    
    
}

