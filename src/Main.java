public class Main {
    public static void main(String[] args) {

        //Задание 1

        int price = 12500; //стоимость билета
        int rublePerMile = 20; //кол-во рублей для 1 бонусной мили

        int bonus = price / rublePerMile; // кол-во бонусных миль
        System.out.println("Решение задания 1:");
        System.out.println("Кол-во бонусных миль равно: " + bonus);

    }
}