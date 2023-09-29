package au.bystritskaia.rules;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Правила системы.
 * @param <T> Вид правила
 * @param <P> Тип предиката
 */
public interface IRule<T, P> {

    /**
     * Условие правила
     * @param predicate Предикат
     * @return Результат
     */
    boolean match(Predicate<P> predicate);

    /**
     * Получает сущность
     * @return Сущность
     */
    T get();
}
