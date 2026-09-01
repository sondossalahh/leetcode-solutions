class Solution {
    public boolean isPalindrome(int x) {
        String xStr= String.valueOf(x);
        for(int i = 0, j=xStr.length()-1 ; i<xStr.length()/2; i++,j--){
            if(xStr.charAt(i)!=xStr.charAt(j))
                return false;
        }
        return true;
    }
}