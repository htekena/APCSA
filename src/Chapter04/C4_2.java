package Chapter04;

import java.util.Scanner;

/**
 * Program to display strings from user
 *
 * @author Tekena Harcourt
 */
public class C4_2 {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = input.next();

        System.out.print("Enter string s2: ");
        String s2 = input.next();

        if (s1.contains(s2)) {
            System.out.printf("%s is a substring of %s.\n", s2, s1);
        } else {
            System.out.printf("%s is not a substring of %s.\n", s2, s1);
        }
    }
}
