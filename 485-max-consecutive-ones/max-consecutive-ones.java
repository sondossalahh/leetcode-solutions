class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount=0;
        int occurrenceNum=0;
        for(int num : nums){
            if (num ==1) {
                occurrenceNum++;
                maxCount=Math.max(occurrenceNum,maxCount);
            }
            else
                occurrenceNum=0;
        }
        return maxCount;
    }
}