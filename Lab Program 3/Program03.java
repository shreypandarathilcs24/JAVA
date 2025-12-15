import java.util.Scanner;

class Book {
    String name;
    String author;
    double price;
    int numpages;

    // Parameterized constructor
    Book(String name, String author, double price, int numpages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numpages = numpages;
    }

    // Overriding toString() method
    public String toString() {
        return "Name : " + name + "\n"
             + "Author : " + author + "\n"
             + "Price : " + price + "\n"
             + "No of pages : " + numpages + "\n";
    }
}

public class Program03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Book b[] = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of book " + (i + 1));

            System.out.print("Name of book: ");
            String name = sc.nextLine();

            System.out.print("Author name: ");
            String author = sc.nextLine();

            System.out.print("Price of book: ");
            double price = sc.nextDouble();

            System.out.print("No of pages of book: ");
            int numpages = sc.nextInt();
            sc.nextLine(); // consume newline

            b[i] = new Book(name, author, price, numpages);
        }

        System.out.println("\nDetails of books");

        for (int i = 0; i < n; i++) {
            System.out.println("\nBook " + (i + 1));
            System.out.println(b[i]);
        }

        sc.close();
    }
}
