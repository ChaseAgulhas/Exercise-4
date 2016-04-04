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
public class TestGraphicalEditor {
    public static void main (String [] args)
    {

        GraphicEditor painter = new GraphicEditor();
        Shape c = new Circle();
        Shape s = new Square();
        
        
        painter.drawShape(c);
        painter.drawShape(s);
        
    }
}
