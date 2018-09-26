package by.cdptr.javabasics.l3_2;

import java.util.Scanner;

public class PoslZifraKvadrata {

    public static void main(String[] args) {

        int number, poslZifraKv;

        number = ChisloUsera();

        poslZifraKv = PoslZifraKva(number);

        System.out.println("Последняя цифра квадрата числа "+ number +" равняется "+
                poslZifraKv);
    }

    static int ChisloUsera() {

        int a = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");

        if (sc.hasNextInt()) {
            a = sc.nextInt();
        }

        return a;
    }

    static int PoslZifraKva(int c) {

        int result = 0;

        c = c % 10;
        switch (c) {
            case 0:
                result = 0;
                break;
            case 1:
                result = 1;
                break;
            case 2:
                result = 4;
                break;
            case 3:
                result = 9;
                break;
            case 4:
                result = 6;
                break;
            case 5:
                result = 5;
                break;
            case 6:
                result = 6;
                break;
            case 7:
                result = 9;
                break;
            case 8:
                result = 4;
                break;
            case 9:
                result = 1;
                break;
            default:
                System.out.println("Что-то не то с программой.");
                break;
        }

        return result;
    }
}
