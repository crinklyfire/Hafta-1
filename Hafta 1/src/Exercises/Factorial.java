package Exercises;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int n, result = 1, r, ntotal = 1, rtotal = 1, i, mtotal = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        n = inp.nextInt();

        System.out.print("Enter the second number : ");
        r = inp.nextInt();

        for (i = 1; i <= n; i++){
            ntotal = ntotal * i;

        }
        System.out.println("n! :" + ntotal);

        for(i = 1; i <= r; i++){
            rtotal = rtotal * i;

        }
        System.out.println("r! :" + rtotal);


        for(i = 1; i <= (n-r); i++){
            mtotal = mtotal * i;

        }
        System.out.println("n - r :" + mtotal);

        result = ntotal / (rtotal * mtotal);
        System.out.print("Kombination : " + result);
    }
}
