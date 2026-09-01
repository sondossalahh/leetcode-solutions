class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>hashSet=new HashSet<>();
        for (int i = 0; i < nums.length ; i++) {
            hashSet.add(nums[i]);
        }
        if(nums.length==hashSet.size())
            return false;
        return true;
    }
}