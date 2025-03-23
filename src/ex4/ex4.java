package ex4;

import java.util.Set;
import java.util.TreeSet;

public class ex4 {
    public static void main(String[] args) {
        Set<Integer> setTreeSet = new TreeSet<>();
        setTreeSet.add(45);
        setTreeSet.add(12);
        setTreeSet.add(78);
        setTreeSet.add(34);
        setTreeSet.add(23);
        setTreeSet.add(89);

        System.out.println("setTreeSet: " + setTreeSet);
    }
}
