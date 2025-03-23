package ex9;

import java.util.*;

public class Library {
    private Set<Book> books;

    public Library() {
        this.books = new HashSet<>();
    }
    public boolean addBook(Book book) {
        return books.add(book);
    }
    public Set<Book> getAllBooks() {
        return books;
    }
    public List<Book> filterBooksByYear(int year) {
        List<Book> filteredBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getYear() > year) {
                filteredBooks.add(book);
            }
        }

        return filteredBooks;
    }

    public void sortBooksByTitle(List<Book> bookList) {
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getTitle().compareTo(book2.getTitle());
            }
        });
    }
    public void printBooks(List<Book> bookList) {
        System.out.println("Danh sách sách:");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}