class Solution {
    public boolean isPal(String s){
        int left=0,right=s.length()-1;
        while(left<right){
            char a= s.charAt(left);
            char b= s.charAt(right);
            if(a!=b){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean validPalindromeII(String s) {
        int left=0,right=s.length()-1;
        while(left<right){
            char a= s.charAt(left);
            char b= s.charAt(right);
            if(a!=b){
                String sub1= s.substring(left+1, right+1);
                String sub2= s.substring(left,right);
                if(isPal(sub1)){
                    return true;
                }else if(isPal(sub2)){
                    return true;
                }
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}