using System;

namespace switch_case
{
    class Program
    {
        static void Main(string[] args) 
        {
            int month = DateTime.Now.Month;

            switch (month)
            {
                case 1:
                    Console.WriteLine("ocak ayindasiniz");
                    break;
                case 2:
                    Console.WriteLine("subat ayindasiniz");
                    break;
                case 4:
                    Console.WriteLine("nisan ayindasiniz");
                    break;
                case 3:
                    Console.WriteLine("mart ayindasiniz");
                    break;
                case 7:
                    Console.WriteLine("temmuz ayindasiniz");
                    break;
                default:
                    Console.WriteLine("yanlis veri girisi yaptiniz");
                    break;
            }
                switch (month)
                {
                    case 12:
                    case 1:
                    case 2:
                        Console.WriteLine("kis ayindasininz");
                        break;     
                    case 3:
                    case 4:
                    case 5:
                        Console.WriteLine("ilkbahar ayindasininz");
                        break;   
                    case 6:
                    case 7:
                    case 8:
                        Console.WriteLine("yaz ayindasininz");
                        break; 
                    case 9:
                    case 10:
                    case 11:
                        Console.WriteLine("sonbahar ayindasininz");
                        break;                        
                    default:
                    break;
                }    
            }
        }
}

