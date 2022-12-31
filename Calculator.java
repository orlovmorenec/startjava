public class Calculator {
    public static void main(String[] args) {
        int firstVal = 22;
        int secondVal = 4;
        double total = 0d;
        char operationSymbol = '%';
        System.out.print(firstVal + " " + operationSymbol + " " + secondVal + " = ");
        if (operationSymbol == '+') {
            total = firstVal + secondVal;
        } else if (operationSymbol == '-'){
            total = firstVal - secondVal;
        } else if (operationSymbol == '*') {
            total = (double)firstVal * secondVal;
        } else if (operationSymbol == '/') {
            total = (double)firstVal / secondVal;
        } else if(operationSymbol == '^') {
            total = 1;
            for (int i = 1; i <= secondVal; i++) {
                total = total * firstVal;
            }
        } else if (operationSymbol == '%') {
                total = firstVal % secondVal;
        }
        System.out.print(total);
    }
}
