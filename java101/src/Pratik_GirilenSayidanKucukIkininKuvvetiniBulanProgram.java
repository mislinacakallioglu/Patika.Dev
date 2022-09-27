import java.util.Scanner;

public class Pratik_GirilenSayidanKucukIkininKuvvetiniBulanProgram {
    public static void main(String[] args) {
        /*Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
        Ödev
        Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.*/

        Scanner inp = new Scanner(System.in);
        int a;
        System.out.print("Sayi giriniz:");
        a=inp.nextInt();

        for (int i=0;i<=a;i+=2)
        {
            System.out.println("2'nin katlari:" + i);
        }
        for (int i=0;i<=a;i+=2)
        {
                if ((i % 4 == 0) && (i % 5 == 0))
                    System.out.println("4 ve 5'in katlari: " + i);
        }
    }
}
