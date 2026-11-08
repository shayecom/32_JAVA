public class JavaRecursion {

    static int multipleRange(int start, int end) {
        if (start > end) {
            return 1;
        }

        if (start == end) {
            return start;
        }

        return start * multipleRange(start + 1, end);

    }

    public static void main(String[] args) {
        System.out.println(multipleRange(4,6)); // 120
        System.out.println(multipleRange(2,7)); // 5040
    }

}
