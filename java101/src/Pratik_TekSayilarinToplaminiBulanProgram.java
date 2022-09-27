import java.util.Scanner;

public class Pratik_TekSayilarinToplaminiBulanProgram {
    public static void main(String[] args) {
        /*Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
         tek sayıları toplayıp ekrana basan programı yazıyoruz.
          Ödev
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/

        int a,toplam = 0;
        Scanner inp = new Scanner(System.in);

 /*       do {
            System.out.print("Sayi giriniz: ");
            a = inp.nextInt();
            {
                if (!(a % 2 == 0))
                    toplam += a;
            }
        }while (a>0);
        System.out.println("Toplam: " + toplam);*/

        do {
            System.out.print("Sayi Giriniz: ");
            a=inp.nextInt();
            if ((a%2==0)&&(a%4==0)){
                toplam=toplam+a;
            }
        }while (a>0);
        System.out.println("Girilen Sayilarin Toplami: "+toplam);
    }
}




