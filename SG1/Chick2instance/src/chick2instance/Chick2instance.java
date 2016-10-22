/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chick2instance;

/**
 *
 * @author zoltaniszlai
 */
public class Chick2instance {
    private String name = "Fluffy";
    { System.out.println("setting field"); }
    public Chick2instance () {
        name = "Tiny";
        System.out.println("setting constructor");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chick2instance chick = new Chick2instance();
        System.out.println(chick.name);
    }
    
}
