//https://leetcode.com/problems/median-of-two-sorted-arrays/

public class Main4 {

    public double findMedianSortedArrays(int[] a1, int[] a2) {
        int n1 = a1.length;
        int n2 = a2.length;
        if (n1 > n2) {
            n2 = a1.length;
            n1 = a2.length;
        }
        int low = 0, high = n1;
        while (low <= high) {
            int C1 = (low + high) / 2;
            int C2 = n1 + n2 - C1;

            double L1 = (C1 == 0) ? Integer.MIN_VALUE : a1[(C1 - 1) / 2];
            double R1 = (C1 == 2 * n1) ? Integer.MAX_VALUE : a1[C1 / 2];
            double L2 = (C2 == 0) ? Integer.MIN_VALUE : a2[(C2 - 1) / 2];
            double R2 = (C2 == 2 * n2) ? Integer.MAX_VALUE : a2[C2 / 2];

            if (L1 > R2) high = C1 - 1;
            else if (L2 > R1) low = C1 + 1;
            else return (Math.max(L1, L2) + Math.min(R1, R2)) / 2;
        }
        return -1;
    }

}
