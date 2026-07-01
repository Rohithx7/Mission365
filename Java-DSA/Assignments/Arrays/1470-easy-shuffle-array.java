class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] arr = new int[2*n];
       int count =0 ;
       for(int i =0;i<n;i++){
    
        arr[count] = nums[i];
        arr[count+1] = nums[i+n];
        count+=2;


       }
       return arr;

    }    // only logic, this will will not run  until we use main class and provide appropriate input for method

}