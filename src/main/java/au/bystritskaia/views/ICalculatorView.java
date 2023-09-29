package au.bystritskaia.complex.views;

import au.bystritskaia.complex.views.enums.Command;

/**
 * Вью калькулятора
 */
public interface ICalculatorView {
    /**
     * Получает результат операции
     */
    void printResult(Command command, double num1, double num2);

    /**
     * Получает первое число
     * @return 
     */
    double getFirstNumCommand();

    double getSecondNumCommand();

    String getLangCommand();

}
