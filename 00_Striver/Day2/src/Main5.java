//https://www.interviewbit.com/problems/repeat-and-missing-number-array/

public class Main5 {

    public static int[] repeatedNumber(final int[] A) {//O(n),O(1)
        long sum, actualSum = 0, squareSum, actualSquareSum = 0;
        for (long i : A) {
            actualSum += i;
            actualSquareSum += i * i;
        }
        long n = A.length;
        sum = (n * (n + 1)) / 2;
        squareSum = (n * (n + 1) * (2 * n + 1)) / 6;
        long x = sum - actualSum;
        long y = (squareSum - actualSquareSum) / x;
        long a = (x + y) / 2;
        long b = a - x;
        return new int[]{(int) b, (int) a};
    }

}
