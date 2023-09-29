package au.bystritskaia.complex.services.complex;

import au.bystritskaia.complex.models.complex.Complex;
import au.bystritskaia.complex.services.ICalculatorService;

public class ComplexCalculatorService implements ICalculatorService<Complex> {


    /**
     * Сумма.
     *
     * @param num1 1 число
     * @param num2 2 число
     * @return Результат
     */
    public String add(Complex num1, Complex num2) {
        double real = num1.getReal() + num2.getReal();
        double image = num1.getImage() + num2.getImage();
        return new Complex(real, image).toString();
    }

    /**
     * Разница.
     *
     * @param num1 1 число
     * @param num2 2 число
     * @return Результат
     */
    public String sub(Complex num1, Complex num2) {
        return null;
    }

    /**
     * Умница.
     *
     * @param num1 1 число
     * @param num2 2 число
     * @return Результат
     */
    public String mul(Complex num1, Complex num2) {
        return null;
    }

    /**
     * Деление.
     *
     * @param num1 1 число
     * @param num2 2 число
     * @return Результат
     */
    public String div(Complex num1, Complex num2) {
        return null;
    }
}
