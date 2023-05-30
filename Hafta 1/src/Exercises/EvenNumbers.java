package Exercises;
import java.util.Scanner;
public class EvenNumbers {
    public static void main(String[] args) {
        int x, chosen, total = 0, common = 0, average;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number : ");
        chosen = inp.nextInt();

        for (x = 0; x <= chosen ; x++ ){
            if (((x % 3 == 0) && (x % 4 == 0))){
                common++;
                total += x;
                System.out.println(x);
            }
        }
        average = total / common;
        System.out.println("Sum of numbers divisible by 3 and 4 up to the entered number : " + total);
        System.out.println("Average of numbers dividing by 3 and 4 up to the entered number : " + average);
    }
}
