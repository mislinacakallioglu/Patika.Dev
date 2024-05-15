package Pratik_OgrenciBilgiSistemi;

public class Pratik_OgrenciBilgiSistemi_Teacher {
    String name;
    String mpno;
    String branch;

    public Pratik_OgrenciBilgiSistemi_Teacher(String name, String mpno, String branch)
    {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    public void print(){
        System.out.println("Adı: "+this.name);
        System.out.println("Telefon: "+this.mpno);
        System.out.println("Bölümü: "+this.branch);
    }
}
