package twoDArrays;

public class PrintingBoundaryElements {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3, 6,32},
                {3,2,1, 43, 44},
                {3,4,5, 23, 4},

        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==0 || j == 0 ||i == arr.length-1 || j == arr[0].length-1){
                    System.out.print(arr[i][j]+ " ");
                }
            }
            System.out.println();
        }
    }
}
