package soru_cevap.replitSorular;

import java.util.Scanner;

public class RG11_Str {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz: ");
        String kelimne=scanner.nextLine();

        String yeniKelime=kelimne.substring(0,kelimne.length()-1);
        System.out.println(yeniKelime);
    }
}
