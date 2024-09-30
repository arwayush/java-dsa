//https://www.hackerrank.com/challenges/designer-pdf-viewer/problem?isFullScreen=true

package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class DesignerPDFViewer {
    public static void main(String[] args) {

        //taking String input;
        String word = "zaba";
        int[] h = {1, 3, 1, 3, 1, 4 ,1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};

        int max = 0;

        for (int i = 0; i < word.length(); i++) {
            int idx = Math.abs('a' - word.charAt(i));
            int temp = h[idx];

            if(temp > max){
                max = temp;
            }
        }

        System.out.println( max*word.length());

    }
}
