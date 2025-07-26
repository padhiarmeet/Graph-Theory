package self_learning;

import java.util.Stack;

public class subsequnce_sum {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Stack<Integer> s = new Stack<>();

        subsequnce(0, nums, s,0);
    }
    static void subsequnce(int index,int[] nums,Stack<Integer> s,int sum){
        
        if(index >= 3){
            if(sum >= 6) System.out.println(s);

            return;
        }
        s.add(nums[index]);
        sum += nums[index];
        subsequnce( index + 1, nums, s,sum);
        s.removeElement(nums[index]);
        subsequnce( index + 1, nums, s,0);
    }

}
