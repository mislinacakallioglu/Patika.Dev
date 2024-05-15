package Odev_MaasHesaplayici;
import Odev_MaasHesaplayici.Employee;
import java.util.Scanner;

public class MainThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Employee e1 = new Employee("Mislina",25000,45,1999);

        e1.tax();
        e1.bonus();
        e1.raiseSalary();
        e1.string();

    }
}
