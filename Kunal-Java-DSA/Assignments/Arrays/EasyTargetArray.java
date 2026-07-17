

class EasyTargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int numsLen =    nums.length;
        int target[] = new int[numsLen];
        for(int i=0;i<numsLen;i++){
            if(target[i] == 0){
                    target[i] = nums[index[i]];
                }
            else{
            
                
            }

        }

        return target;
    }
    public static void main(String[] args) {
        int nums[] = {0,1,2,3,4};
        int index[] = {0,1,2,2,1};
        int result[];
        result = createTargetArray(nums,index);
       for(int i:result){
        System.out.print(i+" ");
       }
    }

}