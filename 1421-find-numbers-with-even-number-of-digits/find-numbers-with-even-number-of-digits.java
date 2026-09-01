class Solution {
    public int findNumbers(int[] nums) {
        int evenNumberCount=0;
        for(int num : nums){
            int number=String.valueOf(num).length();
            if(number % 2 == 0)
                evenNumberCount++;
        }
        return evenNumberCount;
    }
}