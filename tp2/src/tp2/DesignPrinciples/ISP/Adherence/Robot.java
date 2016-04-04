/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.DesignPrinciples.ISP.Adherence;

/**
 *
 * @author Chase
 */
public class Robot implements IWorkable {
    
    public void work()
    {
        System.out.println("Robot:");
        System.out.println("I work all day without eating.");
        System.out.println("");
    }
}
