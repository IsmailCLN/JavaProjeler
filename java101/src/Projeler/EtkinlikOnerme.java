import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık Değerini Giriniz: ");
        int sicaklik = input.nextInt();

        System.out.println("Yapabileceğin Etkinlikler:");
        if (sicaklik > 25) {
            System.out.println("*Yüzme");
        } else if (sicaklik >= 15) {
            System.out.println("*Piknik");
        } else if (sicaklik >= 10) {
            System.out.println("*Piknik");
            System.out.println("*Sinema");
        } else if (sicaklik >= 5) {
            System.out.println("*Sinema");
        } else {
            System.out.println("*Kayak");
        }
    }
}