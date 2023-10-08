package les2.hw;

import java.util.Scanner;

//2. Написать программу для вывода названия поры года по номеру месяца.
//При решении используйте оператор if-else-if.
public class task2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = scanner.nextInt();
        if ((num==1) || (num==2) || (num==12))
            {System.out.println("Winter");}
        else if ((num==3) || (num==4) || (num==5))
            {System.out.println("Spring");}
        else if ((num==6) || (num==7) || (num==8))
            {System.out.println("Summer");}
        else if ((num==9) || (num==10) || (num==11))
            {System.out.println("Fall");}
    }
}
