//Step-1 run the outer loop for the number of lines you need to print
// no. of lines = no of rows = no of times outer loop will run
//        0
//        00
//        000
//        0000

// Step:-2 Identify for every row number
// how many columns are there or
// types of element in the column

//Step:- 3 What do you need to print
//Try to find the formula related rows and columns


package patterns;

public class Pattern3 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <= 5+1-i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
