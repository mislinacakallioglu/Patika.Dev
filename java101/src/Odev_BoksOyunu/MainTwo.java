package Odev_BoksOyunu;
import Odev_BoksOyunu.Fighter;
import Odev_BoksOyunu.Ring;
import java.util.Scanner;


public class MainTwo {
    public static void main(String[] args) {

        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();

        Scanner input = new Scanner(System.in);

    }
}
