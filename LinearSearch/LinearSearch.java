public class Search{
    public static void main(String[] args) {
        int target = 10;
        int [] arr = {1,2,3,4,5,6,7,10,14,16};
        int ans = Binary(arr, target);
        System.out.println(ans);
        
    }
    static int Binary(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == target) {
                return mid;
            }

else if (target < arr[mid]){
    end = mid - 1;
}
else if (target > arr[mid])
start = mid + 1;


        }
        return -1;
    }
}
