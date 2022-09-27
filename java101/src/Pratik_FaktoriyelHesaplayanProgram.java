import java.util.Scanner;

public class Pratik_FaktoriyelHesaplayanProgram {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

            /*Ödev
    N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
    n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
    Java ile kombinasyon hesaplayan program yazınız.
    Kombinasyon formülü
    C(n,r) = n! / (r! * (n-r)!)*/

        int a,toplam=1,n,r,toplamN=1,toplamR=1,c,d=1,kombinasyon;
        System.out.print("Faktoriyel sayisi giriniz: ");
        a=inp.nextInt();

        for (int i=1;i<=a;i++)
        {
            toplam=toplam*i;
        }
        System.out.println("Faktoriyel: " + toplam);

        System.out.print("n degerini giriniz: ");
        n=inp.nextInt();
        System.out.print("r degerini giriniz: ");
        r=inp.nextInt();

        for(int i=1; i<=n; i++){
            toplamN *= i;
        }
        for (int i=1;i<=r;i++){
            toplamR *= i;
        }
        c=(n-r);

        for (int i=1; i<=c;i++){
            d*=i;
        }

        kombinasyon=toplamN/ (toplamR*d);
        if (n > r){
            System.out.println("N'in R'li kombinasyonu : " + kombinasyon);

        }else {
            System.out.print("R sayiai N sayisindan buyuk olamaz.Tekrar giriniz !");
        }
    }
}
