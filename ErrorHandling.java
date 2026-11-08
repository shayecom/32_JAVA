import java.util.Arrays;

public class ErrorHandling {

    static void printArrValue(int[] numArr) {
        try {
            int num = numArr[1];
            System.out.println(num);

        } catch (Exception error) {
            System.out.println(error.getMessage());
        } finally {
            System.out.println("I ran from printArrValue");
        }
    }

    static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero from here");
        }
        return a / b;
    }

    public static void main(String[] args) {
        int[] numArr = {1, 2, 3};
        printArrValue(numArr);
        System.out.println("I can still run");

        try {
            int result = divide(10, 0);
            System.out.println(result);
        } catch (Exception error) {
            System.out.println(error.getMessage());
        } finally {
            System.out.println("I ran from the main method");
        }
        System.out.println("Program still running....");
    }


}
