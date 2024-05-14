import java.util.Scanner;

public class Odev_AsalSayi {
    static boolean asalMi(int sayi, int bolen) {
        if (sayi <= 2) {
            return (sayi == 2);
        }
        if (sayi % bolen == 0) {
            return false;
        }
        if (bolen * bolen > sayi) {
            return true;
        }
        return asalMi(sayi, bolen + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        int sayi = scanner.nextInt();
        scanner.close();

        if (asalMi(sayi, 2)) {
            System.out.println(sayi + " sayisi ASAL!");
        } else {
            System.out.println(sayi + " sayisi ASAL degildir!");
        }
    }
}
