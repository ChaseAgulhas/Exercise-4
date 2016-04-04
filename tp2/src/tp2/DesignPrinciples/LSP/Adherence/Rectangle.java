/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.DesignPrinciples.LSP.Adherence;

/**
 *
 * @author Chase
 */
public class Rectangle extends Shape {
     int width = 8;
     int breadth = 7;
 
    public int displayWidth()
    {
        return width;
    }
    
    public int displayBreadth()
    {
        return breadth;
    }
    public void displayArea()
    {
        System.out.println("The area of the rectangle is: " + width*breadth);
    }

}
