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
public class TestWorkers {
    
    public static void main (String []args)
    {
            
        Worker normal = new Worker();
        SuperWorker sWorker = new SuperWorker();
        normal.work();
        sWorker.superWorkerWork();
    }


}
