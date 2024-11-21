package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class GraphTraversalBFS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  //size of graph
        int m = in.nextInt(); //taking input of number of edges
        ArrayList<ArrayList<Integer>> G = new ArrayList<>(); //constructing the arraylist for the garph


        //// creating n number of vertices in graph
        for (int i = 0; i <=n; i++) {
            G.add( new ArrayList<>());
        }

        //reading edges of graph
        for (int i = 1; i <=m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            G.get(u).add(v);
            G.get(v).add(u); //making un-directed graph
        }



    }
}
