import java.util.Scanner;

public class Pratik_DaireninAlaniniveCevresiniHesaplayanProgram {
    public static void main(String[] args) {
        /*
        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
    Alan Formülü : π * r * r;
    Çevre Formülü : 2 * π * r;
    Ödev
    Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
    𝜋 sayısını = 3.14 alınız.
    Formül : (𝜋 * (r*r) * 𝛼) / 360*/

        double pi=3.14,alan,cevre,r,merkezAci,formul;
        Scanner input= new Scanner(System.in);
        System.out.print("Yari capini Giriniz: ");
        r = input.nextDouble();
        alan = pi*r*r;
        cevre= 2*pi*r;

        System.out.println("Daire alan: " + alan);
        System.out.println("Daire cevre: " + cevre);
        System.out.print("Merkez Aci Giriniz: ");
        merkezAci = input.nextDouble();
        formul = (pi * (r*r) * merkezAci) / 360;
        System.out.println("Daire dilim alani: " + formul);
    }
}
