import java.util.Scanner;

public class Pratik_UsluSayiHesaplayanProgram {
    public static void main(String[] args) {
    /*Ödev
      Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.*/

        int a,b,sonuc=1;

        Scanner inp=new Scanner(System.in);

        System.out.print("Ussu alinan sayiyi giriniz: ");
        a=inp.nextInt();
        System.out.print("Us alinan sayiyi giriniz:");
        b=inp.nextInt();

        for (int i=1;i<=b;i++)
            sonuc *=a;

        System.out.println(sonuc);
    }
}
