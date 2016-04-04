/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.DesignPrinciples.SRP.Adherence;

/**
 *
 * @author Chase
 */
public class TestMail {
    
    public static void main (String []args)
    {
        IEmail mail = new Email();
        IContent details = new Email();
        
        mail.setSender("Chase");
        mail.setReceiver("Chane");
        
        System.out.println(details.returnAsString());
    }
    
}
