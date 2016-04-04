/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.DesignPrinciples.DIP.Adherence;

/**
 *
 * @author Chase
 */
public class Worker implements IWorker {
    
    public void work()
    {
        System.out.println("Adherence: Worker");
        System.out.println(" I am a normal worker");
    }
    
    
}
