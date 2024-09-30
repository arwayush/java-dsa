package hackerrank;

import java.util.Scanner;

public class CatsAndMouse {
    private static String catAndMouse(int x, int y, int z) {
        int distA = Math.abs(z-x);
        int distB = Math.abs(z-y);
        if(distA == distB){
            return "Mouse C";
        }else if(distB < distA){
            return "Cat B";
        }else{
            return "Cat A";
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the cats Postion:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.print("Enter the Rat's Postion:");
        int z = in.nextInt();

        System.out.println(catAndMouse(x,y,z));
    }
}
