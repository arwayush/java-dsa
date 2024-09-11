public class SummationOfReverseOfNumbersbetweenRange {
    public static void main(String[] args) {
        System.out.println(reverseFunc(31,39));
    }

    private static int reverseFunc(int start, int end) {
        int sum = 0;

        for (int i =start ; i <=end; i++) {
         int rev = 0;
         int num = i;
         while (num > 0){
             int rem = num % 10;
             rev = rev*10 + rem;
             num /= 10;
         }
         sum += rev;
        }
        return  sum;
    }
}
