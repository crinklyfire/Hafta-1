package Exercises;

import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        int year, month;

        String zodiac = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz : ");
        year = input.nextInt();
        month = year % 12;

        if ((0 <= month) && (month <= 11)){
            switch (month){
                case 0:
                    zodiac = "Maymun";
                    System.out.print("Çin Zodyağı Burcunuz : " + zodiac);
                    break;

                case 1:
                    zodiac = "Horoz";
                    System.out.print("Çin Zodyağı Burcunuz : " + zodiac);
                    break;

                case 2:
                    zodiac = "Köpek";
                    System.out.print("Çin Zodyağı Burcunuz : " + zodiac);
                    break;

                case 3:
                    zodiac = "Domuz";
                    System.out.print("Çin Zodyağı Burcunuz : " + zodiac);
                    break;

                case 4:
                    zodiac = "Fare";
                    System.out.print("Çin Zodyağı Burcunuz : " + zodiac);
                    break;

                case 5:
                    zodiac = "Öküz";
                    System.out.print("Çin Zodyağı Burcunuz : " + zodiac);
                    break;

                case 6:
                    zodiac = "Kaplan";
                    System.out.print("Çin Zodyağı Burcunuz : " + zodiac);
                    break;

                case 7:
                    zodiac = "Tavşan";
                    System.out.print("Çin Zodyağı Burcunuz : " + zodiac);
                    break;

                case 8:
                    month = year % 12;
                    zodiac = "Ejderha";
                    System.out.print("Çin Zodyağı Burcunuz : " + zodiac);
                    break;

                case 9:
                    month = year % 12;
                    zodiac = "Yılan";
                    System.out.print("Çin Zodyağı Burcunuz : " + zodiac);
                    break;

                case 10:
                    zodiac = "At";
                    System.out.print("Çin Zodyağı Burcunuz : " + zodiac);
                    break;

                case 11:
                    zodiac = "Koyun";
                    System.out.print("Çin Zodyağı Burcunuz : " + zodiac);
                    break;
                default:
                    System.out.print("Hatalı giriş. Lütfen tekrar deneyiniz!");
            }

        }else {
            System.out.print("Hatalı giriş. Lütfen kontrol edip tekrar deneyiniz!");
        }
    }
}
