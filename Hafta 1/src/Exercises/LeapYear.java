package Exercises;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year, remainder;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Year : ");
        year = input.nextInt();
        remainder = year % 4;

        if((0 <= remainder) && (remainder <= 3)){
            switch (remainder) {
                case 0:
                    System.out.print(year + " is a leap year! ");
                break;

                case 1:
                    System.out.print(year + " is not a leap year! ");
                break;

                case 2:
                    System.out.print(year + " is not a leap year! ");
                 break;

                case 3:
                    System.out.print(year + " is not a leap year! ");
                break;

                default:
                    System.out.print("Error! Please try again. ");
            }
        }else {
            System.out.print("Error!");
        }
    }
}
