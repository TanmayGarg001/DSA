//https://www.geeksforgeeks.org/allocate-minimum-number-pages/

public class Main5 {

    public int solve(int[] arr, int m) {//O(nlogn),O(1)
        if (m > arr.length) {
            return -1;//if number of students surpass the array elements.
        } else {
            int low = 0;
            int high = 0;
            int ans = -1;
            for (int i = 0; i < arr.length; i++) {
                low = Math.max(low, arr[i]);
                high = high + arr[i];
            }
            while (low <= high) {
                int mid = low + ((high - low) / 2);
                if (isAnswer(arr, m, mid)) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return ans;
        }
    }

    public boolean isAnswer(int[] arr, int m, int mid) {
        int students = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid) {
                return false;//coz we decide threshold can't be greater than mid
            }
            if (arr[i] + sum > mid) {
                students++;//increase number of students by 1 as pages surpassed the threshold of 1 student
                sum = arr[i];//new student page count starts
                if (students > m) {
                    return false;
                }
            } else {
                sum = sum + arr[i];
            }
        }
        return true;
    }

}
