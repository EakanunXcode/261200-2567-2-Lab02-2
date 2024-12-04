public class Book {
    String title;
    String author;
    double price;
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }
    public static void main(String[] args) {
        Book defaultBook = new Book();
        System.out.println("Default Book Details:");
        defaultBook.displayDetails();
        Book customBook = new Book("1984", "George Orwell", 15.99);
        System.out.println("\nCustom Book Details:");
        customBook.displayDetails();
        customBook.updatePrice(18.99);
        System.out.println("\nUpdated Book Details:");
        customBook.displayDetails();
    }
}
