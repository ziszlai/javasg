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
public class CalculateHelper {
   private static final char ADD_SYMBOL = '+';
   private static final char SUBSTRACT_SYMBOL = '-';
   private static final char MULTIPLY_SYMBOL = '*';
   private static final char DIVIDE_SYMBOL = '/';
   
   MathCommand command;
   
   double leftValue;
   double rightValue;
   double result;
   
   public void process(String statement) {
       String[] parts = statement.split(" ");
       String commandString = parts[0];
       leftValue = Double.parseDouble(parts[1]);
       rightValue = Double.parseDouble(parts[2]);
       
       setCommandFromString(commandString);
       
       CalculateBase calculator = null;
       
       switch(command) {
           case Add:
               calculator = new Adder(leftValue, rightValue);
               break;
           case Substract:
               calculator = new Subtracter(leftValue, rightValue);
               break;
           case Multiply:
               calculator = new Multiplier(leftValue, rightValue);
               break;
           case Divide:
               calculator = new Divider(leftValue, rightValue);
               break;
       }
       calculator.calculate();
       result = calculator.getResult();
   }
   
   private void setCommandFromString(String commandString) {
       if (commandString.equalsIgnoreCase(MathCommand.Add.toString())) {
           command = MathCommand.Add;
       } else if (commandString.equalsIgnoreCase(MathCommand.Substract.toString())) {
           command = MathCommand.Substract;
       } else if (commandString.equalsIgnoreCase(MathCommand.Multiply.toString())) {
           command = MathCommand.Multiply;
       } else if (commandString.equalsIgnoreCase(MathCommand.Divide.toString())) {
           command = MathCommand.Divide;
       }
   }
   
   @Override
   public String toString() {
       char symbol = ' ';
       switch (command) {
           case Add:
               symbol = ADD_SYMBOL;
               break;
            case Substract:
               symbol = SUBSTRACT_SYMBOL;
               break;
            case Multiply:
               symbol = MULTIPLY_SYMBOL;
               break;
            case Divide:
               symbol = DIVIDE_SYMBOL;
               break;
       }
       
       //StringBuilder sb = new StringBuilder(20);
       
       /*sb.append(leftValue);
       sb.append(' ');
       sb.append(symbol);
       sb.append(' ');
       sb.append(rightValue);
       sb.append(" = ");
       sb.append(result);*/
       return String.format("%.2f %c %.2f = %.2f", leftValue, symbol, rightValue, result);
       //return sb.toString();
   }
}
