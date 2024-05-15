package Odev_MaasHesaplayici;
import java.util.Scanner;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    double bonus;
    double tax;
    double raiseSalary;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    void bonus() {
        if (this.workHours>40)
        {
            this.bonus = (this.workHours - 40) * 30;
        }
        else
        {
            this.bonus=0;
        }
    }

    void tax()
    {
        if (this.salary > 0 && this.salary < 1000)
        {
            this.tax = this.salary * 0;
        }
        else
        {
            this.tax = this.salary * 0.03;
        }
    }

    void raiseSalary()
    {
        if (2021-this.hireYear<10)
        {
            this.raiseSalary=this.salary*0.05;
        }
        else if(2021-this.hireYear<20)
        {
            this.raiseSalary=this.salary*0.10;
        }
        else
            this.raiseSalary=this.salary*0.15;
    }

    void string() {
        System.out.println("--------------------------------");
        System.out.println("Adi: " + this.name);
        System.out.println("Maasi: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Baslangic Yili: " + this.hireYear);
        System.out.println("Vergi: " + this.tax);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Maas Artisi: " + this.raiseSalary);
        System.out.println("Vergi ve Bonuslar ile birlikte maas :" + (this.salary+this.bonus-this.tax));
        System.out.println("Toplam Maas: " + (this.salary+this.bonus+this.raiseSalary-this.tax));
    }
}
