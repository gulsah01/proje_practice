package soru_cevap.replitSorular;

import java.util.Scanner;

public class RG09_Str {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz: ");
        String str1=scan.nextLine();
        System.out.println("Lutfen eklemek istediginiz ikinci kelimeyi giriniz:");
        String str2=scan.nextLine();


        String yeniCumle=str1+" ".concat(str2);
        System.out.println(yeniCumle);

    }
}
