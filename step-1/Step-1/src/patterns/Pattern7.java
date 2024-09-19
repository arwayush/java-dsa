//Step-1 run the outer loop for the number of lines you need to print
// no. of lines = no of rows = no of times outer loop will run
//A
//B C
//C D E
//D E F G
//E F G H I
//F G H I J K
//G H I J K L M



// Step:-2 Identify for every row number
// how many columns are there or
// types of element in the column

//Step:- 3 What do you need to print
//Step:- 4 Identify the formula



package patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        System.out.println("Enter the line of elements you wants to print:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char alpha = 65;
        for (int i = 1; i <=n; i++) {
            char alpha2 = alpha;
            for (int j = 1; j <=i; j++) {
                System.out.print(alpha2 + " ");
                alpha2++;
            }
            alpha++;
            System.out.println();
        }
    }
}
