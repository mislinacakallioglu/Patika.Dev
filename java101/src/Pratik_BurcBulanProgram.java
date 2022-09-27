import java.util.Scanner;

public class Pratik_BurcBulanProgram {
    public static void main(String[] args) {
        /*Koç Burcu : 21 Mart - 20 Nisan
    Boğa Burcu : 21 Nisan - 21 Mayıs
    İkizler Burcu : 22 Mayıs - 22 Haziran
    Yengeç Burcu : 23 Haziran - 22 Temmuz
    Aslan Burcu : 23 Temmuz - 22 Ağustos
    Başak Burcu : 23 Ağustos - 22 Eylül
    Terazi Burcu : 23 Eylül - 22 Ekim
    Akrep Burcu : 23 Ekim - 21 Kasım
    Yay Burcu : 22 Kasım - 21 Aralık
    Oğlak Burcu : 22 Aralık - 21 Oca
    Kova Burcu : 22 Ocak - 19 Şubat
    Balık Burcu : 20 Şubat - 20 Mart
    Ödev
    Aynı örneği switch-case kullanmadan yapınız.*/

        int gun;
        String ay;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lutfen dogdugunuz ayi giriniz: ");
        ay=inp.next();

        System.out.print("Lutfen dogdugunuz gunu giriniz");
        gun=inp.nextInt();

        String burc="";

        if (ay.equalsIgnoreCase("Ocak"))
        {
            if (gun>22)
                burc="Kova";
            else
                burc="Oglak";
        }
        if (ay.equalsIgnoreCase("Subat"))
        {
            if (gun>20)
                burc="Balik";
            else
                burc="Kova";
        }
        if (ay.equalsIgnoreCase("Mart"))
        {
            if (gun>21)
                burc="Koc";
            else
                burc="Balik";
        }
        if (ay.equalsIgnoreCase("Nisan"))
        {
            if (gun>21)
                burc="Boga";
            else
                burc="Koc";
        }
        if (ay.equalsIgnoreCase("Mayis"))
        {
            if (gun>22)
                burc="İkizler";
            else
                burc="Boga";
        }
        if (ay.equalsIgnoreCase("Haziran"))
        {
            if (gun>23)
                burc="Yengec";
            else
                burc="İkizler";
        }
        if (ay.equalsIgnoreCase("Temmuz"))
        {
            if (gun>23)
                burc="Aslan";
            else
                burc="Yengec";
        }
        if (ay.equalsIgnoreCase("Agustos"))
        {
            if (gun>23)
                burc="Basak";
            else
                burc="Aslan";
        }
        if (ay.equalsIgnoreCase("Eylul"))
        {
            if (gun>23)
                burc="Terazi";
            else
                burc="Basak";
        }
        if (ay.equalsIgnoreCase("Ekim"))
        {
            if (gun>23)
                burc="Akrep";
            else
                burc="Terazi";
        }
        if (ay.equalsIgnoreCase("Kasim"))
        {
            if (gun>22)
                burc="Yay";
            else
                burc="Akrep";
        }
        if (ay.equalsIgnoreCase("Aralik"))
        {
            if (gun>22)
                burc="Oglak";
            else
                burc="Yay";
        }
        System.out.println(gun+" "+ay+" "+" gununde dogduysaniz burcunuz da "+burc+" olur");

    }
}
