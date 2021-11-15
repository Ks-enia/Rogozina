package com.ifmo.lesson10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class CollectionUtils {
    /**
     * Метод должен возвращать такую реализацию Iterable, которая будет последовательно
     * обходить все iterables, переданные в качестве аргументов.
     * Другими словами, вам нужно написать свою реализацию Iterable и Iterator.
     * @param iterables
     * @param <T>
     * @return
     */
//    public static <T> Iterable<T> view(Iterable<T>...iterables) {
//        return view(new Transformer<T, T>() {
//            @Override
//            public T transform(T t) {
//                return t;
//            }
//        }, iterables);
//    }
//
//
//    // 1. Заменить Transformer на java.util.function.Function
//    public static <T, R> Iterable<R> view(Transformer<T, R> transformer, Iterable<T>...iterables) {
//        if (iterables.length == 0) {
//            return List.of();
//        }
//
//        return new Iterable<R>() {
//            @Override
//            public Iterator<R> iterator() {
//                return new Iterator<R>() {
//                    private int pos;
//                    private Iterator<T> current;
//
//                    @Override
//                    public boolean hasNext() {
//                        if (current == null) {
//                            current = iterables[pos].iterator();
//                        }
//
//                        while (!current.hasNext()) {
//                            pos++;
//                            if (pos < iterables.length) {
//                                current = iterables[pos].iterator();
//                            } else {
//                                return false;
//                            }
//                        }
//
//                        return true;
//                    }
//
//                    @Override
//                    public R next() {
//                        // ???
//                        T next = current.next();
//                        R transformed = transformer.transform(next);
//                        return transformed;
//                    }
//                };
//            }
//        };
//    }
//
//    // Метод должен создать свою реализацию Iterable, которая возвращает только те значения,
//    // для которых predicate.test() == true.
////очистить метод перед решением задачи
//
//    public static <T> Iterable<T> filteredView(Iterable<T> iterable, Predicate<T> predicate) {
//return new Iterable<T>() {
//    @Override
//    public Iterator<T> iterator() {
//        return null;
//    }
//} ;
//    }
//
    public static void main(String[] args) {
//        List<String> list1 = new ArrayList<>();
//        List<String> list2 = new LinkedList<>();
//        List<String> list3 = new LinkedList<>();
//
//        list1.add("1");
//        list1.add("2");
//        list2.add("3");
//        list2.add("4");
//        list3.add("5");
//        list3.add("6");
//
//        Iterable<String> view = view(list1, list2, List.of(), list3);
//
//        list3.add("7");
//
//        Iterator<String> iterator = view.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next()); // 1, 2, 3, 4, 5, 6, 7
//        }
//
//        for (String s : view) {
//            System.out.println(s); // 1, 2, 3, 4, 5, 6, 7
//        }
//
//        System.out.println("====");
//
//        list1.add(0, "0");
//
//        for (String s : view) {
//            System.out.println(s); // 0, 1, 2, 3, 4, 5, 6, 7
        }
//
//
//        Iterable<Integer> view2 = view(s -> Integer.valueOf(s), list1, list2, List.of(), list3);
//
//        int sum = 0;
//        for (Integer i : view2) {
//            sum += i;
//        }
//
//        System.out.println(sum);
//
//        Iterable<Integer> evenInts = filteredView(view2, i -> i % 2 == 0);
//
//        for (Integer evenInt : evenInts) {
//            System.out.println(evenInt); // выведутся только чётные числа
//        }
//    }
}
