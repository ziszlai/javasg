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
public class CargoFlight extends Flight {
    float maxCargoSpace = 1000.0f;
    float usedCargoSpace;
    
    @Override
    int getSeats() { return 12; }
    
    public CargoFlight() {
    }
    
    public CargoFlight(int flightNumber) {
        super(flightNumber);
    }
    
    public CargoFlight(int flightNumber, float maxCargoSpace) {
        this(flightNumber);
        this.maxCargoSpace = maxCargoSpace;
    }
    
    public CargoFlight(float maxCargoSpace) {
        this.maxCargoSpace = maxCargoSpace;
    }
    
    public final void add1Package(float h, float w, float d) {
        double size = h * w * d;
        if (hasCargoSpace(size))
            usedCargoSpace += size;
        else
            handleNoSpace();
    }
    
    private boolean hasCargoSpace(double size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }
    
    private void handleNoSpace() {
        System.out.println("Not enought space");
    }
}
