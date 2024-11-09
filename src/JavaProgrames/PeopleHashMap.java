package JavaProgrames;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

public class PeopleHashMap {
    public static void main(String[] args) {
        peopleAge();



    }
    public static void peopleAge(){
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Alex", 35);
        people.put("Backie", 34);
        people.put("Cally", 36);
        people.put("Dell", 30);


        System.out.println("Ages of people: ");
        for(Map.Entry<String, Integer> entry : people.entrySet()){
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }

    }





}
