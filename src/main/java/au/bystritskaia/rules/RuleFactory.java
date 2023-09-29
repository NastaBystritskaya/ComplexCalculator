package au.bystritskaia.rules;

import au.bystritskaia.rules.impl.CalculatorViewEngRule;
import au.bystritskaia.rules.impl.CalculatorViewRusRule;
import au.bystritskaia.views.complex.ComplexViewEng;
import au.bystritskaia.views.complex.ComplexViewRUS;
import au.bystritskaia.views.ICalculatorView;
import au.bystritskaia.views.enums.Locale;

import java.util.List;

/**
 * Фабрика правил
 */
public final class RuleFactory {
    /**
     * Правила вью калькулятора
     */
    private static List<IRule<ICalculatorView, Locale>> views = List.of(
            new CalculatorViewEngRule(),
            new CalculatorViewRusRule()
    );

    /**
     * Получает вью калькулятора по языку системы
     * @param locale Язык системы
     * @return Вью
     */
    public static ICalculatorView getView(Locale locale) {
        return views.stream().filter(rule -> rule.match(loc -> loc.equals(locale))).findFirst().orElseThrow().get();
    }

}
