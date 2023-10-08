package les2.hw;

import java.util.Scanner;

//По введенному номеру определить цвет радуги (1 – красный, 4 – зеленый и т. д.).
public class task5
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter color number:");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Оранжевый");
            case 3:
                System.out.println("Желтый");
                break;
            case 4:
                System.out.println("Зеленый");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("Invalid color number");
        }
    }
}
