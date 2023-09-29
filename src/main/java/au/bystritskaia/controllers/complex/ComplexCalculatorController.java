package au.bystritskaia.complex.controllers.complex;

import au.bystritskaia.complex.controllers.ICalculatorController;
import au.bystritskaia.complex.models.complex.Complex;
import au.bystritskaia.complex.services.ICalculatorService;
import au.bystritskaia.complex.services.complex.ComplexCalculatorService;

/**
 * Контроллер калькулятора комплексных чисел
 */
public class ComplexCalculatorController implements ICalculatorController<Complex> {
    /**
     * Сервис калькулятора комплексных чисел
     */
    private final ICalculatorService<Complex> service = new ComplexCalculatorService();


    /**
     * Выводит сумму
     *
     * @param num1 Число 1
     * @param num2 Число 2
     */
    public void printSum(Complex num1, Complex num2) {
        System.out.println("Сумма комплексных чисел: " + this.service.add(num1, num2));
    }

    /**
     * Выводит разницу
     *
     * @param num1 Число 1
     * @param num2 Число 2
     */
    public void printSub(Complex num1, Complex num2) {
        System.out.println("Разница комплексных чисел: " + this.service.sub(num1, num2));
    }

    /**
     * Выводит произведение
     *
     * @param num1 Число 1
     * @param num2 Число 2
     */
    public void printMul(Complex num1, Complex num2) {
        System.out.println("Произведение комплексных чисел: " + this.service.mul(num1, num2));
    }

    /**
     * Выводит частное
     *
     * @param num1 Число 1
     * @param num2 Число 2
     */
    public void printDiv(Complex num1, Complex num2) {
        System.out.println("Частное комплексных чисел: " + this.service.div(num1, num2));
    }

    /**
     * Runs this operation.
     */
    public void run() {

    }
}
