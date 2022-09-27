import java.util.Scanner;

public class Pratik_HesapMakinesi {
    public static void main(String[] args) {

        int sayi1,sayi2,sonuc;
        char islem;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayiyi girin: ");
        sayi1 = input.nextInt();
        System.out.print("Ikinci sayiyi girin: ");
        sayi2 = input.nextInt();
        System.out.print("Islem girin: ");
        islem = input.next().charAt(0);
        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                System.out.print("Sonuc: " + sonuc);break;
            case '-':
                sonuc = sayi1 - sayi2;
                System.out.print("Sonuc: " + sonuc);break;
            case '/':
                sonuc = sayi1 / sayi2;
                System.out.print("Sonuc: " + sonuc);break;
            case '*':
                sonuc = sayi1 * sayi2;
                System.out.print("Sonuc: " + sonuc);break;
        }
    }
}
