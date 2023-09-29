package au.bystritskaia.rules.impl;

import au.bystritskaia.rules.IRule;
import au.bystritskaia.views.ICalculatorView;
import au.bystritskaia.views.complex.ComplexViewRUS;
import au.bystritskaia.views.enums.Locale;

import java.util.function.Predicate;

/**
 * Правило русского вью.
 */
public class CalculatorViewRusRule implements IRule<ICalculatorView, Locale> {
    /**
     * Условие правила
     *
     * @param predicate Предикат
     * @return Результат
     */
    @Override
    public boolean match(Predicate<Locale> predicate) {
        return predicate.test(Locale.RUS);
    }

    /**
     * Получает сущность
     *
     * @return Сущность
     */
    @Override
    public ICalculatorView get() {
        return new ComplexViewRUS();
    }
}
