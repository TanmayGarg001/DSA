//https://leetcode.com/problems/powx-n/

public class Main2 {

    public double myPowFast(double x, int n) {//O(1),O(1)
        return Math.pow(x, n);
    }

    double myPow(double x, int n) {//O(logn),O(stack):https://stackoverflow.com/questions/13544862/recursion-and-memory
        if (n == 0) return 1;
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        }
        return x * myPow(x * x, n / 2);
    }

}
