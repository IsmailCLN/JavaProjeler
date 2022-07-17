package Projeler;

import java.util.Scanner;

public class KdvHesaplayıcı {
    public static void main(String[] args) {
        double kdvsizfiyat, kdvlifiyat, kdvtutari, kdv = 0.18;
        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen Ürün Fiyatını Giriniz: ");
        kdvsizfiyat = inp.nextDouble();
        kdvlifiyat = (kdvsizfiyat * kdv) + kdvsizfiyat;
        kdvtutari = kdvsizfiyat * kdv;

        System.out.println("KDV Oranı:" + kdv);
        System.out.println("KDV Tutarı:" + kdvtutari);
        System.out.println("KDV'siz Fiyat:" + kdvsizfiyat);
        System.out.println("KDV'li Fiyat:" + kdvlifiyat);




    }

}
