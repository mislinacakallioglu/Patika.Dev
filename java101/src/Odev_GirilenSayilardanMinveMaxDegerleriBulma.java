import java.util.Scanner;


public class Odev_GirilenSayilardanMinveMaxDegerleriBulma
{
    public static void main(String[] args) {
    /*Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan
    ve bu sayıları ekrana yazan programı yazın.*/

        Scanner inp = new Scanner(System.in);
        int a,max=0,sayi,min=0;



        System.out.print("Kac adet sayi gireceksiniz:");
        a=inp.nextInt();

        for (int i=1;i<=a;i++)
        {
            System.out.print(i + ".sayiyi girin:");
            sayi=inp.nextInt();

            if(i==0)
            {
                max=sayi;
                min=sayi;
            }

            if (sayi>max)
            {
                max=sayi;
            }

            if (sayi<min)
            {
                min=sayi;
            }
        }

        System.out.println("Girilen en kucuk sayi: " +min);
        System.out.println("Girilen en buyuk sayi: "+ max);

    }
}
