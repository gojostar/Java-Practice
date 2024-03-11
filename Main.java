package Question1;

import java.util.Scanner;

public class Main {

    // Method to calculate the factorial of a number

    public int factorial(/*__Blank-1__*/) { 

        int factorial = 1; 

        for (int i = 1; i <= /*__Blank-2__*/; i++) { 

            factorial *= /*__Blank-3__*/; 

        } 

        return /*__Blank-4__*/; 

    }

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

        System.out.println("Please enter a number: "); 

        int n = scanner.nextInt(); 

        // Create an object of the Main class 

        Main mainObject = new Main(); 

// Use the factorial method of the object to calculate the factorial 

int result = mainObject.factorial(n); 

 

// Print the result 

System.out.println("The factorial of the input number is: " __*/(/*__Blank-5__*/);    }

}
