import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Seri eleman sayısı: ");
        int R = input.nextInt();

        int num1 = 0, num2 = 1;
        int counter = 0;

        // Iterate till counter is R
        while (counter < R){

            //Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
}
