using System;

namespace else_if;

class Program
{
    static void Main(string[]args)
    {
            {
                int time = DateTime.Now.Hour;
                if(time>=6 && time<11)
                {Console.WriteLine("gunaydin");}
                else if(time<=18)
                {Console.WriteLine("iyi günler");}
                else
                {Console.WriteLine("iyi geceler");}

                string sonuc = time<=18 ? "iyi günler" : "iyi geceler";

                sonuc= time>=6 && time<11  ?"gunyadin" : time<=18 ?" iyi gunler":"iyi geceler";
                Console.WriteLine(sonuc);
            }
    }
}
