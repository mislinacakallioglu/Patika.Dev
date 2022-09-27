import  java.util.Scanner;

public class Pratik_GirilenSayiyaKadarOlanCiftSayilariBulanProgram {
    public static void main(String[] args) {
            /*Ödev
    Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
    3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.*/

        Scanner inp = new Scanner(System.in);
        int a,toplamSayi=0,toplam=0,ortalama;

        System.out.print("Sayi giriniz: ");
        a= inp.nextInt();

        for (int i=0 ; i<=a ; i++)
        {
            {
                if (i % 2 == 0)
                    System.out.println("Cift sayilar: " + i);
            }

            if ((i % 3==0)&&(i%4==0))
            {
                toplamSayi +=i;
                toplam++;
            }
        }
        ortalama=toplamSayi/toplam;
        System.out.println("Ortalama: " + ortalama);


    }
}
