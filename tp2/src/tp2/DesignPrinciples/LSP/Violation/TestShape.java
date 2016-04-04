/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.DesignPrinciples.LSP.Violation;

/**
 *
 * @author Chase
 */
public class TestShape {
    
      public static Rectangle returnSquare()
     {
        return new Square();
     }
    private static Rectangle returnRect()
    {
        return new Rectangle();
     }
    public static void main(String []args)
    {
        Rectangle s = TestShape.returnSquare();
        Rectangle r = TestShape.returnRect();
        s.displayArea();
        r.displayArea();
    }
    
}
