package ClassesJava;

import java.util.Scanner;

public class SimpleCalculator {
    private static double result; // A global variable that can be used everywhere in the class SimpleCalculator

    public static void add(double res, double value){ // The addition function
        result = res;
        result += value;
    }

    public static void subtract(double res, double value){ // The subtraction function
        result = res;
        result -= value;
    }

    public static void multiply(double res, double value){ // The multiplication function
        result = res;
        result *= value;
    }

    public static void divide(double res, double value){ // The division function
        result = res;
        result = result / value;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to SimpleCalculator!");

        System.out.println("Enter a number: ");
        String resu = scanner.nextLine();
        result = Integer.parseInt(resu);

        System.out.println("Enter the second number: ");
        String numt = scanner.nextLine();
        int num = Integer.parseInt(numt);

        System.out.println("Enter an operator (*, -, /, +)");
        String op = scanner.nextLine();

        if (op == "+"){
            add(result, num);
        } else if (op == "-"){
            subtract(result, num);
        } else if (op == "*"){
            multiply(result, num);
        } else if (op == "/"){
            divide(result, num);
        }
        System.out.println("The answer is " + result + ".");
    }
}
