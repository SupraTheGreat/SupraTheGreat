package ClassesJava;
import java.util.concurrent.ThreadLocalRandom;

public class Rectangle {
    int width = 2;
    int length = 3;

    static int noOfObjects = 0;

    {
        noOfObjects += 1;
    }

    public static int getRandomValue(int Min, int Max)
    {

        // Get and return the random integer
        // within Min and Max
        return ThreadLocalRandom
                .current()
                .nextInt(Min, Max + 1);
    }

    public static void main(String[] args){

        // Declaring multiple variables in a single line
        int Min = 1, Max = 12;

        // Creating a new rectangle object as rectangle1
        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = getRandomValue(Min, Max); // Getting random values between a specified range
        rectangle1.length = getRandomValue(Min, Max);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = getRandomValue(Min, Max);
        rectangle1.length = getRandomValue(Min, Max);

        Rectangle rectangle3 = new Rectangle();
        rectangle3.width = getRandomValue(Min, Max);
        rectangle1.length = getRandomValue(Min, Max);

        // Variables like rectangle1.width are just attributes of the object, which in this case, is rectangle1.
        System.out.println("Rect 1 Width: " + rectangle1.width + ", Rect 1 Length: " + rectangle1.length);
        System.out.println("Rect 1 Area: " + rectangle1.width*rectangle1.length + ", Rect 1 Perimeter: " + (2*rectangle1.width + 2* rectangle1.length));
        System.out.println("\n");

        System.out.println("Rect 2 Width: " + rectangle2.width + ", Rect 2 Length: " + rectangle2.length);
        System.out.println("Rect 2 Area: " + rectangle2.width*rectangle2.length + ", Rect 2 Perimeter: " + (2*rectangle2.width + 2* rectangle2.length));
        System.out.println("\n");

        System.out.println("Rect 3 Width: " + rectangle3.width + ", Rect 3 Length: " + rectangle3.length);
        System.out.println("Rect 3 Area: " + rectangle3.width*rectangle3.length + ", Rect 3 Perimeter: " + (2*rectangle3.width + 2* rectangle3.length));
        System.out.println("\n");

        // Every time an object is created, noOfObjects is incremented by 1.
        // Here, we are getting the final value of noOfObjects
        System.out.println("There are " + Rectangle.noOfObjects + " objects.");
    }
}
