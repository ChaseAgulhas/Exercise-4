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
public class Square extends Shape {
    
    int width = 8;
    int breadth = 8;
 
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
        System.out.println("The area of the square is: " + width*breadth);
    }
    
}
