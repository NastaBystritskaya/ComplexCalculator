package au.bystritskaia.models;
/**
 * Комплексное число
 */
public class Complex extends Number{
    /**
     * Реальная часть
     */
    private double real;

    /**
     * Мнимая часть
     */
    private double image;

    /**
     * Конструктор
     * @param real Реальная часть
     * @param image Мнимая часть
     */
    public Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }

    /**
     * Получает реальную часть
     * @return Реальная часть комплексного числа
     */
    public double getReal() {
        return real;
    }

    /***
     * Меняет реальную часть
     * @param real Новая реальная часть комплексного числа
     */
    public void setReal(double real) {
        this.real = real;
    }

    /**
     * Получает мнимую часть
     * @return Мнимая часть комплексного числа
     */
    public double getImage() {
        return image;
    }

    /**
     * Изменяет мнимую часть
     * @param image Новая мнимая часть комплексного числа
     */
    public void setImage(double image) {
        this.image = image;
    }

    /**
     * Строчное представление комплексного числа
     * @return Строчное представление
     */
    @Override
    public String toString() {
        return "(" + real + " + " + image +"i)";
    }
}
