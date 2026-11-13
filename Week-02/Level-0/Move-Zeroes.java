class Solution {
    public void moveZeroes(int[] nums) {
        int pt1=0;
        int pt2=0;

        for(pt2=0; pt2<nums.length; pt2++){
            if(nums[pt2] != 0){
                nums[pt1] = nums[pt2];
                pt1++;
            }
        }

        for(int i=pt1; i<nums.length; i++){
            nums[i] = 0;
        }
    }
}
