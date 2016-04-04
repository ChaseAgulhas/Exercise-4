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
public class TestWorkers {
    public static void main (String[] args)
    {
        Worker person1 = new Worker();
        SuperWorker person2 = new SuperWorker();
        Robot aIPerson = new Robot();
        
        person1.eat();
        person1.work();
        
        person2.eat();
        person2.work();
        
        aIPerson.work();
        
    } 
}
