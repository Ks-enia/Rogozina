package com.ifmo.lesson6;

import java.util.Iterator;

public class main  {
    public static void main (String[] ags){
        List <Integer > list = new LinkedList <>();
        list.add(1);
        list.add (2);
        list.add (3);
        for (Integer i: list){
            System.out.println(i);
        }
        final Iterator <Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next= iterator.next();
            System.out.println(next);
        }

    }
}
