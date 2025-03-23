package ex3;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class ex3 {
    public static void main(String[] args) {
        Set<Integer> setHashSet = new HashSet<>();

        setHashSet.add(1);
        setHashSet.add(2);
        setHashSet.add(3);
        setHashSet.add(4);
        setHashSet.add(5);
        setHashSet.add(6);
        setHashSet.add(7);
        setHashSet.add(8);
        setHashSet.add(9);
        setHashSet.add(10);

        Iterator<Integer> iterator = setHashSet.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element % 2 ==0) {
                iterator.remove();
            }
        }
        System.out.println("Hashset sau khi xoa: "  + setHashSet);
    }
}
