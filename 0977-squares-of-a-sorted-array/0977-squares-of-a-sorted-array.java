class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i ++ ){
            nums[i] = nums[i]*nums[i];

        }

        int start = 0;
        int end = nums.length - 1;
        for(int pos = nums.length-1 ; pos >=0 ; pos --){
            if(nums[start] < nums[end]){
                result[pos] = nums[end];
                end--;
            }
            else{
                result[pos] = nums[start];
                start ++;
            }
        }
        return result;
    }
}