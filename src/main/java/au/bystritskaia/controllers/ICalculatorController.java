package au.bystritskaia.complex.controllers;

/**
 * Контроллер калькуляторов
 * @param <T> Числа для калькулятора
 */
public interface ICalculatorController<T> extends Runnable{

    /**
     * Выводит сумму
     * @param num1 Число 1
     * @param num2 Число 2
     */
    void printSum(T num1, T num2);

    /**
     * Выводит разницу
     * @param num1 Число 1
     * @param num2 Число 2
     */
    void printSub(T num1, T num2);

    /**
     * Выводит произведение
     * @param num1 Число 1
     * @param num2 Число 2
     */
    void printMul(T num1, T num2);

    /**
     * Выводит частное
     * @param num1 Число 1
     * @param num2 Число 2
     */
    void printDiv(T num1, T num2);

}
