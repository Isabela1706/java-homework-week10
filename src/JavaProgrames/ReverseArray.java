package JavaProgrames;

import java.util.Arrays;

/**
 * Write a Java program to reverse an array of integer values.
 */

public class ReverseArray {

    public static void main(String[] args) {
        //Calling reverseNumber into main method

        int [] a = {0, 1, 2, 3, 4};

        System.out.println("Array : " + Arrays.toString(a));

        ReverseArray reverseArray = new ReverseArray();
        reverseArray.reverseNumber(a);

        System.out.println("Reversed array: " + Arrays.toString(a));

    }
    public void reverseNumber(int[] a){

        int start = 0;
        int end = a.length - 1;

        while(start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;


            start++;
            end--;
        }

    }


}
