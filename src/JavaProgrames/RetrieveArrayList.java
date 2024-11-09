package JavaProgrames;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

public class RetrieveArrayList {

    public static void main(String[] args) {
        retrieveArray();

    }
    public static void retrieveArray(){

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int indexToRetrieve = 3;


        try{
            Integer element = numbers.get(indexToRetrieve);
            System.out.println("Element index " + indexToRetrieve + " : " + element);
        }catch (IndexOutOfBoundsException e){

            System.out.println("Index out of bounds. ");
        }
    }

}
