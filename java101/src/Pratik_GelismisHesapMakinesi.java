import java.util.Scanner;

public class Pratik_GelismisHesapMakinesi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            System.out.println("Hesap Makinesi");
            System.out.println("1- Toplama");
            System.out.println("2- Cikarma");
            System.out.println("3- Carpma");
            System.out.println("4- Bolme");
            System.out.println("5- Uslu Sayi Hesaplama");
            System.out.println("6- Faktoriyel Hesaplama");
            System.out.println("7- Mod Alma");
            System.out.println("8- Dikdörtgen Alan ve Cevre Hesabi");
            System.out.println("0- Cikis");
            System.out.print("Bir islem secin: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usluSayi();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    modAlma();
                    break;
                case 8:
                    dikdortgenHesapla();
                    break;
                case 0:
                    System.out.println("Hesap Makinesi kapatiliyor...");
                    break;
                default:
                    System.out.println("Gecersiz secim! Tekrar deneyin.");
            }
        } while (secim != 0);

        scanner.close();
    }

    static void toplama() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Toplanacak sayilari girin (virgulle ayirarak): ");
        String[] sayilar = scanner.nextLine().split(",");
        double toplam = 0;
        for (String sayi : sayilar) {
            toplam += Double.parseDouble(sayi.trim());
        }
        System.out.println("Toplam: " + toplam);
    }

    static void cikarma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cikarilacak sayilari girin (virgulle ayirarak): ");
        String[] sayilar = scanner.nextLine().split(",");
        double sonuc = Double.parseDouble(sayilar[0].trim());
        for (int i = 1; i < sayilar.length; i++) {
            sonuc -= Double.parseDouble(sayilar[i].trim());
        }
        System.out.println("Sonuc: " + sonuc);
    }

    static void carpma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Carpilacak sayilari girin (virgulle ayirarak): ");
        String[] sayilar = scanner.nextLine().split(",");
        double carpim = 1;
        for (String sayi : sayilar) {
            carpim *= Double.parseDouble(sayi.trim());
        }
        System.out.println("Carpim: " + carpim);
    }

    static void bolme() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bolüuecek sayilari girin (virgulle ayirarak): ");
        String[] sayilar = scanner.nextLine().split(",");
        double bolum = Double.parseDouble(sayilar[0].trim());
        for (int i = 1; i < sayilar.length; i++) {
            double sayi = Double.parseDouble(sayilar[i].trim());
            if (sayi == 0) {
                System.out.println("Hata: Bolunen sayi sifir olamaz!");
                return;
            }
            bolum /= sayi;
        }
        System.out.println("Bolum: " + bolum);
    }

    static void usluSayi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tabani ve ussu girin (virgulle ayirarak): ");
        String[] inputs = scanner.nextLine().split(",");
        double taban = Double.parseDouble(inputs[0].trim());
        double us = Double.parseDouble(inputs[1].trim());
        double sonuc = Math.pow(taban, us);
        System.out.println("Sonuc: " + sonuc);
    }

    static void faktoriyel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktoriyeli alinacak sayiyi girin: ");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        System.out.println("Faktoriyel: " + faktoriyel);
    }

    static void modAlma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bolunecek sayiyi ve mod alinacak sayiyi girin (virgulle ayirarak): ");
        String[] inputs = scanner.nextLine().split(",");
        int bolunen = Integer.parseInt(inputs[0].trim());
        int mod = Integer.parseInt(inputs[1].trim());
        int kalan = bolunen % mod;
        System.out.println("Kalan: " + kalan);
    }

    static void dikdortgenHesapla() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dikdortgenin uzun kenarini girin: ");
        double uzunKenar = scanner.nextDouble();
        System.out.print("Dikdortgenin kisa kenarini girin: ");
        double kisaKenar = scanner.nextDouble();
        double alan = uzunKenar * kisaKenar;
        double cevre = 2 * (uzunKenar + kisaKenar);
        System.out.println("Alan: " + alan);
        System.out.println("Cevre: " + cevre);
    }
}
