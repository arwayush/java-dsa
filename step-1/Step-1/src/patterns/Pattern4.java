//Step-1 run the outer loop for the number of lines you need to print
// no. of lines = no of rows = no of times outer loop will run
//1
//12
//123
//1234
//12345

// Step:-2 Identify for every row number
// how many columns are there or
// types of element in the column

//Step:- 3 What do you need to print
//Step:- 4 Identify the formula


package patterns;

public class Pattern4 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}