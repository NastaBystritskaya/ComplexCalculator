package au.bystritskaia.controllers.complex;

import au.bystritskaia.controllers.ICalculatorController;
import au.bystritskaia.models.Complex;
import au.bystritskaia.rules.RuleFactory;
import au.bystritskaia.services.ICalculatorService;
import au.bystritskaia.services.complex.ComplexCalculatorService;
import au.bystritskaia.views.ICalculatorView;
import au.bystritskaia.views.enums.Command;
import au.bystritskaia.views.enums.Locale;

import java.util.Scanner;

/**
 * Контроллер калькулятора комплексных чисел
 */
public class ComplexCalculatorController implements ICalculatorController<Complex> {
    /**
     * Сервис калькулятора комплексных чисел
     */
    private final ICalculatorService<Complex> service = new ComplexCalculatorService();

    /**
     * Сканер.
     */
    private Scanner scanner = new Scanner(System.in);
    /**
     * Текущая вью
     */
    private ICalculatorView currentView;

    /**
     * Получает текущую вью
     */
    private void getView() {
        if(this.currentView == null) {
            System.out.print("Enter language: ");
            String lang = this.scanner.next();
            Locale loc = Locale.valueOf(lang);
            this.currentView = RuleFactory.getView(loc);
        }
    }

    /**
     * Выводит результат после команды
     *
     * @param command Команда
     * @param num1    1 число
     * @param num2    2 число
     */
    @Override
    public Complex printResult(Command command, Complex num1, Complex num2) {
        Complex result;
        switch (command) {
            case MUL -> result = this.service.mul(num1, num2);
            case DEV -> result = this.service.div(num1, num2);
            case MINUS -> result = this.service.sub(num1, num2);
            default -> result = this.service.add(num1, num2);
        }

        this.currentView.printResult(command, num1, num2, result.toString());
        return result;
    }

    /**
     * Получает команду от пользователя
     * @return Комманда
     */
    private Command getCommand() {
        this.currentView.getCommand();
        String lang = this.scanner.next();

        return Command.valueOf(lang);
    }

    /**
     * Получает след число.
     * @return Число
     */
    private Complex getNextNumber() {
        this.currentView.getNextNumCommand();
        double real =  this.scanner.nextDouble();
        double image =  this.scanner.nextDouble();
        return new Complex(real, image);
    }

    /**
     * Runs this operation.
     */
    public void run() {
        Command current;
        Complex mem = null;
        do {
            this.getView();
            Complex first = (mem == null) ? this.getNextNumber() : mem;
            current = this.getCommand();
            if(current == Command.STOP)
                break;
            Complex second = this.getNextNumber();
            mem = printResult(current, first, second);

        } while (true);
    }
}
