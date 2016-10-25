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
public class Passager {
    private int freeBags;
    private int checkedBags;
    private double perBagFee;

    public int getCheckedBags() { return checkedBags; }
    public Passager() {
        
    }
    public Passager(int freeBags) {
        this(freeBags > 1? 25.0d: 50.0d);
        this.freeBags = freeBags;
    }
    
    public Passager(int freeBags, int checkedBags) {
        this(freeBags);
        this.checkedBags = checkedBags;
    }
    
    private Passager (double perBagFee) {
        this.perBagFee = perBagFee;
    }
}
