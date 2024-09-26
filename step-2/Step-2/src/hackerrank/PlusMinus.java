package hackerrank;

import java.util.ArrayList;

public class PlusMinus {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-4);
        list.add(3);
        list.add(-9);
        list.add(0);
        list.add(4);
        list.add(1);
        float positives = 0;
        float negatives = 0;
        float neutrals = 0;

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > 0){
                positives++;
            } else if (list.get(i) < 0) {
                negatives++;
            }else {
                neutrals++;
            }
        }

      negatives /= list.size();
        positives /= list.size();
        neutrals /= list.size();

        System.out.println(String.format("%.6f", negatives));
        System.out.println(String.format("%.6f", positives));
        System.out.println(String.format("%.6f", neutrals));

    }
}
