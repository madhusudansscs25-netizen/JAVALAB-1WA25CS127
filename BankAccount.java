import java.util.Scanner;

public class BankAccount {

    int an;
    String name;
    float balance;

    public void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account number: ");
        an = sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter balance: ");
        balance = sc.nextFloat();
    }

    public void display() {
        System.out.println("\nBank Account Details:");
        System.out.println("Account Number: " + an);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount s1 = new BankAccount();
        BankAccount s2 = new BankAccount();

        s1.accept();
        s1.display();

        s2.accept();
        s2.display();
    }
}