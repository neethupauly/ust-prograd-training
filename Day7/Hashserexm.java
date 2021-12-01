package collectionexamples;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;



public class Hashsetexm {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<Integer>();
        hashSet.add(5);
        hashSet.add(10);
        hashSet.addAll(List.of(2,4,6,8));
        hashSet.add(-10);
        hashSet.add(-8);
        System.out.println(hashSet);
    }
}


