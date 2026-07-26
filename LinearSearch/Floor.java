public class Floor{
    static int floor(int [] arr , int target){

if (target < arr[0]) {
    return -1;
}

        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == target) {
                return arr[mid];
            }else if ( arr[mid] > target){
                end = mid - 1;
            } else if (arr[mid] < target){
                start = mid + 1;
            }
        }
        return arr[end];
    }
}
