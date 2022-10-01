import java.util.Scanner;

public class Pratik_HarmonikSayilariBulanProgram {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n;
        double sonuc=0;

        System.out.println("N sayisini giriniz: ");
        n=inp.nextInt();

        for (double i=1;i<=n;i++){
            sonuc+=(1/i);
        }

        System.out.println("Sonuc: " + sonuc);

    }
}
