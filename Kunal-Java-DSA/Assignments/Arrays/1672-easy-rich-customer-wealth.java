class Solution {
    public int maximumWealth(int[][] accounts) {
        int accountsLen = accounts.length;
        int sum[] = new int[accountsLen];
        for(int i=0;i<accountsLen;i++){
            for(int j = 0; j<accounts[i].length;j++){

                sum[i] += accounts[i][j];

            }
        }
        int temp = sum[0];
        for(int i=0;i<accountsLen;i++){
            if(temp < sum[i]){
                temp = sum[i];
            }
        }

        return temp;
        
    }    // only logic, this will will not run  until we use main class and provide appropriate input for method

}