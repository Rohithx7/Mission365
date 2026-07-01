class Solution {
    public int[] getConcatenation(int[] nums) {
        int numsLen = nums.length;
        int arr[] = new int[2*numsLen];
        for(int i=0;i<numsLen;i++ ){

                arr[i] = nums[i];
        }        
        
        for(int i=0;i<numsLen;i++ ){

            arr[i+numsLen] = nums[i];
                
        }        
        return arr;
    }
}