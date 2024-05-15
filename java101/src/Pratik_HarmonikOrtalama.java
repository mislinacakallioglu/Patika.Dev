import java.util.Scanner;

public class Pratik_HarmonikOrtalama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutunu girin: ");
        int deger = input.nextInt();

        double sonuc = 0;
        System.out.println("Dizi elemanlarini girin:");
        for (int i = 0; i < deger; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            sonuc += 1.0 / input.nextDouble();
        }

        System.out.println("Dizinin harmonik ortalamasi: " + deger / sonuc);
    }
}
