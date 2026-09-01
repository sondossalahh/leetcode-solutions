class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> kidsList= new ArrayList<>();
		int maxCandies = Arrays.stream(candies).max().getAsInt();
		for(int i = 0 ; i< candies.length; i++){
			if(candies[i]+extraCandies >= maxCandies){
				kidsList.add(true);
			}
			else
				kidsList.add(false);
		}
		return kidsList;
    }
}