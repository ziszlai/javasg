/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flight;

import flight.Passager;

/**
 *
 * @author zoltaniszlai
 */
public class Flight {
    private int passengers, flightNumber, seats = 150;
    private char flightClass;
    private boolean[] isSeatAvailable;
    int totalCheckedBags;
    int maxCarryOns = seats * 2, totalCarryOns;
    {
        isSeatAvailable = new boolean[seats];
        for(int i = 0 ; i< seats; i++) {
            isSeatAvailable[i] = true;
        }
    }
    public Flight() {
    }
    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    
    public Flight(char flightClass) {
        this.flightClass = flightClass;
    }
    
    public void addPassengers(Passager[] list) {
        if (hasSeating(list.length)) {
            passengers += list.length;
            for(Passager passenger: list) {
                totalCheckedBags += passenger.getCheckedBags();
            }
        } else
            handleTooMany();
    }
    
    
    public int getSeats() {
        return seats;
    }
    
    public void setSeats(int seats) {
        this.seats = seats;
    }
    
    public void add1Passenger() {
        if (hasSeating())
            passengers += 1;
        else
            handleTooMany();
    }
    
    public void add1Passenger(int bags) {
        if (hasSeating()) {
            add1Passenger();
            totalCheckedBags += bags;
        }
    }
    public void add1Passenger(Passager p) {
        add1Passenger(p.getCheckedBags());
    }
    
    public void add1Passenger(int bags, int carryOns) {
        if (hasSeating() && hasCarryOnSpace(carryOns)) {
            add1Passenger(bags);
            totalCarryOns += carryOns;
        }
    }
    
    public void add1Passenger(Passager p, int carryOns) {
        add1Passenger(p.getCheckedBags(), carryOns);
    }
    
    private boolean hasSeating() {
        return passengers < seats;
    }
    
    private boolean hasSeating(int length) {
        return passengers < length;
    }
    
    private boolean hasCarryOnSpace(int carryOns) {
        return totalCarryOns + carryOns <= maxCarryOns;
    }
    
    private void handleTooMany() {
        System.out.println("Too many");
    }
    
    public boolean hasRoom(Flight f2) {
        int total = this.passengers + f2.passengers;
        return total <= seats;
    }
    public Flight createNewWithBoth(Flight f2) {
        Flight newFlight = new Flight();
        newFlight.seats = seats;
        newFlight.passengers = passengers + f2.passengers;
        return newFlight;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Flight lax1 = new Flight();
        Flight lax2 = new Flight();
        Flight lax3 = null;
        if (lax1.hasRoom(lax2)) {
            lax3 = lax1.createNewWithBoth(lax2);
        }
    }
   
}
