import java.util.Arrays;
import java.util.Scanner;

public class Odev_DiziElemanlariKucuktenBuyugeSiralama {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Diziniz boyutu n: ");
        int num = input.nextInt();
        int[] array = new int[num];
        int value;

        System.out.println("Dizinizin elemanlarini giriniz: ");

        for (int i = 0; i < array.length; i++)
        {
            System.out.print((i + 1) + ". Elemani: ");
            value = input.nextInt();
            array[i] = value;
        }
        System.out.println("Buyukten kucuge siralama ");
        System.out.println(Arrays.toString(array));
        System.out.println("------------------------------");
        System.out.println("Kucukten buyuge siralama ");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
