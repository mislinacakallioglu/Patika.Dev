import java.util.Scanner;
public class Odev_ArtikYilHesaplama {
    public static void main(String[] args) {

        int yil, sayi1 = 100, sayi2 = 400, sayi3 = 4;
        Scanner inp = new Scanner(System.in);


        System.out.print("Yil giriniz: ");
        yil = inp.nextInt();


        if( yil % sayi1 == 0){
            if( yil % sayi2== 0){
                System.out.println(yil + " artik yildir. ");
            }else{
                System.out.println(yil + " artik yil degildir.");
            }
        }else if( yil % sayi3 ==0){
            System.out.println(yil + " artik yildir. ");
        }else{
            System.out.println(yil + " artik yil degildir.");
        }
    }
}
