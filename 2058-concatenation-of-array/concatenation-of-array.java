class Solution {
    public int[] getConcatenation(int[] nums) {
        int[]newArr=new int[nums.length*2];
        for(int i=0,j=nums.length ; i< nums.length;i++,j++ ){
            newArr[i]=newArr[j]=nums[i];
        }
        return newArr;
}
}