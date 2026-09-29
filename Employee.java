import java.util.Scanner;

public class Employee {

    int eid;
    String name;
float salary;

    public void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter eid: ");
        eid = sc.nextInt();

        System.out.print("Enter Name: ");
        name = sc.next();
       System.out.print("Enter salary: ");
        salary = sc.nextFloat();


        sc.close();
    }

    public void display() {
        System.out.println("\nEMployee Details:");
        System.out.println("eid: " + eid);
        System.out.println("Name: " + name);
   System.out.println("salary: " + salary);
    }

    public static void main(String[] args) {

        Employee s1 = new Employee();

        s1.accept();
        s1.display();
    }
}


