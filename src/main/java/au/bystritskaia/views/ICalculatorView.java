package au.bystritskaia.views;

import au.bystritskaia.models.Number;
import au.bystritskaia.views.enums.Command;

import java.util.Scanner;

/**
 * Вью калькулятора
 */
public interface ICalculatorView {

    /**
     * Получает результат операции
     * @param command Команда
     * @param result Результат
     */
    void printResult(Command command, Number num1, Number num2, String result);

    /**
     * Получает следующее число
     */
    void getNextNumCommand();

    /**
     * Сообщение о вводе команды
     */
    void getCommand();

}
