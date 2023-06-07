package Arrays;

public class searchinrotatedsortedarray {
    public int search(int[] nums, int target) {
        return s(nums, target, 0,nums.length-1);
    }
    static int s(int[] arr,int target, int s, int e){
        if (s > e) {
            return -1;
        }

        int m = s + (e-s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return s(arr, target, s, m-1);
            } else {
                return s(arr, target, m+1, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]) {
            return s(arr, target, m+1, e);
        }

        return s(arr, target, s, m-1);
    }

}

