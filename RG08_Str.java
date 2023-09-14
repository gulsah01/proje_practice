package soru_cevap.replitSorular;

import java.util.Scanner;

public class RG08_Str {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz: ");
        String kelime=scanner.nextLine();
        String tersKelime="";
        for (int i = kelime.length()-1; i >= 0; i--) {
            tersKelime+=kelime.charAt(i);


        }
        System.out.println(tersKelime);

    }
}
