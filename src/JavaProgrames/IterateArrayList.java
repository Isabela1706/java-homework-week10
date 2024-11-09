package JavaProgrames;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */

public class IterateArrayList {


    public static void main(String[] args) {
        iterateElements();

    }
    public static void iterateElements(){


        ArrayList <Integer> elementList = new ArrayList();

        elementList.add(111);
        elementList.add(222);
        elementList.add(333);
        elementList.add(444);
        elementList.add(555);

//        for(Integer numbers : elementList){
//            System.out.println(numbers);
//        }

        //Here we are using Iterator
        Iterator<Integer>list = elementList.iterator();
        while (list.hasNext()){
            System.out.println(list.next() + ".");
        }

    }
}
