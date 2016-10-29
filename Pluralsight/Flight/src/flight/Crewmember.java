/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flight;

import java.io.*;

/**
 *
 * @author zoltaniszlai
 */
public class CrewMember extends Person {
    private static final String FILENAME = "C:\\FlightCrew.txt";
    private FlightCredJob job;
    private static CrewMember[] pool;
    private String name;
    public static CrewMember FindAvailable(FlightCredJob job) {
        CrewMember cm = null;
        for (int i = 0; i < pool.length; i++) {
            if (pool[i] != null && pool[i].job == job) {
                cm = pool[i];
                pool[i] = null;
                break;
            }
        }
        return cm;
    }
    static {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(FILENAME));
            String line = null;
            int idx = 0;
            pool = new CrewMember[10];
            while((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                FlightCredJob job = FlightCredJob.valueOf(parts[0]);

                pool[idx] = new CrewMember(job);
                pool[idx].setName(parts[1]);
                idx++;
            }
        } catch (IOException e){
            System.out.println("File exception: " + e.getMessage());
        }
    }
    public CrewMember(FlightCredJob job) {
        this.job = job;
    }
    
    public void setJob(FlightCredJob job) {
        this.job = job;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
