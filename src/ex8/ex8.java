package ex8;

import java.util.*;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Nhap vao gia tri k:");
        int k = Integer.parseInt(sc.nextLine());

        Set<String> setTreeSet = new HashSet<>();
        for(int i = 0; i<array.length; i++) {
            for(int j = i + 1; j<array.length; j++) {
                if(array[i] + array[j] == k) {
                    String pair ="(" + array[i] + "," + array[j] + ")";
                    setTreeSet.add(pair);
                }
            }
        }
//        System.out.println("cac cap so: " + setTreeSet);
        List<String> listTreeSet = new ArrayList<>(setTreeSet);
        Collections.sort(listTreeSet);
        System.out.printf("Cap cac so co tong bang "+ k + ": " + listTreeSet);
    }
}
