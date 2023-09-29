package au.bystritskaia.services.complex;

import au.bystritskaia.models.Complex;
import au.bystritskaia.services.ICalculatorService;

public class ComplexCalculatorService implements ICalculatorService<Complex> {


    /**
     * Сумма.
     *
     * @param num1 1 число
     * @param num2 2 число
     * @return Результат
     */
    public Complex add(Complex num1, Complex num2) {
        double real = num1.getReal() + num2.getReal();
        double image = num1.getImage() + num2.getImage();
        return new Complex(real, image);
    }

    /**
     * Разница.
     *
     * @param num1 1 число
     * @param num2 2 число
     * @return Результат
     */
    public Complex sub(Complex num1, Complex num2) {
        double real = num1.getReal() - num2.getReal();
        double image = num1.getImage() - num2.getImage();
        return new Complex(real, image);
    }

    /**
     * Умница.
     *
     * @param num1 1 число
     * @param num2 2 число
     * @return Результат
     */
    public Complex mul(Complex num1, Complex num2) {
        double real = num1.getReal() * num2.getReal();
        double image = num1.getImage() * num2.getImage();
        return new Complex(real, image);
    }

    /**
     * Деление.
     *
     * @param num1 1 число
     * @param num2 2 число
     * @return Результат
     */
    public Complex div(Complex num1, Complex num2) {
        double real = num1.getReal() / num2.getReal();
        double image = num1.getImage() / num2.getImage();
        return new Complex(real, image);
    }
}
