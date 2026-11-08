public class MethodOverLoad {

//    static int addTwoNumbers(int a, int b) {
//        return a + b;
//    }
//
//    static double addDecimal(double a, double b) {
//        return a + b;
//    }
//
//    static int addThreeNumbers(int a, int b, int c) {
//        return a + b + c;
//    }

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static String add(String name) {
        return name;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static void sayHello(String name, int age) {
        System.out.println("Hello " + name + " you are " + age + " years old");
    }

    static void sayHello(int age, String name) {
        System.out.println("Hello " + name + " you are " + age + " years old");
    }

    static int globalNumber = 100;

    static void changeNumber(int number) {
        System.out.println("number is: " + number);
        number = 50;
        System.out.println("number is: " + number);
    }

    // Bad example of recursion
    static void recur(int count) {
        System.out.println(++count);
        System.out.println();
        recur(count);
    }

    // Normal example of recursion
    static void countdown(int number) {
        if (number == 0) {
            System.out.println("Done");
            return;
        }
        System.out.println(number);
        countdown(number - 1);
    }

    public static void main(String[] args) {
//        int num = 10;
//        changeNumber(globalNumber);
//        System.out.println(num);
//        System.out.println(globalNumber);
//        int count = 0;
//        recur(count);
        countdown(5);


        System.out.println("Done with countdown method");
    }

}
