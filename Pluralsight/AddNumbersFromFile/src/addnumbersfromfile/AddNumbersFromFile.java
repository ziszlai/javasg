/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addnumbersfromfile;

import java.io.*;

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
        } catch (NumberFormatException e){
            System.out.println("Invalid type: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error interacting with file: " + e.getMessage());
        }  catch (Exception e) {
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
