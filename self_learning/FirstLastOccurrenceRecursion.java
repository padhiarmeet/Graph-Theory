package self_learning;

public class FirstLastOccurrenceRecursion {
    static int first = -1;
    static int last = -1;

    public static void main(String[] args) {
        String s = "bcee";
        char input = 'e';

        findFL(s, input, 0);

        if (first == -1) {
            System.out.println("Character not found.");
        } else {
            System.out.println("First: " + first + ", Last: " + last);
        }
    }

    public static void findFL(String s, char input, int index) {
        if (index >= s.length()) return;

        if (s.charAt(index) == input) {
            if (first == -1) {
                first = index;
            }
            last = index;
        }

        findFL(s, input, index + 1);
    }
}
