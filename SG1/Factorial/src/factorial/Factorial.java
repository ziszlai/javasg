/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author zoltaniszlai
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int factorial = 1;
        int index = 5;
        while(index > 1) {
            factorial *= index--;
        }
        System.out.println(factorial);
    }
    
}
