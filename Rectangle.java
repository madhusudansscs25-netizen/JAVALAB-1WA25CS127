import java.util.Scanner;

public class Rectangle {

    int length;
  int bredth;
 

    public void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = sc.nextInt();

        System.out.print("Enter bredth: ");
        bredth = sc.next();

        sc.close();
    }

    public void display() {
       
        System.out.println("Area: " + length*bredth);
        System.out.println("perimeter: " + 2(lenth+bredth));
    }

    public static void main(String[] args) {

        Rectangle s1 = new Rectangle();

        s1.accept();
        s1.display();
    }
}


