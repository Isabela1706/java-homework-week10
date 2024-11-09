package JavaProgrames;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

import java.util.ArrayList;

public class ArrayListColours {


    public static void main(String[] args) {

        ArrayListColours t = new ArrayListColours();
        t.listColours();

    }
    public void listColours(){

        ArrayList <String> coloursList = new ArrayList();
        coloursList.add("Red");
        coloursList.add("Yellow");
        coloursList.add("Black");
        coloursList.add("White");
        coloursList.add("Purple");


        for(String colours : coloursList ){
            System.out.println(colours);
        }
    }
}
