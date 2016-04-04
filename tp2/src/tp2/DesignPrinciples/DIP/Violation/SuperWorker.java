/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.DesignPrinciples.DIP.Violation;

/**
 *
 * @author Chase
 */
public class SuperWorker {
    
    Worker worker = new Worker();
    
    public void superWorkerWork()
    {
        System.out.println("Violation Super Worker");
        worker.work();
        
    }
}
