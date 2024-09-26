//https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true

package hackerrank;

public class DiagonalDifference {
    public static void main(String[] args) {
        int[][]  arr = {
                {-10, 3, 0, 5, -4},
                {2, -1, 0, 2, -8},
                {9, -2, -5, 6, 0},
                {9, -7, 4 ,8, -2},
                {3, 7, 8, -5, 0},
        };

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == j){
                    sum1 += arr[i][j];
                }
                if(i+j == arr.length-1){
                    sum2 += arr[i][j];
                }
            }
        }
        System.out.println(sum1-sum2);
    }
}
