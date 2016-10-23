/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floatsum;

/**
 *
 * @author zoltaniszlai
 */
public class FloatSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float[] theVals = { 10.0f, 20.0f, 15.0f };
        float sum = 0.0f;
        
        for(float currentVal : theVals) {
            sum += currentVal;
        }
        System.out.println(sum);
    }
    
}
