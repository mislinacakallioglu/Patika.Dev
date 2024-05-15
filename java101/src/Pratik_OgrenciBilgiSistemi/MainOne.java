package Pratik_OgrenciBilgiSistemi;

import Pratik_OgrenciBilgiSistemi.Pratik_OgrenciBilgiSistemi_Course;
import Pratik_OgrenciBilgiSistemi.Pratik_OgrenciBilgiSistemi_Teacher;
import Pratik_OgrenciBilgiSistemi.Pratik_OgrenciBilgiSistemi_Student;

import java.util.Scanner;

public class MainOne {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pratik_OgrenciBilgiSistemi_Teacher t1 = new Pratik_OgrenciBilgiSistemi_Teacher("Mahmut Hoca", "90550000000", "TRH");
        Pratik_OgrenciBilgiSistemi_Teacher t2 = new Pratik_OgrenciBilgiSistemi_Teacher("Fatma Ayşe", "90550000001", "FZK");
        Pratik_OgrenciBilgiSistemi_Teacher t3 = new Pratik_OgrenciBilgiSistemi_Teacher("Kül Yutmaz", "90550000002", "BIO");

        Pratik_OgrenciBilgiSistemi_Course tarih = new Pratik_OgrenciBilgiSistemi_Course("Tarih", "101", "TRH");

        tarih.addTeacher(t1);

        Pratik_OgrenciBilgiSistemi_Course fizik = new Pratik_OgrenciBilgiSistemi_Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Pratik_OgrenciBilgiSistemi_Course biyoloji = new Pratik_OgrenciBilgiSistemi_Course("Biyoloji", "103", "BIO");
        biyoloji.addTeacher(t3);

        Pratik_OgrenciBilgiSistemi_Student s1=new Pratik_OgrenciBilgiSistemi_Student("İnek Saban","140144015","4",tarih,fizik,biyoloji);
        s1.addBulkExamNote(100,50,40,90,90,90);

        s1.isPass();

        Pratik_OgrenciBilgiSistemi_Student s2=new Pratik_OgrenciBilgiSistemi_Student("Gudık Necmi","2211133","4",tarih,fizik,biyoloji);
        s2.addBulkExamNote(50,20,40,50,100,100);

        s2.isPass();
    }
}
