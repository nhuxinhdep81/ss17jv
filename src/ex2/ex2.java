package ex2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex2 {
    public static void main(String[] args) {
        Set<String> setHashSet = new HashSet<String>();
        setHashSet.add("Java");
        setHashSet.add("Python");
        setHashSet.add("C++");
        setHashSet.add("JavaScript");

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi");
        String searchInput = sc.nextLine();

        System.out.println("Check chuoi nhap vao co ton tai trong hashset: " + setHashSet.contains(searchInput)
                );
    }


}
