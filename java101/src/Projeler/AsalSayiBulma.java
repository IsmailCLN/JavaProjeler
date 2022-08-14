package Döngüler;

public class AsalSayiBulma {
    public static void main(String[] args) {
        int bolen = 0;
        for (int i = 1; i <= 100; i++) {
            int tempBolen = bolen;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    tempBolen++;
                    }
                }
            if (tempBolen == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
