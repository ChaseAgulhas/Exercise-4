/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.DesignPrinciples.OCP.Violation;

/**
 *
 * @author Chase
 */
public class GraphicEditor {
    
    public void drawShape(Shape s)
    {
        if( s.type == 1)
        {
            drawCircle();
        }
        else if( s.type == 2 )
        {
            drawSquare();
        }
        else
        {
            System.out.println("No type was chosen");
        }
    }
    public void drawCircle()
    {
        System.out.println("");
        System.out.println("This is the circle object drawn in bad design practices");
        System.out.println("");
    }
    public void drawSquare()
    {
        System.out.println("");
        System.out.println("This is the square object in bad design practices");
        System.out.println("");
    }
    
}
