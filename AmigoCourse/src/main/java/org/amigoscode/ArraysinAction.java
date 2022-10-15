package org.amigoscode;

import java.util.*;

public class ArraysinAction {

    public static void main(String[] args) {
        // the simple basic way of creating array
        // arrays are limited by the initial defined size
        // Array list can increase the size

        int[] array1 = new int[2];
        array1[0] = 0;
        array1[1] = 1;
        System.out.println(array1.length); // 2
        System.out.println(java.util.Arrays.toString(array1));
        // [0, 1]

        // other way
        int[] array2 = {1, 2, 3, 40};
        System.out.println(Arrays.toString(array2));
        // [1, 2, 3, 50]

        // Loop method
        for (int x : array2){
            System.out.println(x);
        }
        // another way of loop
        for (int i = 0; i < array2.length ; i++) {
            System.out.println(array2[i]);
        }

        // Array lists
        // List is the interface class which contain the ArrayList
        // List not limited predefined size or type
        List list1 = new ArrayList();
        list1.add(20);
        list1.add(80);
        list1.add(100);
        list1.add(200);
        System.out.println(list1);
        // [1, 80]

        // loop
        for (Object y : list1){
            System.out.println(y);
        }
        // loop another method
        list1.forEach(System.out::println);
        //        1
        //        80

        list1.add(90); // you can add as many as you want
        list1.forEach(System.out::println);
        //        1
        //        80
        //        90

        // remove from list1 [20, 80, 100, 200, 90]
        list1.remove(1);
        System.out.println(list1);
        // [20, 100, 200, 90]

        // check if it contain value
        System.out.println(list1.contains(200));
        // true

        System.out.println(list1.size()); // 4
        System.out.println(list1.isEmpty()); // false
        System.out.println(list1.get(2)); // 200

        list1.clear(); // empty the list
        System.out.println(list1.isEmpty()); //true


        // Generics
        // List can take any data types , if you want to limit to only String
        // use generics <data type>
        List<String> onlyString = new ArrayList<>();
        onlyString.add("Fahd");
        onlyString.add("Yassin");
        // onlyString.add(2); // not possible


        // sets
        // it doesnt allow duplicate
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(1);
        set1.add(2);
        System.out.println(set1); // [1, 2]
        System.out.println(set1.size()); // 2
        set1.add(3);


        // Maps
        // usefull for key value pair {}
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(0, "Fahd");
        map1.put(1, "Yassin");
        map1.put(2, "Sara");
        map1.put(2, "Yomna ");
        // we added duplicate at 2
        System.out.println(map1);
        // {0=Fahd, 1=Yassin, 2=Yomna }
        // replaced Sara by Yomna
        System.out.println(map1.get(0));
        // Fahd
        System.out.println(map1.keySet());
        // [0, 1, 2]
        // loop
        for (int x : map1.keySet() ){
            System.out.println(map1.get(x));
        }
//        Fahd
//        Yassin
//        Yomna
        // another loop
        map1.forEach((k,v) -> {
            System.out.println(k + " " + v);
                });
//        0 Fahd
//        1 Yassin
//        2 Yomna

    }
}
