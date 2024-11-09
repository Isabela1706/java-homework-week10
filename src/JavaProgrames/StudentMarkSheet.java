package JavaProgrames;

import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme (From java-homework-week3
 *
 * programmes) using if else and while loop.
 */

public class StudentMarkSheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Variables
        String name;
        int rollNo;
        int mathMarks, scienceMarks, englishMarks;
        int totalMarks;
        double percentage;
        String result = "";
        String grade = "";


        System.out.println("Enter student name: ");
        name = scanner.nextLine();

        System.out.println("Enter roll number: ");
        rollNo = scanner.nextInt();

        mathMarks = getValidMarks("Math");
        scienceMarks = getValidMarks("Science");
        englishMarks = getValidMarks("English");

        totalMarks = mathMarks + scienceMarks + englishMarks;
        percentage = (totalMarks / 3.0);


        if(percentage >= 35){
            result = "Pass";
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else {
            grade = "C";
        }
    } else {
        result = "Fail";
        grade = "N/A";
    }
        printMarksheet(name, rollNo, mathMarks, scienceMarks, englishMarks, totalMarks, percentage, result, grade);
    }
    public static int getValidMarks(String subject){
        Scanner scanner = new Scanner(System.in);
        int marks;
        while(true){
            System.out.println("Enter marks for " + subject + "(0-100): ");
            marks = scanner.nextInt();

            if(marks >=0 && marks <=100){
                break;
            }else{
                System.out.println("Invalid Input, Marks should be between 0 and 100.");
            }
        }
        return marks;
    }
    private static void printMarksheet(String name, int rollNo, int mathMarks, int scienceMarks, int englishMarks, int totalMarks, double percentage, String result, String grade) {
        System.out.println("\n_________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|                Mark Sheet                                       |");
        System.out.println("|_________________________________________________________________|");
        System.out.println("| Name       : " + name + "                                       |");
        System.out.println("| Roll No    : " + rollNo + "                                     |");
        System.out.println("|_________________________________________________________________|");
        System.out.println("| Subjects : Marks                                                |");
        System.out.println("|_________________________________________________________________|");
        System.out.println("| Math      : " + mathMarks + "                                   |");
        System.out.println("| Science   : " + scienceMarks + "                                |");
        System.out.println("| English   : " + englishMarks + "                                |");
        System.out.println("|_________________________________________________________________|");
        System.out.println("| Total     : " + totalMarks + "                                  |");
        System.out.println("|_________________________________________________________________|");
        System.out.println("| Percentage : " + String.format("%.1f", percentage) + "          |");
        System.out.println("| Result    : " + result + "                                      |");
        System.out.println("| Grade     : " + grade + "                                       |");
        System.out.println("|_________________________________________________________________|");
    }

}
