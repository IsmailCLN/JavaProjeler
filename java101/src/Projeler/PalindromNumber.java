package Metotlar;

import java.util.Scanner;

public class PalindromNumber {
    static boolean isPalindrom(int number){
        int tempNumber = number, reverseNumber = 0, lastNumber;
        while (tempNumber != 0){
            lastNumber = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            tempNumber /= 10;
        }
        if (number == reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = inp.nextInt();
        if(isPalindrom(number) == true){
            System.out.println("Sayı palindrom sayıdır.");
        }else
            System.out.println("Palindrom sayı değildir.");
    }
}
