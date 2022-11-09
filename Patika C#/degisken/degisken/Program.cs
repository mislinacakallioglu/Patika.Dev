using System;

namespace degisken
{
    class Program
    {
        static void Main(string[] args)
        {


            // string kelime = null;
            string kelime = "tarhan";
            Console.WriteLine(kelime);

            //         --- Veri Tipleri ----


            byte b = 5;         //0-255 1byte
            sbyte sb = 5;        //-128 - +127 1byte
            short s = 5;        //-32.000 - +32.000 2byte
            ushort us = 5;       //0 -  65365 2byte

            Int16 i16 = 2;      // 2byte
            int i = 2;          //4 byte
            Int32 i32 = 2;      //4byte
            Int64 i64 = 2;      //8 byte
            uint ui = 2;        //4byte
            long l = 2;         //8byte
            ulong ul = 2;        //8byte

            float f = 5;        //4byte
            double d = 5.4;     //8byte

            char c = 'a';       //2byte
            string str = "tarhan";

            bool bl = false;

            DateTime dt = DateTime.Now;     // Anlık olarak saat ve tarihi verir.
            Console.WriteLine(dt);

            // Object yani nesne bütün herşeyi tutabilir. -char -string -int -decimal

            object o1 = "x";    //string
            object o2 = 'y';    //char
            object o3 = 4.5;    //decimal
            object o4 = 6;      //integer

            string str1 = string.Empty;
            string str2 = null;
            string str3;

            string strName = "Emre tarhan";
            string name = "Emre tarhan";
            string surname = "tarhan";
            string fullname = name + " " + surname;

            Console.WriteLine(strName);
            Console.WriteLine(fullname);


            int int1 = 5;
            int int2 = 3;
            int in3 = int1 * int2;

            //Bool ==> True yada False değer alır. Genelde kıyaslama işlemlerinde kullanılır.

            bool b1 = 10 > 2;//True değer döndürür.

            // -- Değişken Dönüşümleri -- 

            //str => int
            //--------------------------------
            // 1 - int.Parse("16") 
            // 2 - Convert.ToInt32(StrYeDönüştürülecekNesne);


            string str20 = "20";
            int int20 = 20;
            string str4 = str20 + int20.ToString();  // String cinsinde toplama yapılır. String'te toplama yanyana yazmak anlamına gelir.

            Console.WriteLine(str4);   //2020 şeklinde iki stringi birleştirmiş oldu. 

            // int => str 
            // -------------------------------
            // 1 - .ToString() 
            // 2 - Convert.ToString(StrYeDönüştürülecekNesne);

            //Burada int20 zaten integer ve diğer str20 değeride int çevrildiğinden dolayı iki integer değerin toplamı anlamına gelir.
            //Yani sayısal 2 ifadenin toplamı olarak ifade edilebilir.Çünkü iki değerde int olur. 
            int int3 = int20 + Convert.ToInt32(str20);  

            Console.WriteLine(int3);  //Çıktı: 40 

            int int4 = int20 + int.Parse(str20);  //Çıktı: 40

            Console.WriteLine(int4);

            string datetime1 = DateTime.Now.ToString("dd.MM.yyyy");  //Şu anki zaman string veritipinde gün.ay.yıl olarak gelir. 
            Console.WriteLine(datetime1);

            string hour = DateTime.Now.ToString("HH.mm");  //Şu anki saati bize verir. 
            Console.WriteLine(hour);

            Console.ReadLine();  // External Terminali Açık Tutmak İçin Kullanılır.
        }
    }
}
