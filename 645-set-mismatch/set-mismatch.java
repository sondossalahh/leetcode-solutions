class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] newArr= new int[2];
        int count;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int i = 1 ; i< nums.length+1 ; i++){
            count=map.getOrDefault(i,0);
            if (count == 0)
                newArr[1] = i;
            if (count == 2)
                newArr[0] = i;
        }
        return newArr;
    }
}