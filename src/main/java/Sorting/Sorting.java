package Sorting;

import java.util.*;

public class Sorting implements Comparator<Integer> {
    public static void sort() {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println("Before sort: " + list);
        Collections.sort(list);
        System.out.println("After sort: " + list);
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return 0;
    }
}
