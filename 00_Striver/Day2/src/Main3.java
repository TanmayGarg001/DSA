//https://leetcode.com/problems/merge-sorted-array/

public class Main3 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {//O(n),O(1)
        int p1 = m - 1;
        int p2 = n - 1;
        int fin = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[fin] = nums1[p1];
                p1--;
            } else {
                nums1[fin] = nums2[p2];
                p2--;
            }
            fin--;
        }
        while (p2 >= 0) {
            nums1[fin] = nums2[p2];
            p2--;
            fin--;
        }
    }

}
