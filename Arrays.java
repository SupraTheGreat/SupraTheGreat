package ClassesJava;

import java.io.*;
import java.util.*;

public class Arrays {

    // The method for getting colored text in Java
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static int occurence(String str, char o) { // Function
        ArrayList<Character> al = new ArrayList<>(); // Creating a new ArrayList (array)
        for (int i = 0; i < str.length(); i++) {
            al.add(str.charAt(i)); // Adding (an) element(s) to the array
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (al.get(i) /* retrieves the element at some index in an ArrayList */ == o){
                count += 1;
            }
        }
        return count;
    }

    public static char getC(String str, int index) { // Another function
        return str.charAt(index); // Returns the character from the specified index in the string
    }

    public static void printColor(String text) {
        String one = Character.toString(getC(text, 0));
        String two = Character.toString(getC(text, 1));
        String three = Character.toString(getC(text, 2));
        String four;
        String five;
        String word = one + two + three;
        String bigword = "";

        for (int i = 0; i < text.length(); i++) {
            // Getting the length of a list or string
            if (i < text.length()-3){
                one = Character.toString(getC(text, i));
                two = Character.toString(getC(text, i+1));
                three = Character.toString(getC(text, i+2));
                word = one + two + three;
            }

            if (i < text.length()-3 && i > 3){
                one = Character.toString(getC(text, i-2));
                two = Character.toString(getC(text, i-1));
                three = Character.toString(getC(text, i));
                four = Character.toString(getC(text, i+1));
                five = Character.toString(getC(text, i+2));
                bigword = one + two + three + four + five;
            }

            if (i < 2){
                one = Character.toString(getC(text, i));
                two = Character.toString(getC(text, i+1));
                three = Character.toString(getC(text, i+2));
                four = Character.toString(getC(text, i+3));
                five = Character.toString(getC(text, i+4));
                bigword = one + two + three + four + five;
            }

            if (getC(text, i) != '~') {
                // isDigit checks whether the given character a digit regardless of its datatype
                if (Character.isDigit(getC(text, i))) {
                    System.out.print(BLUE + getC(text, i) + RESET);
                    // && is the way of saying "and" in Java
                    // ! is the way of saying "not" in Java
                    // || is the way of saying "or" in Java
                } else if (word.equals("int") && !bigword.equals("print") && !bigword.equals("Print") || word.equals("new")){
                    System.out.print(YELLOW + word + RESET);
                    i += 2;
                } else if (word.equals("out")){
                    System.out.print(PURPLE + word + RESET);
                    i += 2;
                } else {
                    System.out.print(getC(text, i));
                }
            }
        }

        int c = occurence(text, '~');
        for (int i = 0; i < c; i++) {
            System.out.print("\n");
        }
    }

    public static void main(String[] args){
        printColor("Arrays are simply just a type of list. These are used to store information.~~");

        printColor("The syntax for making an array is: ~");
        printColor("int[] nums = new int[5];~~");

        printColor("Array with initializer list: ~");
        printColor("int[] nums = {1, 2, 3, 4, 5};~~");

        printColor("Accessing values from an array by the values' index: ~");
        printColor("int[] nums = {1, 2, 3, 0, 5};~");
        printColor("int firstnum = nums[0];    (getting a value)~");
        printColor("nums[3] = 4;    (setting a value)~~");

        printColor("Getting the length of a list: ~");
        printColor("int length = nums.length;~~");

        printColor("Getting the last element of an array:~");
        printColor("int lastIndex = nums.length - 1;~~");

        printColor("Getting the middle element of an array:~");
        printColor("int middleIndex = nums.length / 2;~");
        printColor("int middleElement = nums[middleIndex];~~");

        printColor("Printing an element of an array: ~");
        printColor("System.out.println(nums[index]);~~");

        printColor("ARRAYS EXERCISE:~");

        // Here, we declare a simple array.
        // You add one set of brackets after the data type for a 1d array.
        // You can add more sets of brackets to change the dimension of the array.
        // Ex: 1 set is 1d, 2 sets are 2d, 3 sets are 3d, etc
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // Here, all the numbers in the list are doubles because that's the data type we specified.
        double[] numbers = {1.5, 2.5, 3, 3.5, 4, 5.5, 6};

        int sum = nums.length + nums[nums.length-1];

        printColor("The length of int[] nums added to the last element of int[] nums is " + sum + ".~");

        double sumTwo = 0;
        // Here, the for loop runs numbers.length times.
        // The variable number is numbers[i].
        // In other words, the var number is the (i)th element of the numbers array.
        for (double number : numbers) {
            sumTwo += number;
        }

        printColor("The sum of all the elements in the list 'numbers' added up is " + sumTwo + ".");
    }
}
