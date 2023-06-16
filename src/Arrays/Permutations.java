package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int nums[] = {1,2,3};

        List < List < Integer >> ls = permute(nums);
        System.out.println("All Permutations are");
        System.out.println(ls);
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(new ArrayList<>(),ans,nums);
        return ans;
    }
    static void backtrack(List<Integer> curr, List<List<Integer>> ans, int[] arr){
        if(curr.size()==arr.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int num:arr){
            if(!curr.contains(num)){
                curr.add(num);
                backtrack(curr,ans,arr);
                curr.remove(curr.size()-1);
            }
        }
    }
}