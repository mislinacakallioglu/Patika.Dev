import java.util.Scanner;

public class Pratik_TaksimetreHesaplayanProgram {
    public static void main(String[] args) {
        /*
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
    -Taksimetre KM başına 2.20 TL tutmaktadır.
    -Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    -Taksimetre açılış ücreti 10 TL'dir.*/

        double mesafe,taksimetreKm,taksimetreTutar;
        int taksimetreAcilis=20;
        taksimetreKm = 2.20;
        Scanner input= new Scanner(System.in);

        System.out.print("Taksimetre km mesafesini giriniz: ");
        mesafe = input.nextDouble();
        taksimetreTutar = taksimetreKm * mesafe;

        System.out.println(taksimetreTutar < 20 ? "Odenecek tutar:" + taksimetreAcilis : "Odenecek tutar: " + taksimetreTutar);
    }
}
