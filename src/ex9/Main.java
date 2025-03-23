package ex9;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("B01", "Doraemon", "tien1", 2020));
        library.addBook(new Book("B02", "Edogawa Conan", "tien2", 2019));

        // test sach trung id
        boolean added = library.addBook(new Book("B01", "Test sach", "sfdsfsdf", 2023));

        System.out.println("Thêm sách trùng id B001: " + (added ? "thanh cong" : "That bai"));
        System.out.println("\nTat ca sach trong thu vien:");
        for (Book book : library.getAllBooks()) {
            System.out.println(book);
        }
        System.out.println("\nSach sau khi loc nam 2019:");
        List<Book> filteredBooks = library.filterBooksByYear(2019);
        library.printBooks(filteredBooks);

        System.out.println("\nSap xep sach theo ten:");
        library.sortBooksByTitle(filteredBooks);
        library.printBooks(filteredBooks);
    }
}