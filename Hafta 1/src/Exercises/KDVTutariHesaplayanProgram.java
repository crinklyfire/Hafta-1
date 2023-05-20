package Exercises;

import java.util.Scanner;
public class KDVTutariHesaplayanProgram {
    public static void main(String[] args) {
        double tutar,kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Miktarını Giriniz");
        tutar = input.nextDouble();
        double kdvMiktar = tutar * kdvOran;
        double kdvliMiktar = tutar + kdvMiktar;

        System.out.println("KDV'siz Tutar :"+ tutar);
        System.out.println("KDV Oranı :"+ kdvOran);
        System.out.println("KDV Tutarı :"+ kdvMiktar);
        System.out.println("KDV'li Tutarı :"+ kdvliMiktar);




    }
}
