class Solution {
    public int[] runningSum(int[] nums) {
        int numsLen = nums.length;
        int[] arr = new int[numsLen];
        arr[0] = nums[0];

        for(int i=1;i<numsLen;i++){

            arr[i] = arr[i-1] + nums[i];


        }
        return arr;
    }    // only logic, this will will not run  until we use main class and provide appropriate input for method

}