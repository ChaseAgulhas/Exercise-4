/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.DesignPrinciples.PLK.Adherence;

/**
 *
 * @author Chase
 */
public class TestSums {
    public static void main (String []args)
    {
        Addition add = new Addition(4, 4);
        System.out.println(add.calc());
        
        Subtraction sub = new Subtraction(4, 2);
        System.out.println(sub.calc());
        
    }
    
}
