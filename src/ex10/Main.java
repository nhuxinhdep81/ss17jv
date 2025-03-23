package ex10;

// File: Main.java
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ContactManager contactManager = new ContactManager();

    public static void main(String[] args) {
        // Thêm một số liên lạc mẫu
        contactManager.addContact(new Contact("Nguyễn Văn A", "0123456789"));
        contactManager.addContact(new Contact("Trần Thị B", "0987654321"));
        contactManager.addContact(new Contact("Lê Văn C", "0369852147"));

        boolean exit = false;

        while (!exit) {
            displayMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addNewContact();
                    break;
                case 2:
                    removeContact();
                    break;
                case 3:
                    searchContact();
                    break;
                case 4:
                    contactManager.displayAllContacts();
                    break;
                case 5:
                    exit = true;
                    System.out.println("thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
            if (!exit) {
                System.out.println("\nNhấn Enter để tiếp tục...");
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n===== QUẢN LÝ DANH BẠ ĐIỆN THOẠI =====");
        System.out.println("1. Thêm liên lạc mới");
        System.out.println("2. Xóa liên lạc");
        System.out.println("3. Tìm kiếm liên lạc");
        System.out.println("4. Hiển thị tất cả liên lạc");
        System.out.println("5. Thoát");
        System.out.print("Nhập lựa chọn của bạn: ");
    }

    private static void addNewContact() {
        System.out.println("\n--- Thêm liên lạc mới ---");
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();

        Contact newContact = new Contact(name, phoneNumber);
        contactManager.addContact(newContact);
    }

    private static void removeContact() {
        System.out.println("\n--- Xóa liên lạc ---");
        System.out.print("Nhập số điện thoại của liên lạc cần xóa: ");
        String phoneNumber = scanner.nextLine();

        contactManager.removeContact(phoneNumber);
    }

    private static void searchContact() {
        System.out.println("\n--- Tìm kiếm liên lạc ---");
        System.out.print("Nhập số điện thoại cần tìm: ");
        String phoneNumber = scanner.nextLine();

        Contact foundContact = contactManager.findContact(phoneNumber);

        if (foundContact != null) {
            System.out.println("Tìm thấy liên lạc: " + foundContact);
        } else {
            System.out.println("Không tìm thấy liên lạc có số điện thoại: " + phoneNumber);
        }
    }
}