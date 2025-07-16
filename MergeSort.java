class Solution {
    public void mergeSort(int[] ar , int low,  int high){
        if(low==high){
            return;
        }
        int mid=(high+low)/2;
        mergeSort(ar , low ,  mid);
        mergeSort(ar , mid+1 , high);
        merge(ar, low,mid,high);
    }
    public void merge(int[] ar, int low, int mid, int high){
        int p1=low, p2=mid+1;
        int k=0;
        int[] temp = new int[high-low+1];
        while(p1<=mid&&p2<=high){
            if(ar[p1]>=ar[p2]){
                temp[k++]=ar[p2++];

            }else{
                temp[k++]=ar[p1++];
            }
        }
        while(p1<=mid){
            temp[k++]=ar[p1++];
        }
        while(p2<=high){
            temp[k++]=ar[p2++];
        }
        for(int i=0;i<k;i++){
            ar[low+i]=temp[i];
        }
    }
    public int[] sortArray(int[] nums) {
         mergeSort(nums,0,nums.length-1);
         return nums;
    }
}