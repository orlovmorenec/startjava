public class GameGuessTheNumber {
    public static void main(String[] args) {
        int hiddenNumber = 88;
        int number = 99;
        while (number != hiddenNumber) {
            if (number < hiddenNumber) {
                System.out.println("Введенное вами число " + number + " меньше того, что загадал компьютер");
                number++;
            } else if (number > hiddenNumber) {
                System.out.println("Введенное вами число " + number + " больше того, что загадал компьютер");
                number--;
            }
        }
        System.out.println("Вы угадали! Компьютер загадал число: " + hiddenNumber);
    }
}
