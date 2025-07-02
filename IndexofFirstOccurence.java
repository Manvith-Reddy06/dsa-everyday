
    class Solution {
    public int IndexofFirstOccurrence(String haystack, String needle) {
        int n1=needle.length();
        int n2=haystack.length();
        if(n2<n1){
            return -1;
        }
        if(n1==1 && n2==1){return 0;}
        for(int i=0;i<n2;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                // System.out.println(haystack.substring(i,i+n1));
                if(i+n1<=n2 && haystack.substring(i,i+n1).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}