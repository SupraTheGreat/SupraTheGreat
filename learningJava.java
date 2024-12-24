package ClassesJava;

import java.util.Scanner; // The module for inputs
import java.time.Month; // The module for getting the months of the year
import java.text.ParseException; // The module for parseInt
import java.time.LocalDate; // The module for getting the date
import java.time.temporal.ChronoUnit; // The module for subtracting dates
import java.util.*; // Importing all of java.util
import java.time.DayOfWeek; // The module for the days of the week

// Main class
// Day of Today
public class learningJava {

    // List of colored text variables
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public int /* <-- Here, we declare what data type the function returns */ calculateSum(int firstnum, int secondnum){ // Creating a function
        int total = firstnum + secondnum;
        return total;
    }

//    public class Student{
//
//        Student student1 = new Student(“first”,  “last”, 13);
//        Student student2 = new Student(“first”,  “last”, 15);
//
//        System.out.println(student1);
//        System.out.println(student2);
//
//        // the objects jake and stacy are instances of the class sp the specific version of the class Students
//    }


    // Main Driver Method
    public static void main(String[] args) throws ParseException {


        // Getting the year, month, and day of today
        LocalDate currentdate = LocalDate.now();
        Month currentMonth = currentdate.getMonth();
        int currentDay = currentdate.getDayOfMonth();
        int currentYear = currentdate.getYear();
        LocalDate today = LocalDate.of(currentYear, currentMonth, currentDay);
        // System.out.println(java.time.LocalDate.now().getClass().getName());

        DayOfWeek dayOfWeek = DayOfWeek.from(today);
        String weekday = "";
        if (dayOfWeek.name() == "SATURDAY"){
            weekday = "Saturday";
        } else if (dayOfWeek.name() == "FRIDAY"){
            weekday = "Friday";
        } else if (dayOfWeek.name() == "THURSDAY"){
            weekday = "Thursday";
        } else if (dayOfWeek.name() == "WEDNESDAY"){
            weekday = "Wednesday";
        } else if (dayOfWeek.name() == "TUESDAY"){
            weekday = "Tuesday";
        } else if (dayOfWeek.name() == "MONDAY"){
            weekday = "Monday";
        } else if (dayOfWeek.name() == "SUNDAY"){
            weekday = "Sunday";
        }

        System.out.println("Today's Date: " + today + ", " + weekday);

        LocalDate dateBefore = LocalDate.of(2023, Month.JULY, 21);
        LocalDate dateAfter = LocalDate.of(currentYear, currentMonth, currentDay);
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
        // int current = today - startdate;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nThere is day 1 through " + noOfDaysBetween + ".\n\n");
        // UPDATE THIS EVERY DAY
        System.out.println("Day 1: Print Statements and Data Types");
        System.out.println("Day 2: User Input");
        System.out.println("Day 3: Arithmetic Expressions, Indices, and Substrings");
        System.out.println("Day 4: Booleans and Logical Operators");
        System.out.println("Day 5: For and While Loops");
        System.out.println("Day 6: If Statements");
        System.out.println("Day 7: Strings");
        System.out.println("Day 8: Functions");
        System.out.println("Day 9: Classes & Objects (Go to Rectangle.java)");
        System.out.println("Day 10: Constructors and ToString");
        System.out.println("Day 11: Instance Methods");
        System.out.println("Day 12: Arrays");
        System.out.println("Which day do you want to see? ");
        String d = scanner.nextLine();
        int day = Integer.parseInt(d);

        if (day == 1) {
            // EVERY STATEMENT MUST END WITH A SEMICOLON

            // Integer (Whole +/- number) data type
            int x = 5;

            // double (decimal) data type
            double y = 3.14;

            // Boolean (True/False) data type
            boolean isTrue = false;

            // Character (Single character) data type
            char charac = 'A';

            // String data type
            String texts = "Hello";

            // Printing a line
            // Remove the 'ln' after print to print on the same line
            System.out.println("The value of x is " + x + ".");
            System.out.println("The value of y is " + y + ".");
            System.out.println("The value of isTrue is " + isTrue + ".");
            System.out.println("The value of charac is " + charac + ".");
            System.out.println("The value of texts is " + texts + ".");

            // Declaration is just declaring an empty variable.
            // Intialization is declaring and giving the variable a value.

            int num = 5;
            double decimal = 1.242315235;
            char character = 'J'; // Characters are in single quotes
            String text = "Hello world"; // Strings are in double quotes
            boolean isFalse = true; // Boolean values are lowercase


            // type name = value
        } else if (day == 2) {
            // Inputs
            System.out.println("Enter your age ");
            String age = scanner.nextLine();
            // The scanner scans your input and stores it in the given variable.
            // In this case, the variable is called "age".

            System.out.println("Enter your name ");
            String name = scanner.nextLine();

            System.out.println("Enter your favorite food ");
            String favfood = scanner.nextLine();

            // String concatenation and nextline (\n)
            System.out.println("\nYour name is "+name+", your age is "+age+", and your favorite food is "+favfood+".");
        } else if (day == 3) {

            System.out.println("Enter an integer ");
            String integer = scanner.nextLine();

            System.out.println("Enter another integer ");
            String integer2 = scanner.nextLine();

            // The parseInt function converts string to integer
            /* We use this because above, inputs are taken as strings,
            and we need them to be integers */
            int i = Integer.parseInt(integer);
            int i2 = Integer.parseInt(integer2);
            int result = ((i2 + i) - 2) * 3;

            // String placeholders
            System.out.println("f(integer2, integer) is "+result+".");

            System.out.println("\n--------------------------------------------------------------------------------------\n");

            System.out.println("Enter a string that has more than 6 characters");
            String input = scanner.nextLine();
            // Getting a substring from the input
            System.out.println("The first three characters of your string are "+input.substring(0,3)+".");

        } else if (day == 4) {
            System.out.println("\nDo you have a pet? Enter 'True' or 'False'. ");
            String pet = scanner.nextLine();
            boolean vacation = true;

            // If statements
            if (pet.equals("True")){
                System.out.println("Do you have a pet sitter? Enter 'True' or 'False'. ");
                String sitter = scanner.nextLine();
                if (sitter.equals("False")){
                    vacation = false;
                } else if (sitter.equals("True")){ // elif statements (written else if)
                    vacation = true;
                }
            } else { // else statements
                vacation = true;
            }

            if (vacation == true){
                System.out.println("\nYou can go on vacation!");
            } else {
                System.out.println("\nUnfortunately, you cannot go on vacation.");
            }
        } else if (day == 5){
            // FOR LOOPS
            for (int i = 0; i <= 5; /*The value to the right will be called 'last slot' --> */ i++){
                System.out.println("Round " + (i+1));
            }
            // The last slot determines what happens to the index variable (in this case i).
            // Right now, the index variable is being incremented by 1


            // The last slot can be:
            // i++,
            // i++
            // i += 1
            // i -= 1
            // i *= 1
            // i /= 1
            // i = f(i) <-- This is a mathematical function that is defined elsewhere

            System.out.println("\n------------------------------------------------------------------------------------\n");

            // WHILE LOOPS
            while (true){
                // This runs forever
                // However, the break method stops the loop
                break;
            }

            // Usually, a while loop takes a condition and runs until the condition is falsified
            int index = 0;
            // In this case, the code runs whenever index < 3
            while (index < 3){
                index += 1;
                System.out.println(index);
                System.out.println("\n");
            }
            System.out.println("\n");

            System.out.println("\n------------------------------------------------------------------------------------\n");

            // EXCERCISE
            System.out.print("FL: ");
            for (int j = 1; j < 21; j++){
                System.out.print(j + ", ");
            }

            System.out.print("\nWL: ");
            int x = 1;
            while (x < 20){
                x++;
                System.out.print(x + ", ");
            }

            System.out.println("\n------------------------------------------------------------------------------------\n");

            // HARD EXCERCISE (FIBONACCI)

            System.out.println("\nEnter a number ");
            String f = scanner.nextLine();
            int fibonacci = Integer.parseInt(f);
            System.out.println("\n");

            int fi = 0;
            int counter = 0;
            int currentNum = 0;
            // Creating a list
            List<Integer> list = new ArrayList<Integer>();

            while (fi < fibonacci){
                fi += 1;
                list.add(currentNum);
                System.out.print(list.get(fi-1) + ", ");
                if (currentNum < 2){
                    if (currentNum == 1){
                        counter += 1;
                        if (counter == 2){
                            currentNum = 2;
                        } else {
                            currentNum = 1;
                        }
                    } else if(currentNum == 0){
                        currentNum = 1;
                    }
                } else {
                    // Accessing the list
                    currentNum = currentNum + (list.get(fi-2));
                }
            }
        } else if (day == 6){
            // DIRECTLY TO EXERCISE
            System.out.println("\nEnter a number greater than 1, and this function will check whether it's a prime number or not. ");
            String p = scanner.nextLine();
            int primenum = Integer.parseInt(p);

            // Loop & if statement to check if the square root of primenum is prime or not
            if(primenum != 2){
                for (int i = 2; i < Math.sqrt(primenum); i++){
                    if (primenum % i == 0){
                        System.out.println("\nYour number is not prime.");
                        break;
                    } else {
                        System.out.println("\nYour number is prime.");
                        break;
                    }
                }
            } else {
                System.out.println("\nYour number is prime.");
            }

        } else if (day == 7){

            String s1 = "Java";
            String s2 = "Java";
            String s3 = "C++";

            boolean t1;
            boolean t2;

            // Using .equals to compare strings
            if (s1.equals(s2)){
                t1 = true;
            } else {
                t1 = false;
            }

            if (s1.equals(s3)){
                t2 = true;
            } else {
                t2 = false;
            }

            System.out.println("\n" + t1 + ", " + t2);

            String n1 = "JavaScript";
            String n2 = "HTML";
            String n3 = "CSS";

            // Concatenating strings
            n1 = n1.concat(n2);
            n1 = n1.concat(n3);

            System.out.println("\n" + n1);

        } else if (day == 8){

            System.out.println("\nEnter an integer. ");
            String n81 = scanner.nextLine();

            System.out.println("\nEnter another integer. ");
            String n82 = scanner.nextLine();

            // Parsing the inputs (converting them to int data type)
            int num81 = Integer.parseInt(n81);
            int num82 = Integer.parseInt(n82);

            // Creating a new object (You have to use the driver name)
            GFG obj = new GFG();

            // Using "obj" to call calculateSum (you use an object to call a function)
            int sum8 = obj.calculateSum(num81, num82);
            System.out.println("\nThe sum of these two numbers is " + YELLOW + sum8 + RESET + ".");

        } else if (day == 9) {
            System.out.println("Go to Rectangle.java");
        } else if (day == 10) {
            System.out.println("Constructors are templates for an object.");
            System.out.println("In detail, they have a specific set of rules and parameters for the object.");
            System.out.println("The ToString method simply converts a non-string data type to a string.");
        } else if (day == 11) {
            System.out.println("Instance methods are functions used with private variables.");
            System.out.println("For more, go to SimpleCalculator.java");
        } else if (day == 12) {
            System.out.println("Go to Arrays.java");
        } else if (day > noOfDaysBetween){
            System.out.println("\nThis day does not exist. Run the project again.");
        }
    }
}
