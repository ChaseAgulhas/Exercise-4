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
public interface IEmail {
    
    public abstract void setSender(String sender);
    public abstract void setReceiver(String receiver);
    public abstract void setContent(IContent content);

}
