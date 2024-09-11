package twoDArrays;

public class LeftDiagonalsAndRightDiagonals {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {3,2,1},
                {3,4,5},

        };
        System.out.print("Left Diaognal Elements are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i == j){
                    System.out.print(arr[i][j]+ ", ");
                }
            }
        }
        System.out.println();
        System.out.print("Right Diagonal Elements are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i + j == arr.length-1){
                    System.out.print(arr[i][j]+ ", " );
                }
            }
        }
    }
}
