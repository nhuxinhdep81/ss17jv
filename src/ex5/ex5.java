package ex5;

import java.util.HashSet;
import java.util.Set;


public class ex5 {
    public static void main(String[] args) {
        Set<Integer> setHashSet1 = new HashSet<>();
        setHashSet1.add(1);
        setHashSet1.add(2);
        setHashSet1.add(3);
        setHashSet1.add(4);
        setHashSet1.add(5);

        Set<Integer> setHashSet2 = new HashSet<>();
        setHashSet2.add(4);
        setHashSet2.add(5);
        setHashSet2.add(6);
        setHashSet2.add(7);
        setHashSet2.add(8);

        setHashSet1.addAll(setHashSet2);

        System.out.println("Hop nhat 2 hashset" + setHashSet1);
    }
}
