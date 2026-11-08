public class JavaExceptions {

    static int getSalary(String jobTitle) {
        if (jobTitle.equalsIgnoreCase("Fullstack")) {
            return 22000;
        }
        if (jobTitle.equalsIgnoreCase("backend")) {
            return 20000;
        }
        if (jobTitle.equalsIgnoreCase("frontend")) {
            return 18000;
        }
        throw new IllegalArgumentException("The provided job title is unsupported");
    }

    static void calculateFiveYearSalary(String name, String jobTitle) {
        try {
            int monthSalary = getSalary(jobTitle);
            int fiveYearSalary = (monthSalary * 12) * 5;
            System.out.println("Hello " + name + ", with the job\n" +
                    "title " + jobTitle + " you will earn in 5 years: " + fiveYearSalary + " shekels");
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
            System.out.println("Hello " + name + ", the job title you\n" +
                    "provide " + jobTitle + " is unknown to us, so we can’t calculate your salary in 5 years");
        }

    }

    static int calculate(int a, int b, String operation) {
        // IllegalArgumentException
        if (operation == null) {
            throw new IllegalArgumentException("Operation can not be null");
        }
        // Division by zero exception
        if (b == 0 && operation.equalsIgnoreCase("divide")) {
            throw new ArithmeticException("Can not divide by zero");
        }
        // Unsupported operation exception
        if (!operation.equalsIgnoreCase("divide") && !operation.equalsIgnoreCase("multiply")) {
            throw new UnsupportedOperationException("Unknown operation");
        }
        if (operation.equalsIgnoreCase("divide")) {
            return a / b;
        }
        return a * b;
    }

    public static void main(String[] args) {
        try {
            int results = calculate(10, 0, null);
            System.out.println(results);
        } catch (IllegalArgumentException error) {
            System.out.println("Invalid input: " + error.getMessage());
        } catch (ArithmeticException error) {
            System.out.println("Math error: " + error.getMessage());
        } catch (UnsupportedOperationException error) {
            System.out.println("Unsupported operation: " + error.getMessage());
        } finally {
            System.out.println("Calculation attempt finish");
        }
//        calculateFiveYearSalary("David", "fullstack");
//        calculateFiveYearSalary("John", "backend");
//        calculateFiveYearSalary("Moses", "frontend");
//        calculateFiveYearSalary("Larry", "designer");
//        System.out.println("I am still running!!!");

    }

}

/**
 * GET - users/get/1 != f8c3de3d-1fea-4d7c-a8b0-29f63c4c3454 -> IllegalArgumentException
 * backend - process to the request
 * DB - returns the user with id 1 -> validates if user with id 1 exists -> DBException
 */
