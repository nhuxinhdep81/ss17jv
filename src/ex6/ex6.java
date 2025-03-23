package ex6;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ex6 {
    public static void main(String[] args) {
        Set<Integer> setHashSet1 = new HashSet<>();
        setHashSet1.add(10);
        setHashSet1.add(20);
        setHashSet1.add(30);
        setHashSet1.add(40);

        Set<Integer> setHashSet2 = new HashSet<>();
        setHashSet2.add(30);
        setHashSet2.add(40);
        setHashSet2.add(50);
        setHashSet2.add(60);

        setHashSet2.retainAll(setHashSet1);

        Set<Integer> sortedSet = new TreeSet<>(setHashSet2);

        System.out.println("Cac ptu chung: " + sortedSet);
    }
}
