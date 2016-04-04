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
public class TestShape {
    
     public static Shape returnSquare()
     {
        return new Square();
     }
    private static Shape returnRect()
    {
        return new Rectangle();
     }
    public static void main(String []args)
    {
        Shape s = TestShape.returnSquare();
        Shape r = TestShape.returnRect();
        s.displayArea();
        r.displayArea();
    }
}
