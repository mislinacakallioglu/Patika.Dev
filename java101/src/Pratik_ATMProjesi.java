import java.util.Scanner;

public class Pratik_ATMProjesi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String userName, password;
        int right = 3, balance = 1500, select;

        while (right > 0) {
            System.out.print("Kullanici adinizi: ");
            userName = inp.nextLine();
            System.out.print("Parolaniz: ");
            password = inp.nextLine();


            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz. ");
                do {
                    System.out.print("1- Para Yatirma\n " + "2- Para Cekme\n " + "3- Bakiye Sorgulama \n"
                            + "4- Cikis Yap\n");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz: ");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para miktari : ");
                            int price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktari : ");
                            price = inp.nextInt();
                            if (price > balance)
                                System.out.println("Bakiye yetersiz.");
                            else
                                balance -= price;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar gorusmek uzere.");
                            break;
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                System.out.println("Hatali kullanici adi veya parola girdiniz!, Tekrar deneyin");
                if (right == 0) {
                    System.out.println("Hesabiniz bloke olmustur bankayi arayin. ");
                } else {
                    System.out.println("Kalan hakkiniz: " + right);
                }
            }
        }
    }
}
