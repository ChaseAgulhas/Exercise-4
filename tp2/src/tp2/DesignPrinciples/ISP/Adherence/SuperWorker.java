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
public class SuperWorker implements IWorkable, IFeedable{
    public  void work()
    {
        System.out.println("Super worker:");
        System.out.println(" I work more than the normal worker.");
        System.out.println("");
    }
    public  void eat()
    {
        System.out.println("");
        System.out.println(" I eat only during lunch time.");
        System.out.println("");
    }
    
}
