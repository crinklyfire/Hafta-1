package Exercises;
import java.util.Scanner;
public class HavaSicakligi {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat = input.nextInt();
        if (heat < 5){
            System.out.print("Kayma'ya gidebilirsiniz. ");

        }else if (heat <= 25){
            if (heat <= 15);{
                System.out.println("Sinema'ya gidebilirsiniz. ");
            }
            if (heat >= 10);
            System.out.println("Pikniğe gidebilirsiniz. ");
        }else{
            System.out.print("Yüzme'ye gidebilirsiniz. ");
        }
    }
}
