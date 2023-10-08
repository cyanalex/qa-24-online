package les2.hw;

import java.util.Scanner;

//3. Напишите программу, которая будет принимать на вход число и на
//выход будет выводить сообщение четное число или нет.
//Для определения четности числа используйте операцию получения
//остатка от деления - операция выглядит так: '% 2').
public class task3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        long num = scanner.nextLong();
        if (num% 2 == 0)
        {
            System.out.println("Число четное");
        }
        else
        {
            System.out.println("Число нечетное");
        }
    }
}
