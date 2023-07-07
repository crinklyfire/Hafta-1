package Exercises;
import java.util.Scanner;
public class FindMinMaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variables
        int x, number, max, min;

        System.out.print("How many number will you enter : ");
        x = input.nextInt();

        System.out.print("1. number : ");
        number = input.nextInt();

        max = number;
        min = number;

        //LOOP
        for (int i = 1; i < x;i++){
            System.out.print((i + 1) + ". number : ");
            number = input.nextInt();

            if (number > max){
                max = number;
            }

            if (number < min){
                min = number;
            }
        }

        System.out.println("Biggest number : " + max);
        System.out.println("Smallest number : " + min);
    }
}
