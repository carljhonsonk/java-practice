class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        if (x == 0) {
            return 0;
        }else if (x == 1){
            return 1;
        }

while (start <= end) {
    int mid = start + (end-start)/2;
long Square = (long) mid*mid;


if (Square == x) {
    return mid;
}else if (Square < x){
    start = mid + 1;
}else{
    end = mid - 1;
}


}


return end;
    }
}
