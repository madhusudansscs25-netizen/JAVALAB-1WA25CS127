import java.util.Scanner;

public class Student {

    int usn;
    String name;

    public void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USN: ");
        usn = sc.nextInt();

        System.out.print("Enter Name: ");
        name = sc.next();

        sc.close();
    }

    public void display() {
        System.out.println("\nStudent Details:");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.accept();
        s1.display();
    }
}


































