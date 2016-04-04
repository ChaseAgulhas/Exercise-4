/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.DesignPrinciples.PLK.Violation;

/**
 *
 * @author Chase
 */
public class TestSums {
    private static int add(int a, int b)
        {
            return a+b;
        }
    private static int subtract(int a, int b)
        {
            return a-b;
        }
    
    public static void main (String []args)
    {
        System.out.println(add(2,2));
        System.out.println(subtract(5,2));
    }
    
}
