package Exercises;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz : ");
        r = input.nextInt();
        double alan = pi * r * r;
        System.out.println("Alan : " + alan);

        double cevre = 2 * pi * r;
        System.out.println("Cevre : " + cevre);
    }
}
