package Exercises;
import java.util.Scanner;
public class Expo {
    public static void main(String[] args) {
        int x, y, total = 1, i = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Base number : ");
        x = inp.nextInt();

        System.out.print("Exponential number : ");
        y = inp.nextInt();

        for(i = 1; i <= y; i++){
            total *= x;
        }
        System.out.print("Result : " + total);
    }
}
