package Arrays;

import java.util.ArrayList;

public class Searchin2Darray {

    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int j = mat.get(0).size()-1;
        boolean ans = false;

        for (int i = 0; i < mat.size(); i++) {
            if (mat.get(i).get(j) >= target) {
                ans = binarySearch(mat, i, 0, j, target);
                break;
            }
        }

        return ans;
    }
    static boolean binarySearch(ArrayList<ArrayList<Integer>> matrix, int row, int s, int e, int target){
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (matrix.get(row).get(mid) == target) return true;
            else if (target < matrix.get(row).get(mid)) e = mid - 1;
            else s = mid + 1;
        }

        return false;
    }
}
