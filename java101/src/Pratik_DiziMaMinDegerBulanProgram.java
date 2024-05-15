import java.util.Scanner;

public class Pratik_DiziMaMinDegerBulanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dizinin elemanlarini girin (virgulle ayirarak): ");
        String input = scanner.nextLine();
        String[] strNumbers = input.split(",");
        int[] list = new int[strNumbers.length];
        for (int i = 0; i < strNumbers.length; i++) {
            list[i] = Integer.parseInt(strNumbers[i]);
        }

        System.out.print("Aranacak sayiyi girin: ");
        int target = scanner.nextInt();

        int minClosest = Integer.MIN_VALUE;
        int maxClosest = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < target && i > minClosest) {
                minClosest = i;
            }
            if (i > target && i < maxClosest) {
                maxClosest = i;
            }
        }

        System.out.println("Girilen sayidan kuçuk en yakin sayi: " + minClosest);
        System.out.println("Girilen sayidan buyuk en yakin sayi: " + maxClosest);

    }
}
