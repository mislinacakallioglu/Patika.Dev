import java.util.Scanner;

public class Odev_TersUcgenYapimi {
    public static void main(String[] args) {

                /*Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
        yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.*/

        Scanner inp = new Scanner(System.in);


        System.out.print("Satir sayisi girin: ");
        int s=inp.nextInt();

        for (int i=0;i<s;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for (int k=2*s-1;k>=(2*i+1);k--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
