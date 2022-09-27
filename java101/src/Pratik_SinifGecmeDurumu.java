import java.util.Scanner;

public class Pratik_SinifGecmeDurumu {
    public static void main(String[] args) {
          /*Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
    Geçme Notu : 55
    Ödev
    Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.*/

        int math, phy, tur, chem, mus;

        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik Notu: ");
        math = scan.nextInt();
        System.out.print("Fizik Notu: ");
        phy = scan.nextInt();
        System.out.print("Turkce Notu: ");
        tur = scan.nextInt();
        System.out.print("Kimya Notu: ");
        chem = scan.nextInt();
        System.out.print("Muzik Notu: ");
        mus = scan.nextInt();

        int totalPoint = 0;
        int totalLesson= 0;
        if(math >= 0 && math <= 100) {
            totalPoint += math;
            totalLesson++;
        }
        if(phy >= 0 && phy <= 100) {
            totalPoint += phy;
            totalLesson++;
        }
        if(tur >= 0 && tur <= 100) {
            totalPoint += tur;
            totalLesson++;
        }
        if(chem >= 0 && chem <= 100) {
            totalPoint += chem;
            totalLesson++;
        }
        if(mus >= 0 && mus <= 100) {
            totalPoint += mus;
            totalLesson++;
        }

        double avarage = (totalPoint)*1.0/totalLesson;

        if(avarage > 55) System.out.println("Sinifi gectiniz");
        else System.out.println("Sinifta kaldiniz!!");
        System.out.println("Ortalamaniz: "+ avarage);
    }
}

