/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

/**
 *
 * @author Chase
 */
public class Dog extends Animal{
    
    public Dog(String name)
    {
        super(name);
    }
    
    public void move()
    {
        super.myNameIs();
        System.out.println("I walk on all fours");
    }
}
