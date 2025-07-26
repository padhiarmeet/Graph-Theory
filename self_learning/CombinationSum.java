package self_learning;

import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        int arr[] = {2,3,5};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> targetArr = new ArrayList<>();
        int target = 8;

        performSum(ans, 0, arr, target, targetArr);

        for(int i = 0; i < ans.size();i++){
            System.out.println(ans.get(i) + " ");
        }
    }
    public static void performSum(List<List<Integer>> ans,int index,int arr[],int target,List<Integer> targetarray){
        if(index >= arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(targetarray));
            }
            return;
        }
        if(arr[index] <= target){
            targetarray.add(arr[index]);
            performSum(ans, index, arr, target - arr[index], targetarray);
            targetarray.remove(targetarray.size() - 1);
        }
        performSum(ans, index + 1, arr, target, targetarray);
    }
}
