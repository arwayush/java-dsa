package patterns;

import java.util.Scanner;

public class Pattern7_2 {
    public static void main(String[] args) {
        System.out.println("Enter the line of elements you wants to print:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char alpha = 71;
        for (int i = 1; i <=n; i++) {
            char alpha2 = alpha;
            for (int j = alpha2; j <=alpha; j++) {
                System.out.print(alpha2 + " ");
                alpha2++;
            }
            alpha--;
            System.out.println();
        }
    }
}
