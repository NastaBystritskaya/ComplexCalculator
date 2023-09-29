package au.bystritskaia.rules.impl;

import au.bystritskaia.rules.IRule;
import au.bystritskaia.views.ICalculatorView;
import au.bystritskaia.views.enums.Locale;

import java.util.function.Predicate;

public class CalculatorViewRule implements IRule<ICalculatorView, Locale> {
    /**
     * Условие правила
     *
     * @param predicate Предикат
     * @return Результат
     */
    @Override
    public boolean match(Predicate<Locale> predicate) {
        return predicate.test(Loc);
    }

    /**
     * Получает сущность
     *
     * @return Сущность
     */
    @Override
    public ICalculatorView get() {
        return null;
    }
}
