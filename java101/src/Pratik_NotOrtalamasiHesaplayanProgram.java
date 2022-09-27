import java.util.Scanner;

public class Pratik_NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,tarih,muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz: ");
        matematik=input.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fizik=input.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimya=input.nextInt();

        System.out.print("Turkce notunu giriniz: ");
        turkce=input.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarih=input.nextInt();

        System.out.print("Muzik notunu giriniz: ");
        muzik=input.nextInt();

        double ortalama=((fizik+matematik+tarih+kimya+muzik+turkce)/6.0);
        System.out.println("Nor ortalamaniz: " + ortalama);

        System.out.println(ortalama > 60 ? "Sinifi Geçti" : "Sinifta Kaldi");
    }
}
