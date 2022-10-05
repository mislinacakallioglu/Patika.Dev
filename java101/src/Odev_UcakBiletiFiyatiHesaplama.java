package java101.src;

import java.util.Scanner;

public class Odev_UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {

        int mesafe,yas,yolculukTipi;
        double normalTutar,indirimOrani,yasIndrimi;

        Scanner inp = new Scanner(System.in);


        System.out.print("Lutfen gidilecek mesafeyi(km) giriniz: ");
        mesafe = inp.nextInt();

        System.out.print("Lutfen yasinizi  giriniz: ");
        yas = inp.nextInt();

        System.out.print("Lutfen yolculuk tipini seciniz(1 = Tek Yon ,2 = Gidis/Donus): ");
        yolculukTipi = inp.nextInt();


        normalTutar = mesafe * 0.10;


        if (yas <12)
            indirimOrani = 0.5;
        else  if(yas <=24)
            indirimOrani = 0.9;
        else if (yas>65)
            indirimOrani = 07;
        else
            indirimOrani =1;

        yasIndrimi = normalTutar * indirimOrani;

        if ((!(yolculukTipi==1 || yolculukTipi==2)) || (mesafe<0) || (yas<0))
            System.out.println("Hatali girdiniz.Lutfen tekrar deneyiniz: ");
        else
            if (yolculukTipi==2)
                System.out.println("Ucak bileti ucretiniz: " + yasIndrimi * 0.8 * 2 + " TL");
            else
                System.out.println("Ucak bileti ucretiniz: " + yasIndrimi + " TL");

    }
}
