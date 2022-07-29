package Projeler;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year, result;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Yıl Bilgisini Giriniz: ");
        year = input.nextInt();
        result = (year % 4);

        switch (result) {
            case 0:
                if ((year % 400 != 0) && (year % 100 == 0)) {
                    System.out.print("Artık Yıl Değildir");
                } else {
                    System.out.print("Artık Yıldır");
                }
                break;
            case 1:
                System.out.print("Artık Yıl Değildir");
                break;
            case 2:
                System.out.print("Artık Yıl Değildir");
                break;
            case 3:
                System.out.print("Artık Yıl Değildir");
                break;
        }
    }
}
