package ex7;

import java.util.*;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi");
        String input  = sc.nextLine();

        String[] inputSplit = input.split("\\W+");

        Set<String> setHashSet = new HashSet<>();
        for(String s : inputSplit) {
            setHashSet.add(s);
        }
//        System.out.println("chuoi sau khi them vao: " + setHashSet);

        List<String> setList = new ArrayList<>();
        for(String s : setHashSet) {
            setList.add(s);
        }

        Collections.sort(setList);

        for(String s : setList) {
            int count = 0;
            for(String s2: inputSplit){
                if(s2.equals(s)) {
                    count++;
                }
            }
            System.out.println(s + ": " + count);
        }
    }
}
