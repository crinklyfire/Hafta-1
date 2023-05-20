package Exercises;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        //Değişkenler
        double Armut, Elma, Domates, Muz, Patlican;

        //Veriler
        Scanner input = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo : ");
        Armut = input.nextInt();

        System.out.println("Elma Kaç Kilo : ");
        Elma = input.nextInt();

        System.out.println("Domates Kaç Kilo : ");
        Domates = input.nextInt();

        System.out.println("Muz Kaç Kilo : ");
        Muz = input.nextInt();

        System.out.println("Patlıcan Kaç Kilo : ");
        Patlican = input.nextInt();

        double Toplam = (Armut*2.14 + Elma*3.67 + Domates*1.11 + Muz*0.95 + Patlican*5.00);
        double Tutar = Toplam;

        System.out.println(Tutar);
    }
}
