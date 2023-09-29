package au.bystritskaia.controllers;

import au.bystritskaia.views.enums.Command;

/**
 * Контроллер калькуляторов
 * @param <T> Числа для калькулятора
 */
public interface ICalculatorController<T> extends Runnable{

    /**
     * Выводит результат после команды
     * @param command Команда
     * @param num1 1 число
     * @param num2 2 число
     */
    T printResult(Command command, T num1, T num2);

}
