package Exercises;

import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        //Değişkenler
        int  a, b;
        double c;

        //Veriler
        Scanner input = new Scanner(System.in);
        System.out.println("1. Kenar");
        a = input.nextInt();
        System.out.println("2. Kenar");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hafta1.Hipotenus :"+ c);

    }
}
