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
public class SuperWorker implements IWorker{
    
    public void work()
    {
        System.out.println("Adherence: Super worker");
        System.out.println("I work more than the normal worker");
    }
}
