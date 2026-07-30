class Solution {
    public int arrangeCoins(int n) {
      int start = 1;
      int end = n; 
      long result = 0; 
      while (start <= end){
        int mid = start + (end - start)/2;
long coinsneeded = (long) mid*(mid + 1)/2;
if (coinsneeded <= n){
    result = mid;
    start = mid + 1;

}else{
    end = mid - 1;
}


      }
      return (int) result;
    }
}
