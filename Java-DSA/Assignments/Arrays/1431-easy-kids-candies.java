class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        int max = candies[0];
        ArrayList<Boolean> result = new ArrayList<> (len);
        for(int i=0;i<len;i++){
            if(max<candies[i]){
                max = candies[i];
            }
        }

        for(int i=0;i<len;i++){
            if((candies[i]+ extraCandies) >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
    return result;    // only logic, this will will not run  until we use main class and provide appropriate input for method


        
    }
}