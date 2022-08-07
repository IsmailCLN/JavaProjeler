package Döngüler;

import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String id, pass;
        int right = 3, select, balance = 1500;

        while (right > 0) {
            System.out.print("Kullanıcı Adınızı Giriniz: ");
            id = inp.nextLine();
            System.out.print("Şifrenizi Giriniz: ");
            pass = inp.nextLine();
            if (id.equals("ismail") && pass.equals("123456")) {
                System.out.print("Başarılı Giriş Yaptınız.");
                System.out.print("Lütfen Yapmak İstediğiniz İşlemi Tuşlayınız:\n" +
                        "Bakiye Sorgulama: 1\n" +
                        "Para Çekme: 2\n" +
                        "Para Yatırma: 3\n" +
                        "Çıkış: 4\n" +
                        "Seçiminiz: ");
                select = inp.nextInt();
                switch (select) {
                    case 1:
                        System.out.print("Hesabınızda " + balance + " TL bulunmaktadır.");
                        break;
                    case 2:
                        System.out.print("Lütfen Çekmek İstediğiniz Miktarı Giriniz: ");
                        int money = inp.nextInt();
                        if (money <= balance) {
                            balance -= money;
                        } else {
                            System.out.print("Yeterli Bakiyeniz Bulunmamaktadır.");
                        }
                        break;
                    case 3:
                        System.out.print("Lütfen Yatırmak İstediğiniz Miktarı Giriniz: ");
                        money = inp.nextInt();
                        balance += money;
                        break;
                    case 4:
                        break;
                }
            } else {
                right--;
                System.out.print("Hatalı Kullanıcı Adı/Şifre Girdiniz.");
                if (right == 0) {
                    System.out.print("Hesabınız Bloke Edilmiştir. Banka ile İletişime Geçiniz.");
                } else System.out.print("Kalan Hakkınız: " + right);
            }
        }
    }
}
