public class CyclesTheme {
/*
Задачки на тему
“Циклы: for, while, do while”

Создайте класс CyclesTheme с методом main
Все задания реализуйте в нем, отделяя их друг от друга пустой строкой
Код любой задачи должен начинаться с вывода на консоль ее названия, включая порядковый номер
Отделяйте в консоли вывод одной программы от другой пустой строкой, чтобы текст не сливался
Не используйте ввод с клавиатуры
Нельзя использовать методы String, а также массивы для решения ДЗ
Все переменные должны быть локальными
*/
    public static void main(String[] args) {
/*
Подсчет суммы четных и нечетных чисел
подсчитайте с помощью do-while сумму четных и нечетных чисел в отрезке [-10, 21]
( https://foxford.ru/wiki/matematika/chislovyepromezhutki#!:~:text=%D0%9E%D1%82%D0%BC%D0%B5%D1%82%D0%B8%D0%BC%20%D0%B2%D1%81%D0%B5%20%D1%82%D0%BE%D1%87%D0%BA%D0%B8,. )
отобразите эти значения в формате:
в промежутке [-10, 21] сумма четных чисел = X, а нечетных = Y
*/
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int even = 0;
        int uneven = 0;
        int i = -10;
        do {
            if (i % 2 == 0) {
                even += i;
            } else if (i % 2 != 0) {
                uneven += i;
            }
            i++;
        } while (i < 22);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + even + " , а нечетных = " + uneven);
/*
Вывод чисел в интервале (min и max) в порядке убывания
даны значения 10, 5, -1
найдите среди них max и min число
отобразите в консоль в одну строку, с помощью for, все числа в интервале (min, max) в порядке убывания
( https://foxford.ru/wiki/matematika/chislovyepromezhutki#!:~:text=%D0%9E%D1%82%D0%BC%D0%B5%D1%82%D0%B8%D0%BC%20%D0%B2%D1%81%D0%B5%20%D1%82%D0%BE%D1%87%D0%BA%D0%B8,. )
обратите внимание, что интервал — математический (не путайте его с отрезком)
использовать методы max и min класса Math — нельзя
*/
        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int firstVal = 10;
        int secondVal = 5;
        int thirdVal = -1;
        int min = 0;
        int max = 0;
        if (firstVal >= secondVal && firstVal >= thirdVal) {
            max = firstVal;
        } else if (secondVal >= firstVal && secondVal >= thirdVal) {
            max = secondVal;
        } else if (thirdVal >= firstVal && thirdVal >= secondVal) {
            max = thirdVal;
        }
        if (firstVal <= secondVal && firstVal <= thirdVal) {
            min = firstVal;
        } else if (secondVal <= firstVal && secondVal <= thirdVal) {
            min = secondVal;
        } else if (thirdVal <= firstVal && thirdVal <= secondVal) {
            min = thirdVal;
        }
        for (i = max; i >= min; i--) {
            System.out.print(i + " ");
        }
/*
Вывод реверсивного числа и суммы его цифр
дано число 1234
в цикле while выделите каждую его цифру
подсчитайте сумму полученных цифр
отобразите в консоли:
исходное число в обратном порядке
сумму его цифр
*/
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");
        int val = 1234;
        int counter = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (val != 0) {
            counter += val % 10;
            System.out.print(val % 10);
            val /= 10;
        }
        System.out.print("\nСумма его цифр: " + counter);
/*
Вывод чисел на консоль в несколько строк
выведите с помощью for на консоль числа в полуинтервале [1, 24)
шаг итерации 2
отображайте в каждой строке по 5 чисел
отделяйте их друг от друга необходимым количеством пробелов
не указывайте впереди числа нули
выравнивайте числа в каждом столбце по правому краю, используя форматированный вывод с помощью printf
( https://web.archive.org/web/20220318063455/http://study-java.ru/uroki-java/formatirovanie-chisel-i-texta-v-java/,
https://www.baeldung.com/java-printstream-printf )
недостающее в последней строке до 5 количество чисел заполните нулями
число нулей определяйте программно. Не считайте их в уме и не пишите сами
*/
        System.out.println("\n\n4. Вывод чисел на консоль в несколько строк\n");
        counter = 0;
        for (i = 1; i < 24; i += 2) {
            System.out.printf("%4d", i);
            counter++;
            if (counter % 5 == 0) {
                System.out.println("");
            }
        }
        for (i = counter; i % 5 != 0; i++) {
            System.out.printf("%4d", 0);
        }
/*
Проверка количества двоек на четность/нечетность
дано число 3242592
подсчитайте в цикле while количество 2, а затем проверьте получившееся значение на четность/нечетность
отобразите результат:
число X содержит N (четное/нечетное) количество двоек
*/
        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность\n");
        val = 3242592;
        counter = 0;
        System.out.print("Число: " + val + " содержит");
        while (val != 0) {
            if (val % 10 == 2 || val % 10 == -2) {
                counter++;
            }
            val /= 10;
        }
        if (counter % 2 == 0) {
            System.out.print(" четное ");
        } else if (counter % 2 != 0) {
            System.out.print(" нечетное ");
        }
        System.out.print("(" + counter + ")" + " количество двоек");
/*
Отображение фигур в консоли
отобразите геометрические фигуры, используя:
для прямоугольника только for
для прямоугольного треугольника только while
для второго треугольника только do-while
каждую фигуру выводите на новой строке
**********    #####    $
**********    ####     $$
**********    ###      $$$
**********    ##       $$
**********    #        $
*/
        System.out.println("\n\n6. Отображение фигур в консоли\n");
        //прямоугольник
        for (i = 0; i < 5; i++) {
            System.out.println("**********");
        }
        System.out.println(i);
        //прямоугольный треугольник
        while (i != 0) {
            int j = i;
            while (j != 0) {
                System.out.print("#");
                j--;
            }
            System.out.println();
            i--;
        }
        //второй треугольник
        counter = 1;
        i = 0;
        do {
            System.out.println("$");
            counter++;
            do {
                System.out.print("$");
                i++;
            } while (i == counter);
            if (counter == 3) {
                System.out.print("$");
            }
        } while (counter < 5);
/*
Отображение ASCII-символов
отобразите, используя for, данные столбцов Dec и Char (и названия столбцов) из таблицы
( https://www.industrialnets.ru/files/misc/ascii.pdf )
выведите на консоль:
символы, идущие до цифр и имеющие нечетные коды(1-47)
маленькие английские буквы, имеющие четные коды(97-122)
данные каждого столбца должны быть выровнены по правому краю
*/
        System.out.println("\n\n7. Отображение ASCII-символов\n");
        int charDec = 1;
        char charVal;

        System.out.printf("%15s %15s %n", "Dec", "Char");
        for (i = 1; i < 48; i += 2) {
            charVal = (char) i;
            System.out.printf("%15d %15s %n", i, charVal);
        }
        for (i = 98; i < 123; i += 2) {
            charVal = (char) i;
            System.out.printf("%15d %15s %n", i, charVal);
        }
/*
Проверка, является ли число палиндромом
дано число 1234321
проверьте, является ли оно палиндромом (читается одинаково с любой стороны)
использовать Math.pow нельзя
отобразите в консоли:
число X является палиндромом
*/
        System.out.println("\n8. Проверка, является ли число палиндромом\n");
        int isPalindrome = 1234321;
        val = isPalindrome;
        secondVal = 0;
        String palindrome = "";
        System.out.print("Число: " + val);
        while (val > 10) {
            secondVal = val % 10;
            val /= 10;
            palindrome += secondVal;
            if (val < 10) {
                palindrome += val;
            }
        }
        if (Integer.parseInt(palindrome) == isPalindrome) {
            System.out.println(" является палиндромом");
        } else if (Integer.parseInt(palindrome) != isPalindrome) {
            System.out.println(" не является палиндромом");
        }
/*
Определение, является ли число счастливым
счастливым называется число, сумма первых трех цифр которого равна сумме последних
возьмите любое шестизначное число
подсчитайте сумму каждой его половины
отобразите в консоли:
каждую тройку цифр в формате “Сумма цифр abc = sum”
является число счастливым или нет
*/
        System.out.println("\n9. Определение, является ли число счастливым\n");
        val = 123321;
        firstVal = 0;
        secondVal = 0;
        counter = 0;
        System.out.print("Сумма цифр: ");
        while (val % 10 != 0 && counter < 3) {
            firstVal += val % 10;
            System.out.print(val % 10);
            val /= 10;
            counter++;
        }
        System.out.println(" = " + firstVal);

        System.out.print("Сумма цифр: ");
        while (val % 10 != 0 && counter >= 3) {
            secondVal += val % 10;
            System.out.print(val % 10);
            val /= 10;
            counter++;
        }
        System.out.println(" = " + secondVal);
        if (firstVal == secondVal) {
            System.out.println("Число является счастливым!");
        } else {
            System.out.println("Число не является счастливым!");
        }
/*
Вывод таблицы умножения Пифагора
отобразите таблицу умножения в точности, как в образце, включая горизонтальные и вертикальные линии
( https://ic.pics.livejournal.com/eponim2008/17443609/154184/154184_original.jpg )
не добавляйте между строками и столбцами лишние пустоты
используйте цикл for
*/
        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        System.out.printf("%25s %-20s %n", "ТАБЛИЦА", "ПИФАГОРА");
        for (i = 1; i < 10; i++) {
            if (i == 1) {
                System.out.printf("%4s %4s", "", "|");
            } else {
                System.out.printf("%4d %4s", i, "|");
            }
            for (int j = 1; j < 10; j++) {
                if (j > 1) {
                    System.out.printf("%5d", j * i);
                    if (j == 9) {
                        System.out.println();
                    }
                }
            }
            if (i == 1) {
                System.out.println("-------------------------------------------------");
            }
        }
    }
}