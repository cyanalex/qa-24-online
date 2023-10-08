package les2.hw;

import java.util.Scanner;

//1. Написать программу для вывода названия поры года по номеру месяца.
//При решении используйте оператор switch-case.

public class task1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = scanner.nextInt();
        switch (num)
        {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
            break;
            case 3:
            case 4:
            case 5:
                System.out.println("Winter");
            break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
            break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
            break;
            default:
                System.out.println("Invalid month number");
        }
    }
}
