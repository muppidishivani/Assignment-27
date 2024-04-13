package com.web.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElements_27 {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);

        List<Integer> commonElements = findCommonElements(l1, l2);
        System.out.println("Common Elements: " + commonElements);
    }

    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set = new HashSet<>(list1);
        set.retainAll(list2);
        return new ArrayList<>(set);
}

}