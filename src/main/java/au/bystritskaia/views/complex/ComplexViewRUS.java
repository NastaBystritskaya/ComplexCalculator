package au.bystritskaia.views.complex;

import au.bystritskaia.models.Number;
import au.bystritskaia.views.ICalculatorView;
import au.bystritskaia.views.enums.Command;

import java.util.Scanner;

public class ComplexViewRUS implements ICalculatorView {


    /**
     * Получает результат операции
     */
    @Override
    public void printResult(Command command, Number num1, Number num2, String result) {
        System.out.println(num1 + " " + command.getCommand() + " " + num2 + " = " + result);
    }

    /**
     * Получает следующее число
     */
    @Override
    public void getNextNumCommand() {
        System.out.print("Введите число: ");
    }

    /**
     * Сообщение о вводе команды
     */
    @Override
    public void getCommand() {
        System.out.print("Введите команду: ");
    }

}
