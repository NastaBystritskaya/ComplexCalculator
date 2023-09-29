package au.bystritskaia.views.enums;

/**
 * Перечисление поддерживаемых комманд
 */
public enum Command {

    /**
     * Сумма
     */
    PLUS("+"),

    /**
     * Минус
     */
    MINUS("-"),

    /**
     * Деление
     */
    DEV("/"),

    /**
     * Умножение
     */
    MUL("*"),

    /**
     * Равно
     */
    EQUALS("="),
    /**
     * Выход
     */
    STOP(".")
    ;
    /**
     * Команда
     */
    private String command;

    /**
     * Получает символ команды
     * @return Символ команды
     */
    public String getCommand() {
        return command;
    }

    /**
     * Конструктор
     * @param command Команда
     */
    Command(String command) {
        this.command = command;
    }
}
