/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addnumbersfromfile;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author zoltaniszlai
 */
public class AddNumbersFromFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total = 0;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\Numbers.txt"));
            String line = null;

            while ((line = reader.readLine()) != null)
                    total += Integer.valueOf(line);
            System.out.println("Total: " + total);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
}
