package au.bystritskaia.views.complex;

import au.bystritskaia.models.Complex;
import au.bystritskaia.models.Number;
import au.bystritskaia.views.ICalculatorView;
import au.bystritskaia.views.enums.Command;

public class ComplexViewEng implements ICalculatorView {
    /**
     * Получает результат операции
     *
     * @param command Команда
     * @param result  Результат
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
        System.out.print("Enter number: ");
    }

    /**
     * Сообщение о вводе команды
     */
    @Override
    public void getCommand() {
        System.out.println("Enter command: ");
    }

}
