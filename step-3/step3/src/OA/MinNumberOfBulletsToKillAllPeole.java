package OA;

import java.util.Arrays;

public class MinNumberOfBulletsToKillAllPeole {


    private static int bulletsForAll(int[] arr, int m){
        int totalBullets = 0;
        for(int strength : arr){
            totalBullets += Math.ceil((double) strength / m);
        }
        return totalBullets;
    }

    private  static  int bulletsForKperson(int[] people, int m, int k){
        Arrays.sort(people);
        int bullets = 0;
        for (int i = 0; i < k; i++) {
            bullets += Math.ceil((double)  people[i] / m);
        }
        return  bullets;
    }


    public static void main(String[] args) {
        int[] people = {15, 10, 20};
        int m = 5;
        int k = 2;
        System.out.println("Bullets to kill all people: " +bulletsForAll(people, m));
        System.out.println("Bullets to kill at least: " + bulletsForKperson(people, m, k));
    }
}
