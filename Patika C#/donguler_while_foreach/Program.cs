using System;

namespace donguler_while_foreach
{
    class Program
    {
    static void Main(string[] args)
    {
        // while
        // 1 den başlayarak console dan girilen sayıya kadar (sayı dahil) ortalama hesaplayıp console a yazdıran program
        // Console.WriteLine(" Lutfen bir sayi giriniz: ");
        // int sayi = int.Parse(Console.ReadLine());
        // int sayac= 1;
        // int toplam = 0;
        // while (sayac <= sayi)
        // {
        //     toplam += sayac;
        //     sayac ++;
        // }
        // Console.WriteLine(toplam/sayi);

        // // alfabeyi yazdıralım
        // char karakter = 'a';
        // while (karakter <'z')
        // {
        //     Console.WriteLine(karakter);
        //     karakter++;
        // }

        Console.WriteLine("----- foreach -----");
        string[] arabalar = {"BMW", "Mercedes" ,"AUDİ", "Hundai"};
        foreach (var araba in arabalar)
        {
            Console.WriteLine(araba);
        }
        }
    }
}
