package Projeler;

import java.util.Scanner;

public class UcakBiletiFiyatı {
    public static void main(String[] args) {
        int age, km, type;
        double total;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Yaş Bilgisini Giriniz: ");
        age = input.nextInt();
        System.out.print("Lütfen Gidilecek Mesafe Bilgisini Giriniz: ");
        km = input.nextInt();
        System.out.print("Lütfen Yolculuk Tipini (Tek Yön: 1, Gidiş/Dönüş: 2) Giriniz: ");
        type = input.nextInt();

        if ((age > 0) && (age <= 12)) {
            total = ((km * type) * 0.05);
            if (type == 2) {
                total *= 0.8;
            }
        } else if ((age > 12) && (age <= 24)) {
            total = ((km * type) * 0.09);
            if (type == 2) {
                total *= 0.8;
            }
        } else if ((age > 65)) {
            total = ((km * type) * 0.07);
            if (type == 2) {
                total *= 0.8;
            }
        } else {
            total = 0;
            System.out.print("Hatalı Bir Değer Girdiniz");
        }
        System.out.print("Toplam: " + total);
    }
}
