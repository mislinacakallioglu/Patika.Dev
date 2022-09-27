import java.util.Scanner;

public class Pratik_DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {
/*
       Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
       Ödev
       Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
       Formül
       Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
       𝑢 = (a+b+c) / 2
       Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
*/
        int a,b;
        double c,u,cevre,alan;
        Scanner input= new Scanner(System.in);

        System.out.print("1. Kenar Uzunlugunu Giriniz: ");
        a = input.nextInt();
        System.out.print("2. Kenar Uzunlugunu Giriniz: ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus: " + c);


        System.out.print("Birinci Kenar Uzunlugunu Giriniz: ");
        a = input.nextInt();
        System.out.print("Ikinci Kenar Uzunlugunu Giriniz: ");
        b = input.nextInt();
        System.out.print("Ucuncu Kenar Uzunlugunu Giriniz: ");
        c = input.nextInt();
        u = ((a+b+c) / 2);
        cevre = 2*u;
        alan = Math.sqrt(u * (u -a) * (u - b) * (u - c));

        System.out.println("Ucgenin Alani: " + alan);
        System.out.println("Ucgenin Cevresi: " + cevre);
    }
}
