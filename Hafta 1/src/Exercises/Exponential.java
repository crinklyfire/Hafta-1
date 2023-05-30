package Exercises;
import java.util.Scanner;
public class Exponential {
    public static void main(String[] args) {
        int y;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number : ");
        y = inp.nextInt();

        for (int x = 1; x < y;x *= 2){
            if ((y % 4 == 0) && (y % 5 == 0)){
                System.out.print(x + ",");

            }else {
                System.out.println("Error! Please try again later!");
            }
        }

    }
}
