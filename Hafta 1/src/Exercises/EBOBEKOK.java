package Exercises;
import java.util.Scanner;
public class EBOBEKOK {
    public static void main(String[] args) {
        int ebob = 1, ekok = 1, i = 1,x ,y;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the smallest number : ");
        x = inp.nextInt();
        System.out.print("Enter the biggest number : ");
        y = inp.nextInt();

       while (i <= x){
            if (x % i == 0 && y % i == 0){
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob : " + ebob);

        while (i <= x * y){
            if (i % x == 0 && i % y == 0){
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("Ekok : " + ekok);
    }
}
