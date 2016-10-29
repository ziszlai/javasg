/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcengine;

/**
 *
 * @author zoltaniszlai
 */
public class DynamicHelper {
    private MathProcessing[] handlers;
    
    public DynamicHelper (MathProcessing[] handlers) {
        this.handlers = handlers;
    }
    
    public String process (String statement) {
        String[] parts = statement.split(MathProcessing.SEPARATOR);
        String keyword = parts[0];
        
        MathProcessing theHandler = null;
        for(MathProcessing handler: handlers) {
            if (keyword.equalsIgnoreCase(handler.getKeyword())) {
                theHandler = handler;
                break;
            }
        }
        
        double leftVal = Double.parseDouble(parts[1]);
        double rightVal = Double.parseDouble(parts[2]);
        double result = theHandler.doCalculation(leftVal, rightVal);
        
        return String.format("%.2f %c %.2f = %.2f", leftVal, theHandler.getSymbol(), rightVal, result);
       
    }
}
