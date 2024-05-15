package Pratik_OgrenciBilgiSistemi;

public class Pratik_OgrenciBilgiSistemi_Course {
    Pratik_OgrenciBilgiSistemi_Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double sNote;

   public Pratik_OgrenciBilgiSistemi_Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0.0;
        this.sNote = 0.0;
    }

   public void addTeacher(Pratik_OgrenciBilgiSistemi_Teacher teacher)
    {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else
            System.out.println("Ogretmen/Ders uyusmazligi!");
    }

    public void printTeacher()
    {
        this.teacher.print();
    }
}
