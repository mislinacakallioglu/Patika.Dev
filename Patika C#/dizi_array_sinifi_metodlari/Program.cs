using System;

namespace dizi_array_sınıfı_metodlar
{
    class Program
    {
        static void Main(string[] args)
        {
            //Sort

            int [] sayiDizisi = {23,12,4,86,72,3,11,17};

            Console.WriteLine("- sirasiz liste - ");
            
            foreach (var sayi in sayiDizisi)
            Console.WriteLine(sayi);
            
                Console.WriteLine("- sirali liste - ");
                Array.Sort(sayiDizisi);
                foreach (var sayi in sayiDizisi)
                    Console.WriteLine(sayi);
                // CLear 
                // (sayi dizisi elemanlarını kullanarak ikinci indeksten itibaren iki tane elamanı sıfırlar)

                Console.WriteLine("- array clear - ");
                Array.Clear(sayiDizisi,2,2);

                foreach (var sayi in sayiDizisi)
                    Console.WriteLine(sayi);

                // Reverse 
                
                Console.WriteLine("- Array Reverse - ");
                Array.Reverse(sayiDizisi);

                foreach (var sayi in sayiDizisi)
                    Console.WriteLine(sayi);

                //IndexOf
                //Verilen dizinin verilen elemanının indexini getirir. Eğer dizi içerisinde elemanı bulamazsa -1 döner.
                Console.WriteLine("- Array IndexOf - ");
                Console.WriteLine( Array.IndexOf(sayiDizisi,23));
            
            // Resize 
            //Dizileri yeniden boyutlandırmak için kullanılır.
            Console.WriteLine("- Resize - ");
            Array.Resize<int>(ref sayiDizisi,9);
            sayiDizisi[8]=99;
            foreach (var sayi in sayiDizisi)
                Console.WriteLine(sayi);

        }
    }
}