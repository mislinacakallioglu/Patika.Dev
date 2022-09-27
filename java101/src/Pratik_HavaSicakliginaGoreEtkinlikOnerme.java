import java.util.Scanner;
public class Pratik_HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        /*
        Koşullar :
    - Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    - Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    - Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    - Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
    Ödev
    Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.*/


        int heat;
        Scanner inp = new Scanner(System.in);
        System.out.print("Derece giriniz: ");
        heat = inp.nextInt();

        if (heat <5)
            System.out.println("Kayak etkinligi yapabilirsiniz.. ");
        else if (heat >=5 && heat<=15)
            System.out.println("Sinema etkinligi yapabilirsiniz..");
        else if (heat>=15 && heat<=25)
            System.out.println("Piknik etkinligi yapabilirsiniz..");
        else
            System.out.println("Yuzme etkinligi yapabilirsiniz..");

    }
}
