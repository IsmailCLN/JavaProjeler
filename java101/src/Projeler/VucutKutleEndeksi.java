package Projeler;

import java.util.Scanner;

public class VucutKutleEndeksi {
    public static void main(String[] args) {
        double boy, kilo, endeks;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Lütfen Boyunuz Metre Cinsinden Giriniz: ");
        boy = girdi.nextDouble();

        System.out.print("Lütfen Kilonuzu Kilogram Cinsinden Giriniz: ");
        kilo = girdi.nextDouble();

        endeks = kilo / (boy * boy);

        System.out.print("Vücut Kütle Endeksiniz: "+endeks);
    }
}
