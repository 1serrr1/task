package org.example;

public class Main {
    public static void main(String[] args) {
        try {

            Fraction fraction1 = new Fraction(1, 2);
            System.out.println("Создана дробь: " + fraction1);


            Fraction fraction2 = new Fraction(1, 0);
            System.out.println("Создана дробь: " + fraction2); // Эта строка не будет выполнена
        } catch (NullDenominatorException e) {

            System.err.println("Ошибка: " + e.getMessage());
        }

        try {

            Fraction fraction3 = new Fraction(3, 4);
            System.out.println("Создана дробь: " + fraction3);
        } catch (NullDenominatorException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
