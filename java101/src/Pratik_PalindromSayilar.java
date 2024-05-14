import java.util.Scanner;

public class Pratik_PalindromSayilar {

    static boolean isPalindrom(int number)
    {
        int temp = number, reversedNumber = 0, lastNumber;

        while (temp != 0)
        {
            lastNumber = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reversedNumber)
        {
            System.out.println("Palindrom sayidir.");
        }
        else
        {
            System.out.println("Palindorm sayi değil.");
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int num = input.nextInt();
        System.out.println("-------------------");
        isPalindrom(num);

    }
}


