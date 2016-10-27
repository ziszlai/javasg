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
public class Crewmember {
    private FlightCredJob job;
    public Crewmember(FlightCredJob job) {
        this.job = job;
    }
    
    public void setJob(FlightCredJob job) {
        this.job = job;
    }
}
