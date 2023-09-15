using System;

namespace metotlar
{
    class Program
    {
        static void Main(string [] args)
        {
            int a =2,b=3;
            Console.WriteLine(a+b);
            int sonuc=Topla(a,b);
            Console.WriteLine("Toplam: " + sonuc);

            Metotlar metot = new Metotlar();
            metot.EkranaYazdir(Convert.ToString(sonuc));
            
           // int sonuc2=metot.ArttirVeTopla(a,b);
            //metot.EkranaYazdir(Convert.ToString(sonuc2));
            int sonuc3=metot.ArttirVeTopla(ref a,ref b);
            metot.EkranaYazdir(Convert.ToString(sonuc3));            
          

        }
        static int Topla(int deger1, int deger2)
        {
            return(deger1 + deger2);
        }
    }
    class Metotlar
    {
        public void EkranaYazdir(string veri)
        {
            Console.WriteLine(veri);
        }
        public int ArttirVeTopla(ref int deger1, ref int deger2)
        {
            deger1 += 1;
            deger2 += 1;
            return deger1 + deger2; 
        }
    }
}