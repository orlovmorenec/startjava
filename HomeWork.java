public class HomeWork {
    public static void main(String[] args) {
/*
Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.
 */
        int number = 4;
        int total = 0;
        System.out.println("Сумма чисел до введенного вами числа: " + number);
        if (number != 1) {
            for (int i = 1; i < number; i++) {
                total += i;
                System.out.print(i + "+");
            }
            System.out.print("=" + total);
        } else {
            System.out.print("Число равно 1");
        }
    }
}
