/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.DesignPrinciples.OCP.Adherence;

/**
 *
 * @author Chase
 */
public class TestGraphicEditor  {
    public static void main (String [] args)
    {
        GraphicEditor painter = new GraphicEditor();
        Shape s = new Square();
        Shape c = new Circle();
        painter.displayShape(s);
        painter.displayShape(c);
        
        
    }
}
