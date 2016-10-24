/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flight;

/**
 *
 * @author zoltaniszlai
 */
public class Flight {
    private int passengers;
    private int seats;

    public Flight() {
        seats = 150;
        passengers = 0;
    }
    
    public void add1Passenger() {
        if (passengers < seats)
            passengers += 1;
        else
            handleTooMany();
    }
    
    private void handleTooMany() {
        System.out.println("Too many");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
