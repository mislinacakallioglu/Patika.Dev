package Pratik_OgrenciBilgiSistemi;

public class Pratik_OgrenciBilgiSistemi_Student {
    Pratik_OgrenciBilgiSistemi_Course course1;
    Pratik_OgrenciBilgiSistemi_Course course2;
    Pratik_OgrenciBilgiSistemi_Course course3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

   public Pratik_OgrenciBilgiSistemi_Student(String name, String stuNo, String classes, Pratik_OgrenciBilgiSistemi_Course course1, Pratik_OgrenciBilgiSistemi_Course course2, Pratik_OgrenciBilgiSistemi_Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.avarage = 0.0;
        this.isPass = false;
    }

   public void addBulkExamNote(double not1, double not2, double not3,double sNot1,double sNot2,double sNot3) {
        if (not1 >= 0 && not1 <= 100)
            this.course1.note = not1;

        if (not2 >= 0 && not2 <= 100)
            this.course2.note = not2;

        if (not3 >= 0 && not3 <= 100)
            this.course3.note = not3;

        if (sNot1 >= 0 && sNot1 <= 100)
            this.course1.sNote =sNot1;

        if (sNot2 >= 0 && sNot2 <= 100)
            this.course2.sNote = sNot2;

        if (sNot3 >= 0 && sNot3 <= 100)
            this.course3.sNote = sNot3;
    }
   public void isPass() {
        System.out.println("--------------------------------------");
        System.out.println(name);
        double course1=(this.course1.sNote*0.20)+(this.course1.note*0.80);
        double course2=(this.course2.sNote*0.20)+(this.course2.note*0.80);
        double course3=(this.course3.sNote*0.20)+(this.course3.note*0.80);
        this.avarage = (course1+course2+course3) / 3.0;
        printNote();
        if (this.avarage > 55) {
            System.out.println("Sinifi Gecti. ");
            this.isPass = true;
        } else {
            System.out.println("Sinifta kaldi");
            this.isPass = false;
        }
    }

   public void printNote() {
        System.out.println(this.course1.name + " siav notu: " + this.course1.note + " sozlu notu: " + this.course1.sNote);
        System.out.println(this.course2.name + " sinav notu: " + this.course2.note + " sozlu notu: " + this.course2.sNote);
        System.out.println(this.course3.name + " sinav notu: " + this.course3.note + " sozlu notu: " + this.course3.sNote);
        System.out.println("Ortalamaniz: " + this.avarage);

    }
}
