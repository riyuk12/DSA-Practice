class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1])return false; 
        }
        return true;
    }
}