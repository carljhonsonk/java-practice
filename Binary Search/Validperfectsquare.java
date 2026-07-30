class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num;
        while (start <= end){
            int mid = start + (end - start)/2;
            long Square = (long) mid*mid;
            if (Square == num){
                return true;
            } else if (Square > num){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return false;
    }
}
