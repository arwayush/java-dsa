package twoDArrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {7, 8, 9, 0},
                {0, 2, 4, 6}
        };

        int row = mat.length;
        int col = mat[0].length;
        int[][] trans = new int[row][col];



        //simply changing i,j with j,i
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                trans[i][j] = mat[j][i];
            }
        }


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(trans[i][j]);
            }
            System.out.println();
        }



    }
}
