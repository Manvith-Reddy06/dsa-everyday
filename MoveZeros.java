//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

//Note that you must do this in-place without making a copy of the array.

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int inpos=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[inpos]=nums[i];
                inpos++;
            }


        }
        while(inpos<n){
            nums[inpos]=0;
            inpos++;
        }

       
    }
}
