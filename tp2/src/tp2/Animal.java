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
 public abstract class Animal {
    
    private String name;
    
    public Animal(String name)
    {
        this.name = name;
    }
    
    public void myNameIs()
    {
        System.out.println("My name is " + name);
    }
    
    abstract public void move();
    
    
}
