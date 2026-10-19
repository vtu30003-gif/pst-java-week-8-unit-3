
import java.util.*;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic {

    public int divisorSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        AdvancedArithmetic myCalculator = new MyCalculator();

        int sum = myCalculator.divisorSum(n);

        System.out.println("I implemented: " +
                myCalculator.getClass().getInterfaces()[0].getName());

        System.out.println(sum);

        sc.close();
    }
}
