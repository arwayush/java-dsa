package twoDArrays;

public class PrintTheMatrixInZshape {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {7, 8, 9, 0},
                {0, 2, 4, 6}
        };
        int row = mat.length;
        int col = mat[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(i == 0 || i+j == mat.length-1 || i == mat.length-1){
                    System.out.print(mat[i][j]+ " " );
                }
            }
            System.out.println();
        }
    }
}
