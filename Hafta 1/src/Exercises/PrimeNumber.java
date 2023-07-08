import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variables
        int num;

        System.out.print("Number range : ");
        num = input.nextInt();

        //Till that number
        for (int i = 2;i <= num; i++){
            int count = 0;

            for (int m = 2; m < i; m++) {
                if (i % m == 0) count++;
            }
            if (count == 0) System.out.print(i + ", ");
        }
    }
}
