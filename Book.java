// Book.java
public class Book {
// ฟิลด์สำหรับเก็บรายละเอียดหนังสือ
private String title; // ชื่อหนังสือ
private String author; // ผู้เขียน
private double price; // ราคา

// ตัวสร้างแบบไม่มีพารามิเตอร์ (ค่าดีฟอลต์)
public Book() {
    this.title = "Unknown"; // ค่าเริ่มต้นของชื่อหนังสือ
    this.author = "Unknown"; // ค่าเริ่มต้นของผู้เขียน
    this.price = 0.0; // ค่าเริ่มต้นของราคา
}

// ตัวสร้างแบบมีพารามิเตอร์สำหรับตั้งค่าฟิลด์ทั้งหมด
public Book(String title, String author, double price) {
    this.title = title; // กำหนดชื่อหนังสือ
    this.author = author; // กำหนดชื่อผู้เขียน
    this.price = price; // กำหนดราคา
}

// เมธอดสำหรับแสดงรายละเอียดหนังสือ
public void displayDetails() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Price: " + price);
}

// เมธอดสำหรับอัปเดตราคาของหนังสือ
public void updatePrice(double newPrice) {
    this.price = newPrice; // อัปเดตราคาใหม่ของหนังสือ
}

// เมธอดสำหรับปรับส่วนลด
public void applyDiscount(double discountPercentage) {
    // ตรวจสอบว่าเปอร์เซ็นต์ส่วนลดอยู่ในช่วงที่ถูกต้องหรือไม่
    if (discountPercentage > 0.0 && discountPercentage < 100.0) {
        // คำนวณราคาหลังจากหักส่วนลด
        double discountAmount = price * (discountPercentage / 100);
        double newPrice = price - discountAmount;
        this.price = newPrice; // อัปเดตราคาใหม่

        // แสดงข้อความยืนยัน
        System.out.println("Discount applied: " + discountPercentage + "%");
        System.out.println("Updated Price: " + price);
    } else {
        // แสดงข้อความเมื่อส่วนลดไม่ถูกต้อง
        System.out.println("Error: Invalid discount percentage. Must be > 0 and < 100.");
    }
}

// เมธอดหลักสำหรับทดสอบการทำงาน
public static void main(String[] args) {
    // ทดสอบตัวสร้างแบบไม่มีพารามิเตอร์
    Book unknownBook = new Book();
    System.out.println("Unknown Book Details:");
    unknownBook.displayDetails();

    // ทดสอบตัวสร้างแบบมีพารามิเตอร์
    Book hp1Book = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 350.00);
    System.out.println("\nHarry Potter Book Details:");
    hp1Book.displayDetails();

    // ทดสอบการอัปเดตราคา
    hp1Book.updatePrice(320.00);
    System.out.println("\nUpdated Price for Harry Potter:");
    hp1Book.displayDetails();

    // ทดสอบการปรับส่วนลด
    System.out.println("\nApplying Discount:");
    hp1Book.applyDiscount(10.0); // ใช้ส่วนลด 10%
    hp1Book.applyDiscount(150.0); // ทดสอบส่วนลดที่ผิดพลาด
}
        System.out.println("\nUpdated Book Details:");
        customBook.displayDetails();
    }
}
