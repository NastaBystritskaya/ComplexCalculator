package au.bystritskaia.complex.services;

/**
 * Интерфейс калькулятора
 * @param <T>
 */
public interface ICalculatorService<T> {
    /**
     * Сумма.
     * @param num1 1 число
     * @param num2 2 число
     * @return Результат
     */
    String add(T num1, T num2);

    /**
     * Разница.
     * @param num1 1 число
     * @param num2 2 число
     * @return Результат
     */
    String sub(T num1, T num2);

    /**
     * Умница.
     * @param num1 1 число
     * @param num2 2 число
     * @return Результат
     */
    String mul(T num1, T num2);
    /**
     * Деление.
     * @param num1 1 число
     * @param num2 2 число
     * @return Результат
     */
    String div(T num1, T num2);


}
