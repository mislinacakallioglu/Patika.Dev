
public class Odev_1_100ArasindakiAsalSayilariBulanProgram {
    public static void main(String[] args) {


        for ( int sayi = 2; sayi <= 100; sayi++)
        {
            boolean sonuc = true;
            for (int i = 2; i < sayi; i++)
            {

                if (sayi % i == 0) {
                    sonuc = false;
                    break;
                }
            }
            if (sonuc) {
                System.out.println(sayi + " asal sayidir. ");
            }
        }
    }
}
