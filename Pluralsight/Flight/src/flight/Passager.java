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
public final class Passager implements Comparable<Passager> {
    private final int freeBags;
    private int checkedBags;
    private double perBagFee;
    int passengers;
    private int memberLevel;
    private int memberDays;
   
    @Override
    public int compareTo(Passager p) {
        if (memberLevel > p.memberLevel)
            return -1;
        else if (memberLevel < p.memberLevel)
            return 1;
        else {
            if (memberDays > p.memberDays)
                return -1;
            else if (memberDays < p.memberDays)
                return 1;
            else
                return 0;
        }
    }

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
