package au.bystritskaia;

import au.bystritskaia.controllers.ICalculatorController;
import au.bystritskaia.controllers.complex.ComplexCalculatorController;
import au.bystritskaia.models.Complex;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ICalculatorController<Complex> controller = new ComplexCalculatorController();
        controller.run();
    }
}
