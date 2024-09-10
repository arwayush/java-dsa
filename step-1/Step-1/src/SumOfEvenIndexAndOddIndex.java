import java.util.ArrayList;

public class SumOfEvenIndexAndOddIndex {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(40);
        list.add(60);
        list.add(70);
        list.add(70);
        list.add(660);
        System.out.println("The sum of numbers at even index is:" +SumOfEvenIndex(list));
        System.out.println("The sum of numbes at the odd index is:" + SumOfOddIndex(list));

    }

    private static int SumOfOddIndex(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if(i%2 != 0){
                sum += list.get(i);
            }
        }
        return  sum;
    }

    private static int SumOfEvenIndex(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if(i%2 == 0){
                sum += list.get(i);
            }
        }
        return  sum;
    }


}
