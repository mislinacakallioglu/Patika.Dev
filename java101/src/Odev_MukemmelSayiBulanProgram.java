import java.util.Scanner;

public class Odev_MukemmelSayiBulanProgram {
    public static void main(String[] args) {

    /*Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise
    ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
    Mükemmel Sayı Nedir ?
    Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
    toplamı kendisine eşit olan sayıya mükemmel sayı denir.*/

        Scanner inp=new Scanner(System.in);

        int sayi,toplam=0;

        System.out.print("Sayi giriniz: ");
        sayi=inp.nextInt();

        for(int i=1;i<sayi;i++)
        {
            if (sayi %i ==0)
            {
                toplam = toplam + i;
            }
        }

        if (sayi == toplam)
        {
            System.out.print("Mukemmel sayidir. ");
        }
        else
            System.out.print("Mukemmel sayi degildir. ");
    }
}
