package self_learning;

import java.util.Stack;

public class Subsequnce {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Stack<Integer> s = new Stack<>();

        subsequnce(0, nums, s);
    }
    static void subsequnce(int index,int[] nums,Stack<Integer> s){
        
        if(index >= 3){
            System.out.println(s);
            return;
        }
        s.add(nums[index]);
        subsequnce( index + 1, nums, s);
        s.removeElement(nums[index]);
        subsequnce( index + 1, nums, s);
    }

}
