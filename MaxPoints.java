class Solution {
    public int maxScore(int[] cp, int k) {
        int lsum=0,rsum=0;
        int n= cp.length;
        for(int i=0;i<k;i++){
            lsum+=cp[i];
        }
        int max=lsum;
        int ri=n-1;
        for(int i=k-1;i>=0;i--){
            rsum+=cp[ri];
            lsum-=cp[i];
            System.out.println(lsum+" "+rsum);
            ri--;
            if(lsum+rsum >max){
                max=lsum+rsum;
            }
        }
        return max;
        
    }
}