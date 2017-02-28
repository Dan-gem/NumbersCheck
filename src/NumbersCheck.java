import java.util.Scanner;

public class NumbersCheck {
    static int operand(int number) { // Метод +
        if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 6 == 0 || number % 9 == 0) {
            System.out.println(number + " число делится на 2, 5, 3, 6, 9 без остатка ");
        } else {
            System.out.println(number + " число не делится на 2, 5, 3, 6, 9 без остатка ");
        }
//-----------------------------------------------------------------------------
        boolean s = false;
        int i;
        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                s = true;
                break;
                } else {
                }
            }

        if (s) {
            System.out.println(number + " - число составное ");
        } else {
            System.out.println(number + " - число  простое ");
        }
//-----------------------------------------------------------------------------
            if (number > 0) {
                System.out.println(number + " - число положительное");
            } else {
                if (number < 0) {
                    System.out.println(number + " - число отрицательное");
                } else {
                    System.out.println(number + " - число 0");
                }
            }
            return number;
        }

    public static void main(String[] args) {
        int number, operand1;
        System.out.println("Введите число и нажмите Enter, далее ");
        Scanner in = new Scanner(System.in); // Объект класса Scanner для обработки ввода с клавиатуры.
        number = in.nextInt();
        operand(number);


    }
}
