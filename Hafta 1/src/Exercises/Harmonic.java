package Exercises;
import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the N : ");
        int n = inp.nextInt();

        double result = 0;

        for (double i = 1; i <= n;i++){
            result += (1 / i);
        }
        System.out.println("Result = " + result);
    }
}
