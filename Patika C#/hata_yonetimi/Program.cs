using System;
 
namespace hata_yonetimi
{
    class Program
    {
        static void Main(string[] args)
        {
            // try
            // {
            //      Console.WriteLine("bir sayi giriniz: ");
            // int sayi=Convert.ToInt32(Console.ReadLine());
            // Console.WriteLine("girmis oldugunuz sayi:" + sayi);
            // }
            // catch (Exception ex)
            // {
            //     Console.WriteLine("hata: " + ex.Message.ToString());
                
            // }
            // // finally
            // //{
            // //     Console.Write("islem tamamlamdi. ");
            // // }
          
          try
          {
            //int a = int.Parse(null);
            //int a = int.Parse("test");
            int a = int.Parse("12345678900");

          }
          catch(ArgumentNullException ex)
          {
                Console.WriteLine("bos deger giriniz: ");
                Console.WriteLine(ex) ;
          }
          catch(FormatException ex){
                 Console.WriteLine("veri tipi uygun degil ");
                Console.WriteLine(ex) ;
          }
          catch(OverflowException ex){
              Console.WriteLine("Cok kucuk ya da cok buyuk bir deger girdiniz. ");
                Console.WriteLine(ex) ;
          }
          finally{
            Console.WriteLine("islem basariyla tamamlandi.");
          }
        }
    }
}
