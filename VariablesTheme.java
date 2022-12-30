public class VariablesTheme {
    /*
Задачки на тему
“Переменные: примитивные типы данных”

Создайте класс VariablesTheme с методом main
Все задания реализуйте в нем, отделяя их друг от друга пустой строкой
Код любой задачи должен начинаться с вывода на консоль ее названия, включая порядковый номер
Отделяйте в консоли вывод одной программы от другой пустой строкой, чтобы текст не сливался
Не используйте ввод с клавиатуры
Все переменные должны быть локальными
*/
    public static void main(String[] args) {
/*
Вывод значений переменных на консоль (это название задачи)
объявите переменные всех существующих в Java примитивных типов данных, присвоив им значения
в качестве значений используйте характеристики компьютера: количество ядер, частота процессора и т. д.
выведите на консоль:
значение переменных
описание к ним
*/
        System.out.println("1. Вывод значений переменных на консоль");

        byte numberOfCores = 8;
        short gpuSize = 4096;
        int ssdMemoryAmount = 524_288;
        long ddrMemoryAMount = 16_384L;
        float cpuFrequency = 3.2f;
        double screenDiagonal = 17.3d;
        char firstLetter = 'L';
        boolean answer = true;

        System.out.println("\n Характеристики моего ноутбука Lenovo Legion 5: " +
                "\n Количество ядер: " + numberOfCores +
                "\n Объем видеопамяти в Мб: " + gpuSize +
                "\n Объем SSD накопителя в Мб: " + ssdMemoryAmount +
                "\n Объем оперативной памяти в Мб: " + ddrMemoryAMount +
                "\n Тактовая частота процессора в Ггц: " + cpuFrequency +
                "\n Диагональ экрана в дюймах: " + screenDiagonal +
                "\n Первая буква в названии фирмы производителя и модели это: " + firstLetter +
                "\n Правда на английском это: " + answer);
/*
Расчет стоимости товара со скидкой
ручка стоит 100 руб, а книга — 200 руб.
вместе на них действует скидка 11%
выведите на консоль:
сумму скидки
общую стоимость товаров со скидкой
*/
        System.out.println("\n2. Расчет стоимости товара со скидкой");

        int penPrice = 100;
        int bookPrice = 200;
        float doublePurchaseDiscountPercent = 11;
        float discountSize = (penPrice + bookPrice) * doublePurchaseDiscountPercent / 100;

        System.out.println("\nСумма скидки при покупке ручки и книги составляет " + doublePurchaseDiscountPercent + "% или: " + discountSize + " руб." +
                "\nОбщая стоимость товаров со скидкой: " + (penPrice + bookPrice - discountSize) + " руб.");

/*
Вывод слова JAVA
Отобразите в консоли слово JAVA, как в примере ниже:
   J    a  v     v  a
   J   a a  v   v  a a
J  J  aaaaa  V V  aaaaa
 JJ  a     a  V  a     a
*/
        System.out.println("\n3. Вывод слова JAVA");

        System.out.println("\n   J    a  v     v  a     " +
                "\n   J   a a  v   v  a a    " +
                "\nJ  J  aaaaa  V V  aaaaa   " +
                "\n JJ  a     a  V  a     a");
/*
Вывод min и max значений целых числовых типов
создайте переменные всех целых числовых типов
присвойте им самые большие числа, которые они могут хранить
инкрементируйте, а затем декрементируйте все значения на единицу
выводите данные на консоль для каждой переменной в следующей последовательности:
первоначальное значение
значение после инкремента
значение после декремента
*/
        System.out.println("\n4. Вывод min и max значений целых числовых типов");

        byte variableByte = 127;
        short variableShort = 32_767;
        int variableInt = 2_147_483_647;
        long variableLong = Long.MAX_VALUE;

        System.out.println("\n" + variableByte + " " + ++variableByte + " " + --variableByte +
                "\n" + variableShort + " " + ++variableShort + " " + --variableShort +
                "\n" + variableInt + " " + ++variableInt + " " + --variableInt +
                "\n" + variableLong + " " + ++variableLong + " " + --variableLong);
/*
Перестановка значений переменных
создайте две переменные типа int, присвоив им 2 и 5
поменяйте значения переменных местами разными способами:
с помощью третьей переменной
с помощью арифметических операций
с помощью побитовой операции ^
( https://vertex-academy.com/tutorials/ru/ponyatie-bita-rabota-s-bitami/#:~:text=%D0%9F%D0%BE%D0%B1%D0%B8%D1%82%D0%BE%D0%B2%D1%8B%D0%B9%20%D0%B8%D1%81%D0%BA%D0%BB%D1%8E%D1%87%D0%B0%D1%8E%D1%89%D0%B5%D0%B5%20OR%20%2D%20XOR )
перед началом очередных перестановок присваивать переменным исходные значения не нужно
решение должно быть универсальным, а не привязано к конкретным значениям
выведите на консоль:
название способа перестановки значений
исходные значения переменных
новые значения переменных
*/
        System.out.println("\n5. Перестановка значений переменных");

        int firstVar = 2;
        int secondVar = 5;

        System.out.println("\nПереставление значений с помощью третьей переменной:");
        System.out.println("Значение первой переменной: " + firstVar + "; Значение второй переменной: " + secondVar + ";");
        int thirdVar = firstVar;
        firstVar = secondVar;
        secondVar = thirdVar;
        System.out.println("Новое значение первой переменной: " + firstVar + "; Второй переменной: " + secondVar + ";");
        System.out.println("\nПереставление значений с помощью арифметических операций: ");
        System.out.println("Значение первой переменной: " + firstVar + "; Значение второй переменной: " + secondVar + ";");
        firstVar -= secondVar;
        secondVar += firstVar;
        firstVar = secondVar - firstVar;
        System.out.println("Новое значение первой переменной: " + firstVar + "; Второй переменной: " + secondVar + ";");
        System.out.println("\nПереставление значений с помощью побитовой операции: ");
        System.out.println("Значение первой переменной: " + firstVar + "; Значение второй переменной: " + secondVar + ";");
        firstVar ^= secondVar;
        secondVar ^= firstVar;
        firstVar ^= secondVar;
        System.out.println("Новое значение первой переменной: " + firstVar + "; Второй переменной: " + secondVar + ";");
/*
Вывод символов и их кодов
проинициализируйте переменные типа char, используя символы (не их коды!), соответствующими кодам: 35, 38, 64, 94, 95
выведите на консоль в столбец, используя значения переменных:
код символа
а напротив соответствующий ему символ из ASCII-таблицы
( https://www.industrialnets.ru/files/misc/ascii.pdf )
*/
        System.out.println("\n6. Вывод символов и их кодов");

        char grid = '#';
        char and = '&';
        char dog = '@';
        char checkMark = '^';
        char underscore = '_';
        System.out.println("\n Код символа: 35 - " + grid +
                "\n Код символа: 38 - " + and +
                "\n Код символа: 64 - " + dog +
                "\n Код символа: 94 - " + checkMark +
                "\n Код символа: 95 - " + underscore);
/*
Вывод в консоль ASCII-арт Дюка
выведите в консоль Java-талисман:
    /\
   /  \
  /_( )\
 /      \
/____/\__\
каждый уникальный символ (а не его код) храните в отдельной переменной (кроме пробелов)
выведите (построчно, а не посимвольно) результат в консоль, используя значения переменных
*/
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");

        char slash = '/';
        char backSlash = '\\';
        char leftBracket = '(';
        char rightBracket = ')';

        System.out.println("    " + slash + backSlash+ "     ");
        System.out.println("   " + slash + "  " + backSlash + "    ");
        System.out.println("  " + slash + underscore + leftBracket + " " + rightBracket + backSlash + "   ");
        System.out.println(" " + slash + "      " + backSlash + "  ");
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + backSlash +
                underscore + underscore + backSlash);
/*
Вывод количества сотен, десятков и единиц числа
из числа 123 выделите сотни, десятки и единицы
выделяйте каждую цифру числа программно, а не написав их самим
используйте для этого только операции / и %
не используйте цикл
найдите произведение и сумму цифр
выведите результат в формате:
Число N содержит:
X сотен
Y десятков
Z единиц
Сумма его цифр = столько-то
Произведение = столько-то
*/
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");

        int basicNum = 123;
        int firstNumber = basicNum / 100;
        int secondNumber = (basicNum % 100) / 10;
        int thirdNumber = (basicNum % 100) % 10;
        
        System.out.println("\nЧисло " + basicNum + " содержит:");
        System.out.println(firstNumber + " сотен\n" + secondNumber + " десятков\n" + thirdNumber + " едениц");
        System.out.println("Сумма его цифр = " + (firstNumber + secondNumber + thirdNumber) +
                "\nПроизведение = " + (firstNumber * secondNumber * thirdNumber));
/*
Вывод времени
имеется 86399 секунд
переведите число в часы, минуты и секунды
используйте для этого только операции / и %
выведите в консоль значения в формате ЧЧ:ММ:СС
*/
        System.out.println("\n9. Вывод времени");

        int basicSeconds = 86399;
        System.out.println((basicSeconds / 3600) + ":" +
                ((basicSeconds % 3600) / 60) + ":" +
                ((basicSeconds % 3600) % 60));
    }
}
