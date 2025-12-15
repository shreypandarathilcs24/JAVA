import java.util.Scanner;

class BookDetails {
    private String title;
    private String writer;
    private double cost;
    private int pages;

    // Parameterized constructor
    BookDetails(String title, String writer, double cost, int pages) {
        this.title = title;
        this.writer = writer;
        this.cost = cost;
        this.pages = pages;
    }

    // Setter methods
    void setTitle(String title) {
        this.title = title;
    }

    void setWriter(String writer) {
        this.writer = writer;
    }

    void setCost(double cost) {
        this.cost = cost;
    }

    void setPages(int pages) {
        this.pages = pages;
    }

    // Getter methods
    String getTitle() {
        return title;
    }

    String getWriter() {
        return writer;
    }

    double getCost() {
        return cost;
    }

    int getPages() {
        return pages;
    }

    // Overriding toString()
    @Override
    public String toString() {
        return "Book Title : " + title +
               "\nWritten By : " + writer +
               "\nPrice (Rs) : " + cost +
               "\nTotal Pages : " + pages;
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many books you want to add: ");
        int count = sc.nextInt();
        sc.nextLine(); // consume newline

        BookDetails[] books = new BookDetails[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\n--- Enter details for Book " + (i + 1) + " ---");

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Author: ");
            String writer = sc.nextLine();

            System.out.print("Price: ");
            double cost = sc.nextDouble();

            System.out.print("Number of pages: ");
            int pages = sc.nextInt();
            sc.nextLine(); // consume newline

            books[i] = new BookDetails(title, writer, cost, pages);
        }

        System.out.println("\nBook Info...");

        for (int i = 0; i < books.length; i++) {
            System.out.println("\nBook #" + (i + 1));
            System.out.println(books[i]);
        }

        sc.close();
    }
}
