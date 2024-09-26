package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class CompareTheTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        int a, b, c, m, n, p;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        ArrayList<Integer> alice = new ArrayList<>();
        alice.add(a);
        alice.add(b);
        alice.add(c);

        m = in.nextInt();
        n = in.nextInt();
        p = in.nextInt();

        ArrayList<Integer> bob = new ArrayList<>();
        bob.add(m);
        bob.add(n);
        bob.add(p);

        int alice_score = 0;
        int bob_score = 0;

        for (int i = 0; i < alice.size(); i++) {
            if(alice.get(i) > bob.get(i)){
                alice_score += 1;
            }else if(alice.get(i) < bob.get(i)){
                bob_score += 1;
            }
        }

        System.out.println(alice_score+ " " +bob_score);



    }
}
