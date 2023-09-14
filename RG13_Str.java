package soru_cevap.replitSorular;

import java.util.Scanner;

/*13----
    Bir palindrom, madam veya racecar veya 10801 sayısı gibi
    ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.
    Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.

    Test Data:
    madam

    Beklenen Çıktı:
    True
    */
public class RG13_Str {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen palindrom kontrolu yapmak istediginiz kelimeyi yada sayiyi giriniz ");
        String input=scan.nextLine();

        StringBuilder sb=new StringBuilder(input);
        if (sb.reverse().toString().equalsIgnoreCase(input)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }


    }


}
