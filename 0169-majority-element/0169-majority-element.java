class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0;
        int vote = 0 ;
        for(int i : nums){
            if(vote == 0){
                majority = i;
            }
            if(majority == i){
                vote ++;
            }
            else {
                vote --;

            }

        }
        return majority ;
    }
}