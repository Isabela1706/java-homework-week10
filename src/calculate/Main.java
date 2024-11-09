package calculate;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

        char continueCalculation;


        do {
            System.out.println("Enter first number: ");
            int a = scanner.nextInt();

            System.out.println("Enter second number: ");
            int b = scanner.nextInt();

            System.out.println("Please enter one of symbol +,-,*, /: ");

            char symbol = scanner.next().charAt(0);

            //Perform the calculation based on the symbol
            calculator.calculateResult(a,b,symbol);


            System.out.println(" Would you like to do more calculation Please enter “Y” or “N” : ");

            continueCalculation = scanner.next().charAt(0);
        }while (Character.toUpperCase(continueCalculation) == 'Y');

        System.out.println("Thank you for using the calculator. GoodBye!");

        scanner.close();

    }
}
