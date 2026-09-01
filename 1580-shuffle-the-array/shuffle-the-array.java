class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[]shuffle=new int[n*2];
        for (int i=0 ; i<n ; i++){
            shuffle[i*2]=nums[i];
            shuffle[2*i+1]=nums[i+n];
        }
        return shuffle;
    }
}