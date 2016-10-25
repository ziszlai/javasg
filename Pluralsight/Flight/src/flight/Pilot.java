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
public abstract class Pilot {
    private Flight currentFlight;
    
    public void fly(Flight f) {
        if (canAccept(f))
            currentFlight = f;
        else
            handleCantAccept();
    }
    
    public abstract boolean canAccept(Flight f);
    
    public void handleCantAccept() {
        System.out.println("Can't accept");
    }
}
