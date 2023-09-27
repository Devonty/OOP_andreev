package ru.vsu.cs.OOP2023.andreev_n_r;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        // size
        System.out.println("list.size() = " + list.size());
        System.out.println();
        // get
        System.out.println("list.get(0) = " +  list.get(0));
        System.out.println("list.get(5) = " +  list.get(5));
        System.out.println("list.get(19) = " +  list.get(19));
        System.out.println("list.get(21) = ");
        try {
            System.out.println("list.get(21) = " +  list.get(21));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("list.get(-5) = ");
        try {
            System.out.println("list.get(-5) = " +  list.get(-5));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println();
        // set
        System.out.println("list.set(0, 111) = " +  list.set(0, 111));
        System.out.println("list.get(0) = " +  list.get(0));
        System.out.println("list.set(19, 222) = " +  list.set(19, 222));
        System.out.println("list.get(19) = " +  list.get(19));
        System.out.println("list.set(10, 333) = " +  list.set(10, 333));
        System.out.println("list.get(10) = " +  list.get(10));
        System.out.println();

        // remove
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println("list.remove(19) = " +  list.remove(19));
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println("list.remove(11) = " +  list.remove(11));
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println();

        // add i
        System.out.println(Arrays.toString(list.toArray()));
        list.add(0, 3434);
        System.out.println("list.add(10, 3434)");
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println();
        // size
        System.out.println("list.size() = " + list.size());
        System.out.println();
        // clear
        list.clear();
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println();
        // size
        System.out.println("list.size() = " + list.size());
        System.out.println();
    }
    
}
