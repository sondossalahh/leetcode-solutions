class Solution {
    public int[] replaceElements(int[] arr) {
         int max;
        for (int i = 1 ; i< arr.length ; i++){
            max=arr[i];
            for (int j = i+1 ; j<arr.length ; j++){
                if(max<arr[j])
                    max=arr[j];
            }
            arr[i-1]=max;
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}