package JavaProgrames;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Declare following two arrylist and compare it.
 */

public class TwoArrayList {

    public static void main(String[] args) {
        TwoArrayList t = new TwoArrayList();
        t.compareList();

    }
    public void compareList(){

        ArrayList <String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList <String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");


        Collections.sort(c1);
        Collections.sort(c2);


        if(c1.equals(c2)){
            System.out.println("The two ArrayLists are equal.");
        }else {
            System.out.println("The two ArrayLists are not equal.");
        }


    }
}
