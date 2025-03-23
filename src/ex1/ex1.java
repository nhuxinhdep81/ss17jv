package ex1;

import java.util.HashSet;
import java.util.Set;

public class ex1 {
    public static void main(String[] args) {
        Set<Integer> setHashSet = new HashSet<Integer>();

        setHashSet.add(10);
        setHashSet.add(20);
        setHashSet.add(30);
        setHashSet.add(40);
        setHashSet.add(50);

        System.out.println("Cac ptu cua hashSet: " + setHashSet);
    }
}
