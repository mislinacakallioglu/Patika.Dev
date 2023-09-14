using System;
namespace donguler_for_loop
{
    class Program
    {
        static void Main (string[] args)
        {
            //ekrandan girilen sayı tek olana kadar yazdır
            // Console.Write("lutfen bir sayi giriniz: ");
            // int sayac = int.Parse(Console.ReadLine());
            // for (int i = 1; i <=sayac; i++)
            // {
            //     if(i%2 ==1)
            //         Console.WriteLine(i);
            // }

            // // 1-1000 arasında tek-çift sayıların kendi aralarında toplamların ekrana yazılması.
            // int tekToplam = 0;
            // int ciftToplam = 0;
            // for (int i = 1; i <=1000; i++)
            // {
            //     if (i%2==1)
            //         tekToplam +=i;
            //     else
            //         ciftToplam +=i;        
            // }
            // Console.WriteLine("Tek toplam : " + tekToplam);
            // Console.WriteLine("Cift toplam : " + ciftToplam);

            //break - continue

            for (int i = 1; i < 10; i++)
            {
                if(i==4)
                    break;
                Console.WriteLine(i);    
            }

             for (int i = 1; i < 10; i++)
            {
                if(i==4)
                    continue;
                Console.WriteLine(i);    
            }
        }
    }
}
