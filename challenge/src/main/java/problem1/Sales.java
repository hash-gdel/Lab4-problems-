package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of salespeople: ");
        int number = scan.nextInt();
        if (number <= 0) {
            System.out.println("The number must be positive.");
            return;
        }
        int[] sales = new int[number];
        int sum = 0;
        int max = 0;
        int min = 0;
        int maxId = 1;
        int minId = 1;

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
            sum += sales[i];
            if (i == 0 || sales[i] > max) {
                max = sales[i];
                maxId = i + 1;
            }
            if (i == 0 || sales[i] < min) {
                min = sales[i];
                minId = i + 1;
            }
        }

        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        for (int i = 0; i < sales.length; i++) {
            System.out.println((i + 1) + " " + sales[i]);
        }
        System.out.println("Total sales: " + sum);
        System.out.println("Average sale: " + (double) sum / number);
        System.out.println("Salesperson " + maxId + " had the highest sale with $" + max);
        System.out.println("Salesperson " + minId + " had the lowest sale with $" + min);

        System.out.print("Enter a sales amount: ");
        int amount = scan.nextInt();
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > amount) {
                System.out.println("Salesperson " + (i + 1) + ": $" + sales[i]);
                count++;
            }
        }
        System.out.println("Number of salespeople exceeding that amount: " + count);
    }
}