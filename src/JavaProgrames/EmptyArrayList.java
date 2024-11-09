package JavaProgrames;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 *
 */

public class EmptyArrayList {

    public static void main(String[] args) {
        emptyList();
    }
    public static void emptyList(){
        ArrayList<Integer> odds = new ArrayList<>();

        if(odds.isEmpty()){
            System.out.println("The ArrayList is empty");
        }else{
            System.out.println("The ArrayList is not empty");
        }

        odds.add(3);


        if(odds.isEmpty()){
            System.out.println("The ArrayList is empty");
        }else{
            System.out.println("The ArrayList is not empty");
        }




    }

}
