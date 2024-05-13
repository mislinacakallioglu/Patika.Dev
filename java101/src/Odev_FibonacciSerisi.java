import java.util.Scanner;

public class Odev_FibonacciSerisi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int a=0,b=1,c;
        System.out.print("Eleman sayisi girin: ");
        int elemanSayisi=inp.nextInt();

        System.out.println("Fibonacci serisi: ");

        for (int i = 0; i <elemanSayisi ; i++)
        {
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
