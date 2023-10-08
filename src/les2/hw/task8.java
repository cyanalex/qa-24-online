package les2.hw;

import java.util.Scanner;

//Напишите программу, где пользователь вводит любое целое положительное число.
//А программа суммирует все числа от 1 до введенного пользователем числа.
//Для ввода числа воспользуйтесь классом Scanner.
public class task8
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        while (!scanner.hasNextLong())
        {
            System.out.println("Enter valid number");
            scanner.next();
        }
        long i = scanner.nextLong();
        int counter = 1;
        int sum = 0;
        while (counter <=i)
        {
            sum += counter;
            counter++;
        }
        System.out.println(sum);
    }
}
