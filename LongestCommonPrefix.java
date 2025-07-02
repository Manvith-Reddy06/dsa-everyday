class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        StringBuilder sb= new StringBuilder();
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            mini=Math.min(mini,strs[i].length());
    
        }
        char newChar='a';
        for(int i=0;i<mini;i++){
            char currentChar= strs[0].charAt(i);
            boolean matchall= true;
            // System.out.println(currentChar+" ");
            for(int j=1;j<n;j++){
                newChar= strs[j].charAt(i);
                // System.out.println(currentChar+" "+newChar);
                if(newChar!=currentChar){
                    matchall=false;
                    break;
                }
            }
            if(matchall){
                sb.append(newChar);
            }else{
                break;
            }
    }
    return sb.toString();

    }
}