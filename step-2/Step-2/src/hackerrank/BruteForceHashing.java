package hackerrank;

public class BruteForceHashing {
    public static void main(String[] args) {
        int[]  arr = {1,5,5,5,5,5,5,5,5,6,7,8,8,6,6,4,4,3,2};
        int[]  query = {2,3,5,9,8};

        int p = arr.length;
        int m = query.length;

        for(int j = 0; j<m; j++){
            int count = 0;
            int n = query[j];
            for(int i =0; i<p; i++){
                if(arr[i] == n){
                    count++;
                }
            }
            System.out.println(query[j]+ " -> " +count + " times");
        }
    }
}

//Time Complexity :- O(p*m)
//p -> size of array
//m -> size of query array

