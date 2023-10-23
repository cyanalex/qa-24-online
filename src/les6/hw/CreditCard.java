package les6.hw;

import java.util.Scanner;

public class CreditCard {
    String id;
    int sum;

    public void take() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sum to take:");
        while (!scanner.hasNextInt()) {
            System.out.println("Enter valid amount of money to take");
            scanner.next();
        }
        int numtake = scanner.nextInt();
        sum -= numtake;
    }

    public void put() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sum to put:");
        while (!scanner.hasNextInt()) {
            System.out.println("Enter valid amount of money to put");
            scanner.next();
        }
        int numput = scanner.nextInt();
        sum += numput;
    }

    public void showinfo() {
        System.out.println("id card is " + id + " and current balance is " + sum);
    }

    public CreditCard(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }
}