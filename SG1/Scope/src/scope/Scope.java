/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scope;

/**
 *
 * @author zoltaniszlai
 */
public class Scope {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String one, two;
        
        one = new String("a");
        two = new String("b");
        one = two; // Garbage collector kicks in
        String three = one;
        one = null;
    }
    
}
