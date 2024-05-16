import java.util.Scanner;

public class Pratik_DiziTekrarEdenSayi {

        //dizide tekrarlanan elemanın var olup olmadığını kontrol etme
        public static boolean isFind(int[] arr,int value)
        {
            for (int i : arr) {
                if (i == value) {
                    return true;
                }
            }
            return false;
        }

        //tekrarlanan elemanın çift olup olmadığını kontrol etme
        public static boolean isEven(int[] arr, int value)
        {
            for (int j : arr) {
                if (j % 2 == 0 && value % 2 == 0) {
                    return true;
                }
            }
            return false;
        }
        public static void main(String[] args)
        {
            int[] list = {22,6, 7, 3, 22, 2, 4, 10, 4, 7, 1, 33, 2, 9, 1, 10,6};
            int[] duplicate = new int[list.length];
            int startIndex = 0;

            for (int i = 0; i < list.length; i++)
            {
                for (int j = 0; j < list.length; j++)
                {
                    if ((i != j) && (list[i] == list[j]))
                    {
                        if (isEven(duplicate, list[i]))
                        {
                            if (!isFind(duplicate, list[i]))
                            {
                                duplicate[startIndex++] = list[i];
                            }
                        }
                        break;
                    }
                }
            }
            for (int value : duplicate)
            {
                if (value != 0)
                {
                    System.out.print(" " + value + " ");
                }
            }
        }
}
