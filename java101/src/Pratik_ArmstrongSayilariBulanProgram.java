import java.util.Scanner;

public class Pratik_ArmstrongSayilariBulanProgram {

        public static void main(String[] args) {
            /*Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.*/

            Scanner input = new Scanner(System.in);
            System.out.print("Sayi giriniz: ");
            int sayi = input.nextInt();
            int deger=0,sonuc = 0;

            while (sayi != 0) {
                sonuc =(sayi%10)+sonuc;
                sayi /= 10;
                ++deger;
            }
            System.out.println("Basamak degerleri toplami: " + sonuc);

        }
}

