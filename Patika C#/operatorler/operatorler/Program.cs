using System;

namespace operatorler
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("***** Atama ve İşlemli Atama *****");

            int x = 3;
            int y = 3;
            y = y + 2;
            Console.WriteLine(y);
            y += 2;
            Console.WriteLine(y);
            y /= 1;
            Console.WriteLine(y);
            x *= 2;
            Console.WriteLine(x);

            Console.ReadLine();

            Console.WriteLine("***** Mantıksal Operatörler *****");
            // ||, &&, !

            bool isSucces = true;
            bool isCompleted = true;

            if (isSucces && isCompleted)
                Console.WriteLine("Perfesct!");

            if (isSucces || isCompleted)
                Console.WriteLine("Great!");

            if (isSucces && !isCompleted)
                Console.WriteLine("Fine!");

            Console.ReadLine();

            Console.WriteLine("***** İlişkisel Operatörler *****");
            // <, >, <=, >=, ==, !=

            int a = 3;
            int b = 4;
            bool sonuc = a < b;

            Console.WriteLine(sonuc);
            sonuc = a > b;
            Console.WriteLine(sonuc);
            sonuc = a >= b;
            Console.WriteLine(sonuc);
            sonuc = a <= b;
            Console.WriteLine(sonuc);
            sonuc = a == b;
            Console.WriteLine(sonuc);
            sonuc = a != b;
            Console.WriteLine(sonuc);
            Console.ReadLine();

            Console.WriteLine("***** Aritmetik Operatörler *****");
            // /,*,+,- İFADELERİDİR

            int sayi1 = 10;
            int sayi2 = 5;
            int sonuc1;
            sonuc1 = sayi1 / sayi2;
            Console.WriteLine(sonuc1);
            sonuc1 = sayi1 * sayi2;
            Console.WriteLine(sonuc1);
            sonuc1 = sayi1 + sayi2;
            Console.WriteLine(sonuc1);
            sonuc1 = sayi1++;
            Console.WriteLine(sonuc1);
            Console.ReadLine();

            // % : mod almak için kullanılan ifade kalanı getiren ifade
            // Yani bölümünden kalan

            int sonuc2 = 20 % 7;
            Console.WriteLine(sonuc2);

            Console.ReadLine();
        }
    }
}
