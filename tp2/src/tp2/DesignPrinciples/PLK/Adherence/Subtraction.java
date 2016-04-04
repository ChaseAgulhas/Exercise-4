/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.DesignPrinciples.PLK.Adherence;

/**
 *
 * @author Chase
 */
public class Subtraction extends Summutation {
    
    private int num1;
    private int num2;
    
    public Subtraction(int a, int b)
    {
        
        if (a > 0)
        {
            num1 = a;
            num2 = b;
        }
        
        else
            System.out.println("ERROR: Number 1 cannot be less than or equal to 0.");
        
    }
    
    @Override
    public int calc()
    {
        return num1-num2;
    }
}
