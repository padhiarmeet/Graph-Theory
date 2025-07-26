package self_learning.lab_2;

public class GoodNumber {
    public static void main(String[] args) {
        int[] nums = {2,5,2,6};
        System.out.println(checkForGood(0, nums, true));
    }
    static boolean checkForGood(int index,int[] nums,boolean isGood){
        if(index >= nums.length){
            return isGood;
        }
        if(index % 2 == 0){
            isGood = isGood && (nums[index] % 2 == 0);
        }
        else{
            isGood = isGood && isPrime(nums[index]);
        }
        return checkForGood(index + 1, nums, isGood);
    }
     static boolean isPrime(int n){
       
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
