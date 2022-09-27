import java.util.Scanner;

public class Pratik_SayilariBuyuktenKucugeSiralama {
    public static void main(String[] args) {
        /*Ödev
    Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.*/

        int a,b,c;
        Scanner inp = new Scanner(System.in);

       System.out.print("Sayi giriniz: ");
        a= inp.nextInt();
        System.out.print("Sayi giriniz: ");
        b= inp.nextInt();
        System.out.print("Sayi giriniz: ");
        c= inp.nextInt();

        if (a>b && a>c)
        {
            if (b>c)
                System.out.println("a > b > c: " + a + b + c);
            else
                System.out.println("a > c > b: " + a + c + b);
        }
        else if (b>a && b>c)
        {
            if (a>c)
                System.out.println("b > a > c: " + b + a + c);
            else
                System.out.println("b > c > a: " + b + c + a);
        }
        else
        {
            if (a>b)
                System.out.println("c > a > b:" + c + a + b);
            else
                System.out.println("c > b > a:" + c + b + a);
        }
    }
}
