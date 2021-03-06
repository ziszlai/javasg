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
public final class Passager extends Person implements Comparable<Passager> {
    private final int freeBags;
    private int checkedBags;
    private double perBagFee;
    int passengers;
    public static class RewardProgram {
        private int memberLevel;
        private int memberDays;
        
        public int getLevel() { return memberLevel; }
        public void setLevel(int level) { this.memberLevel = level; }
        
        public int getMemberDays() { return memberDays; }
        public void setMemberDays(int memberDays) { this.memberDays = memberDays; }
    };
   
    private RewardProgram rewardProgram = new RewardProgram();
    public RewardProgram getRewardProgram() {
        return rewardProgram;
    }
    
    @Override
    public int compareTo(Passager p) {
        if (rewardProgram.memberLevel > p.rewardProgram.memberLevel)
            return -1;
        else if (rewardProgram.memberLevel < p.rewardProgram.memberLevel)
            return 1;
        else {
            if (rewardProgram.memberDays > p.rewardProgram.memberDays)
                return -1;
            else if (rewardProgram.memberDays < p.rewardProgram.memberDays)
                return 1;
            else
                return 0;
        }
    }

    public int getCheckedBags() { return checkedBags; }
    public Passager() {
        this.freeBags = 0;
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
        this();
        this.perBagFee = perBagFee;
    }
}
