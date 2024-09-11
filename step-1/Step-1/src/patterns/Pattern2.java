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
//

package patterns;
public class Pattern2 {

    public static void main(String[] args) {
        int n = 4;
        for (int row = 1;  row<=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
