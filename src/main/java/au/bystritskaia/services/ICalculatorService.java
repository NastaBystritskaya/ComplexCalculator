package au.bystritskaia.services;

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
    T add(T num1, T num2);

    /**
     * Разница.
     * @param num1 1 число
     * @param num2 2 число
     * @return Результат
     */
    T sub(T num1, T num2);

    /**
     * Умница.
     * @param num1 1 число
     * @param num2 2 число
     * @return Результат
     */
    T mul(T num1, T num2);
    /**
     * Деление.
     * @param num1 1 число
     * @param num2 2 число
     * @return Результат
     */
    T div(T num1, T num2);


}
