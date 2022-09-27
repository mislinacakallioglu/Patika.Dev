import java.sql.SQLOutput;
import java.util.Scanner;

public class Pratik_KDVTutariHesaplayanProgram {
    public static void main(String[] args) {
        /*
    Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
    (Not : KDV tutarını 18% olarak alın)
    KDV'siz Fiyat = 10;
    KDV'li Fiyat = 11.8;
    KDV tutarı = 1.8;
    Ödev
    Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/

        double tutar,kdvOrani,kdvTutar,kdvliTutar ;
        Scanner input= new Scanner(System.in);
        System.out.print("Ucret Tutarini Giriniz: ");

        tutar = input.nextDouble();


        if (tutar <=1000)
        {
            kdvOrani = 0.18;
            kdvTutar = tutar * kdvOrani;
            kdvliTutar= tutar + kdvTutar;
            System.out.println("KDV Orani: " + kdvOrani);
            System.out.println("KDV Tutari: " + kdvTutar);
            System.out.println("KDV'li Tutar: " + kdvliTutar);
        }
        else
        {
            kdvOrani = 0.08;
            kdvTutar = tutar * kdvOrani;
            kdvliTutar= tutar + kdvTutar;
            System.out.println("KDV Orani: " + kdvOrani);
            System.out.println("KDV Tutari: " + kdvTutar);
            System.out.println("KDV'li Tutar: " + kdvliTutar);
        }
    }
}
