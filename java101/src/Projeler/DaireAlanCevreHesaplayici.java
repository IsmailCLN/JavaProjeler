package Projeler;

import java.util.Scanner;

public class DaireAlanCevreHesaplayici {
    public static void main(String[] args) {
        double pi=3.14, r, alan, cevre, aci;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen Yarıçap Bilgisini Giriniz: ");
        r = girdi.nextDouble();
        System.out.print("Lütfen Daire Diliminin Açı Bilgisini Giriniz: ");
        aci = girdi.nextDouble();

        cevre = 2 * pi * r;
        alan = (pi * (r * r) * aci)/360;

        System.out.println("Dairenin Çevresi: "+cevre);
        System.out.println("Daire Diliminin Alanı: "+alan);

    }
}
