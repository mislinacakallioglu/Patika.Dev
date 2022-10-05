import java.util.Scanner;

public class Pratik_EBOBEKOKBulanProgram {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int a, b;
        boolean c = false;

        do {
            System.out.print("1. sayiyi degerini giriniz: ");
            a = inp.nextInt();
            System.out.print("2. sayiyi degerini giriniz: ");
            b = inp.nextInt();
            if (a <= 0 || b <= 0)
                System.out.println("Pozitif sayi giriniz: ");
            else {
                c = true;
            }
        } while (!c);

        if (b < a) { // a4 b3
            int n1 = b;
            b = a;
            a = n1;
        }
        int i = a;
        while (i >= 1) {
            if ((a % i == 0) && (b % i == 0)) {
                System.out.println("Ebob : " + i);
                break;
            } else {
                i--;
            }
        }
        int j = b;
        while (j <= (a * b)) {
            if ((j % a == 0) && (j % b == 0)) {
                System.out.println("ekok : " + j);
                break;
            } else {
                j++;
            }
        }
    }
}
