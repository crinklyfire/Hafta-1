package Exercises;

import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        //Değişkenler
        double boy, kg, indeks;

        //Veriler
        Scanner input = new Scanner(System.in);
        System.out.println("Kilonuzu Giriniz : ");
        kg = input.nextDouble();

        System.out.println("Boyunuzu (metre cinsinden) Giriniz : ");
        boy = input.nextDouble();

        indeks = kg / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);


    }
}
