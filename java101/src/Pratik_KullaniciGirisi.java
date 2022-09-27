import java.util.Scanner;
import java.lang.String;

public class Pratik_KullaniciGirisi {
    public static void main(String[] args) {
    /*
        Ödev
    Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
    eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
    unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
    şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
    sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/

        String userName, password, sifirlama, newPassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici adinizi giriniz: ");
        userName = input.nextLine();
        System.out.print("Sifrenizi giriniz: ");
        password = input.nextLine();

        if (userName.equals("mislina") && password.equals("4321"))
            System.out.println("Giris Yaptiniz... ");

        else if (!(userName.equals("mislina") && password.equalsIgnoreCase(""))) {
            System.out.println("Kullanici adiniz veya sifreniz hatali.");
            System.out.print("Sifrenizi sifirlamak ister misiniz? (E/H):");
            sifirlama = input.nextLine();
            if (sifirlama.equals("H")) {
                System.out.print("Lutfen tekrar giris yapmak icin sayfayi yenileyiniz.");
            } else if (sifirlama.equals("E")) {
                System.out.print("Yeni sifrenizi giriniz: ");
                newPassword = input.nextLine();

                while (newPassword.equals("4321") || newPassword.equals(password)) {
                    System.out.print("Sifreniz olusturulamadi. Farkli bir sifre ile tekrar deneyin: ");
                    newPassword = input.nextLine();
                }
                System.out.print("Sifreniz basariyla olusturuldu.\nYeniden Giris yapabilirsiniz.\nKullanici Adiniz: ");
                userName = input.nextLine();
                System.out.print("Sifreniz: ");
                password = input.nextLine();

                if (userName.equals("mislina") && password.equals(newPassword)) {
                    System.out.print("Basariyla giris yapildi...");
                } else {
                    System.out.println("Kullanici adiniz veya sifreniz hatali.");
                }
            }
        }
    }
}