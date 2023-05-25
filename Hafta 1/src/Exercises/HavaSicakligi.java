package Exercises;
import java.util.Scanner;
public class HavaSicakligi {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat = input.nextInt();
        if (heat < 5){
            System.out.println("Kayma'ya gidebilirsiniz. ");
        }else if (heat <= 15){
            System.out.println("Sinema'ya gidebilirsiniz. ");
        }else if (heat >=15) {
            System.out.println("Pikniğe gidebilirsiniz. ");
        }else if (heat >=25){
            System.out.println("Yüzme'ye gidebilirsiniz. ");
        }else {
            System.out.println("s");
        }
        System.out.println("İyi eğlenceler. ");
    }
}
