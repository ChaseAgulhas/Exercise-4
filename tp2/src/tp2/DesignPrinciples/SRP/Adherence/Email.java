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
public class Email implements IEmail, IContent {
    
    private String sName;
    private String  rName;
    private IContent details;
   
    @Override
    public void setSender(String sender)
    {
        sName = sender;
    }
    @Override
    public void setReceiver(String receiver)
    {
        rName = receiver;
    }

    @Override
    public void setContent(IContent content)
    {
        details = content;
    }
    
    public String displaySender()
    {
        return sName;
    }
    
    @Override
    public String returnAsString()//used for serialization
    {
        return "\nThis email contains certain serialized content for : " + displaySender() + rName;
    }
}
