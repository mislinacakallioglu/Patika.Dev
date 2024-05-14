import java.util.Scanner;

public class Odev_UsHesaplama {

    static int usHesapla(int taban, int us) {
        if (us == 0) {
            return 1;
        } else {
            return taban * usHesapla(taban, us - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban degeri giriniz: ");
        int taban = scanner.nextInt();
        System.out.print("Us degerini giriniz: ");
        int us = scanner.nextInt();
        scanner.close();

        int sonuc = usHesapla(taban, us);
        System.out.println("Sonuc: " + sonuc);
    }
}
