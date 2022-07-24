package Projeler;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String id, pass;
        Scanner inp = Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz: ");
        id = inp.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        pass = inp.nextLine();

        if (id.equals("patika") && pass.equals("java123")){
            System.out.println("Giriş Yaptınız");
        } else {
            System.out.println("Hatalı Kullanıcı Adı veya Şifre Girdiniz");
        }
    }
}
