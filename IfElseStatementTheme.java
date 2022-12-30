/*
Задачки на тему “Ветвление: if-else”

Создайте класс IfElseStatementTheme с методом main
Все задания реализуйте в нем, отделяя их друг от друга пустой строкой
Код любой задачи должен начинаться с вывода на консоль ее названия, включая порядковый номер
Отделяйте в консоли вывод одной программы от другой пустой строкой, чтобы текст не сливался
Не используйте ввод с клавиатуры
Все переменные должны быть локальными
Приводить числа или символы к String запрещено

1. Перевод псевдокода на язык Java
перепишите псевдокод, приведенный ниже, с помощью Java
используйте переменные, условные операторы, логическое НЕ
( https://developer.alexanderklimov.ru/android/java/logic_operators.php )
придумайте сообщения для отображения их в консоли

ЕСЛИ(возраст > 20) {
    сообщение
} ИНАЧЕ {
    сообщение
}

ЕСЛИ(!мужскойПол) {
    сообщение
} ИНАЧЕ {
    сообщение
}

ЕСЛИ(рост < 1.80) {
    сообщение
} ИНАЧЕ {
    сообщение
}

перваяБукваИмени = "Имя".charAt(0);
ЕСЛИ(перваяБукваИмени == 'M') {
    сообщение
} ИНАЧЕ ЕСЛИ(перваяБукваИмени == 'I') {
    сообщение
} ИНАЧЕ {
    сообщение
}
*/
public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");

        int age = 33;
        if (age > 20) {
            System.out.println("Старше 20");
        } else {
            System.out.println("Младше 20");
        }

        String sex = "female";
        if (sex == "male") {
            System.out.println("Мужчина");
        } else {
            System.out.println("Женщина");
        }

        float height = 1.93f;
        if (height < 1.80) {
            System.out.println("Ниже 180 см");
        } else {
            System.out.println("Выше 181 см");
        }

        char firstLetterName = "Arthur".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Первая буква имени: M");
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква имени: I");
        } else {
            System.out.println("Первая буква имени не M и не I");
        }

/*
2. Поиск max и min числа
создайте две переменные, присвоив им любые числа
найдите максимальное и минимальное число
выведите:
числа на консоль, указав какое из них max и min
информацию об их равенстве, если они равны
*/
        System.out.println("\n2. Поиск max и min числа");

        int firstVal = 7;
        int secondVal = 8;

        System.out.println("\nПервое число: " + firstVal + "; Второе число: " + secondVal);
        if (firstVal > secondVal) {
            System.out.println("Наибольшее число: " + firstVal + "; Наименьшее число: " + secondVal);
        } else if (secondVal > firstVal) {
            System.out.println("Наибольшее число: " + secondVal + "; Наименьшее число: " + firstVal);
        } else {
            System.out.println("Оба числа равны");
        }
/*
3. Проверка числа
создайте переменную с любым числом
определите, являться ли оно:
нулем
четным (нечетным)
отрицательным (положительным)
если число равно 0, то остальные проверки не должны выполняться. Используйте вложенные if (return использовать — нельзя)
если число не равно 0, то не нужно выводить эту информацию
проверки и выводимый текст не должны дублироваться
отобразите полученные результаты, включая исходное число
*/
        System.out.println("\n3. Проверка числа\n");

        firstVal = 0;
        System.out.print("Число: " + firstVal + " является ");
        if (firstVal == 0) {
            System.out.print("нулем");
        } else if (firstVal != 0) {
            if (firstVal % 2 != 0) {
                System.out.print("нечетным");
            } else if (firstVal % 2 == 0) {
                System.out.print("четным");
            }
            if (firstVal > 0) {
                System.out.print(" положительным");
            } else if (firstVal < 0) {
                System.out.print(" отрицательым");
            }
        }
/*
4. Поиск одинаковых цифр в числах
создайте две переменные, присвоив им два трехзначных целых числа
найдите в них все одинаковые цифры, стоящие в одном и том же разряде
отобразите на консоль:
исходные числа
одинаковые в них цифры
номера разрядов
если равных цифр нет, то отобразите соответствующее сообщение
*/
        System.out.println("\n\n4. Поиск одинаковых цифр в числах");

        firstVal = 123;
        secondVal = 321;

        System.out.println("\nПервое число: " + firstVal + "; Второе число: " + secondVal);

        int firstValThousands = firstVal / 100;
        int firstValDozens = (firstVal % 100) / 10;
        int firstValUnits = (firstVal % 100) % 10;
        int secondValThousands = secondVal / 100;
        int secondValDozens = (secondVal % 100) / 10;
        int secondValUnits = (secondVal % 100) % 10;

        if (firstVal != secondVal) {
            if (firstValThousands == secondValThousands) {
                System.out.println("В первом разряде одинаковые цифры: " + firstValThousands);
            }
            if (firstValDozens == secondValDozens) {
                System.out.println("Во втором разряде одинаковые цифры: " + firstValDozens);
            }
            if (firstValUnits == secondValUnits) {
                System.out.println("В третьем разряде одинаковые цифры: " + firstValUnits);
            }
        } else if (firstVal == secondVal) {
            System.out.println("Все цифры в числах совпадают.");
        } else {
            System.out.println("Одинаковых цифр нет");
        }
/*
5. Определение символа по его коду
создайте переменную типа char
присвойте ей значение '\u0057'
определите программно — это код буквы, числа или другого символа
( https://www.industrialnets.ru/files/misc/ascii.pdf )
в if используйте символы, а не их коды
использовать методы классов Java запрещено
выведите в консоль сам символ и информацию о нем:
маленькая буква
большая буква
число
не буква и не число
*/
        System.out.println("\n5. Определение символа по его коду");

        char charVal = '\u0057';
        System.out.println("\nСимвол с кодировкой \\u0057 (" + charVal + ") ");
        if (charVal >= 'a' && charVal <= 'z') {
            System.out.println("Это маленькая буква");
        } else if (charVal >= 'A' && charVal <= 'Z') {
            System.out.println("Это большая буква");
        } else if (charVal >= '0' && charVal <= '9') {
            System.out.println("Это цифра");
        } else {
            System.out.println("Не буква и не число");
        }
/*
6. Подсчет суммы вклада и начисленных банком %
сумма вклада равна 300_000 руб.
если она:
меньше 100_000, то банк начисляет 5% годовых
от 100_000 до 300_000, то — 7%
от 300_000, то — 10%
отобразите в консоли:
сумму вклада
начисленный % (не путайте с процентной ставкой)
итоговую сумму с %
*/
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");

        int depositSum = 300_000;
        System.out.println("\nСумма вклада: " + depositSum + " рублей");
        int depositPercentage = 1;
        if (depositSum >= 300_000) {
            depositPercentage = 10;
        } else if (depositSum >= 100_000 && depositSum < 300_000) {
            depositPercentage = 7;
        } else if (depositSum < 100_000) {
            depositPercentage = 5;
        }
        double accruedPercent = depositSum * ((double)depositPercentage / 100);
        System.out.print("Начисленный процент: ");
        System.out.printf("%.2f", accruedPercent);
        System.out.print(" рублей");
        System.out.println("\nИтоговая сумма с %: " + (depositSum + accruedPercent) + " рублей");
/*
7. Определение оценки по предметам
студент получил итоговые % по предметам:
история 59%
программирование 91%
определите оценки по каждому предмету:
<= 60% — 2
> 60% — 3
> 73% — 4
> 91% — 5
выведите в консоль:
оценку и напротив предмет
средний балл оценок по предметам
средний % по предметам
*/
        System.out.println("\n7. Определение оценки по предметам\n");
        int historyPercent = 59;
        int historyGrade = 0;
        if (historyPercent <= 60) {
            historyGrade = 2;
        } else if (historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 74 && historyPercent <= 91) {
            historyGrade = 4;
        } else if (historyPercent > 91) {
            historyGrade = 5;
        }
        int programmingPercent = 91;
        int programmingGrade = 0;
        if (programmingPercent <= 60) {
            programmingGrade = 2;
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 74 && programmingPercent <= 91) {
            programmingGrade = 4;
        } else if (programmingPercent > 91) {
            programmingGrade = 5;
        }
        System.out.println(historyGrade + " - Оценка по Истории\n" +
                programmingGrade + " - Оценка по Программированию" +
                "\nСредний балл оценок по предметам: " + ((historyGrade + programmingGrade) / 2) +
                "\nСредний % по предметам: " + ((historyPercent + programmingPercent) / 2));
/*
8. Расчет прибыли за год
продавец снимает помещение за 5 000 руб. в месяц
в среднем в месяц он продает товара на 13 000 руб.
при этом его себестоимость равна 9 000 руб.
подсчитайте годовую прибыль
отобразите ее в консоли в следующем формате, например:
прибыль за год: -1000 руб.
прибыль за год: +3000 руб.
если прибыль положительная, то рядом с числом необходимо отображать +
*/
        System.out.println("\n8. Расчет прибыли за год");
        int rentalPricePerMonth = 5000;
        int turnoverPerMonth = 13_000;
        int costPrice = 9_000;
        int annualProfit = turnoverPerMonth - costPrice - rentalPricePerMonth;
        System.out.print("\nПрибыль за год: ");
        if (annualProfit > 0) {
            System.out.print("+");
        }
        System.out.print(annualProfit + " руб.\n");
/*
9. Подсчет количества банкнот
из банкомата вам необходимо снять 567 USD
подсчитайте, с помощью какого количества банкнот номиналом 1, 10, 100 банкомат может выдать необходимую сумму
при этом в банкомате осталось:
10 банкнот номиналом 100
5 банкнот номиналом 10
50 банкнот номиналом 1
если каких-то банкнот не хватает, то их нужно заменить банкнотами меньшего номинала
проведите обратный расчет начальной суммы по полученному количеству банкнот, чтобы убедиться в правильности вычислений
выведите в консоль:
номиналы банкнот
требуемое их количество
выдаваемую сумму
*/
        System.out.println("\n9. Подсчет количества банкнот");
        int issuanceAmount = 567;
        int banknotesDenomination100Left = 10;
        int requiredBanknotesNumber100 = issuanceAmount / 100;
        int banknotesDenomination10Left = 5;
        int requiredBanknotesNumber10 = (issuanceAmount % 100) / 10;
        int banknotesDenomination1Left = 50;
        int requiredBanknotesNumber1 = (issuanceAmount % 100) % 10;
        if (issuanceAmount > ((banknotesDenomination100Left * 100) + (banknotesDenomination10Left) * 10 + banknotesDenomination1Left)) {
            System.out.println("В банкомате недостаточно банкнот");
        } else {
            if (banknotesDenomination100Left < requiredBanknotesNumber100) {
                System.out.println("\nНеобходимое количество банкнот номиналом (100): " + banknotesDenomination100Left);
                requiredBanknotesNumber10 += ((banknotesDenomination100Left - requiredBanknotesNumber100) / 10);
            } else {
                System.out.println("\nНеобходимое количество банкнот номиналом (100): " + requiredBanknotesNumber100);
            }
            if (banknotesDenomination10Left < requiredBanknotesNumber10) {
                System.out.println("Необходимое количество банкнот номиналом (10): " + banknotesDenomination10Left);
                requiredBanknotesNumber10 -= banknotesDenomination10Left;
                requiredBanknotesNumber1 += requiredBanknotesNumber10 * 10;
            } else {
                System.out.println("Необходимое количество банкнот номиналом (10): " + requiredBanknotesNumber10);
            }
            System.out.println("Необходимое количество банкнот номиналом(1): " + requiredBanknotesNumber1);
        }
    }
}
