package Exercises;
import java.util.Scanner;
public class OddNumber {
    public static void main(String[] args) {
        int x = 0, total = 0;

        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Enter the number : ");
            x = inp.nextInt();
            if (x % 2 == 0 || x % 4 == 0){
                total += x;
            }else {
                System.out.println("You entered the odd number. Please try again!");
                break;
            }
        }while (x >= 0);
        System.out.println("Total :" + total);
    }
}
