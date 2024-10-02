package Hackerank;

import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int term = a;
            StringBuilder result = new StringBuilder();

            for (int j = 0; j < n; j++) {
                // Calculate the current term
                term += b * (1 << j); // 1 << j is equivalent to 2^j
                result.append(term).append(" "); // Append the term to the result
            }
            System.out.println(result.toString().trim());
        }
        in.close();
    }
}
