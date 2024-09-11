//Step-1 run the outer loop for the number of lines you need to print
// no. of lines = no of rows = no of times outer loop will run
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *



// Step:-2 Identify for every row number
// how many columns are there or
// types of element in the column

//Step:- 3 What do you need to print
//Step:- 4 Identify the formula

package patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;


        //First print upper traingle
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }


        //2nd print the lower triangle
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n-i+1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
