import java.util.Scanner;

public class Odev_ManavKasaProgrami {
    public static void main(String[] args) {
        /*Manav Kasa Programı
    Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
    Meyveler ve KG Fiyatları
    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL
    Örnek Çıktı;
    Armut Kaç Kilo ? :0
    Elma Kaç Kilo ? :1
    Domates Kaç Kilo ? :1
    Muz Kaç Kilo ? :2
    Patlıcan Kaç Kilo ? :3
    Toplam Tutar : 21.68 TL*/

        double armut,elma,domates,muz,patlican,toplam;
        Scanner input= new Scanner(System.in);

        System.out.print("Kac kilo armut aldiniz: ");
        armut = input.nextInt();
        System.out.print("Kac kilo elma aldiniz: ");
        elma = input.nextInt();
        System.out.print("Kac kilo domates aldiniz: ");
        domates = input.nextInt();
        System.out.print("Kac kilo muz aldiniz: ");
        muz = input.nextInt();
        System.out.print("Kac kilo patlican aldiniz: ");
        patlican = input.nextInt();

        toplam=((armut*2.14) + (elma*3.67) + (domates*1.11) + (muz*0.95) + (patlican*5.0));
        System.out.println("Toplam Ucret: " + toplam);



    }
}
