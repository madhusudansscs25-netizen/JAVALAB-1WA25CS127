class Book {
    int bookid;
    String title;
    String author;
    double price;

    static int count = 0;

    // Constructor
    Book(int id, String t, String a, double p) {
        bookid = id;
        title = t;
        author = a;
        price = p;
        count++;
    }

    // Display book details
    void display() {
        System.out.println("Book ID: " + bookid);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    // Search by book ID
    void search(int id) {
        if (bookid == id) {
            System.out.println("Book Found: " + title);
        } else {
            System.out.println("Book Not Found");
        }
    }

    // Search by title
    void search(String t) {
        if (title.equalsIgnoreCase(t)) {
            System.out.println("Book Found: " + title);
        } else {
            System.out.println("Book Not Found");
        }
    }

    // Find costlier book
    Book costlier(Book b) {
        if (price > b.price) {
            return this;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        Book b1 = new Book(101, "Java", "James", 500);
        Book b2 = new Book(102, "Python", "Guido", 400);
        Book b3 = new Book(103, "Data Structures", "Mark Allen", 650);

        // Display books
        b1.display();
        System.out.println();

        b2.display();
        System.out.println();

        b3.display();
        System.out.println();

        // Search by title
        b2.search("Python");

        // Search by ID
        b1.search(101);

        // Find costlier book
        Book expensive = b1.costlier(b3);

        System.out.println("\nCostlier Book:");
        expensive.display();

        // Display total number of books
        System.out.println("\nTotal books created: " + Book.count);
    }
}
