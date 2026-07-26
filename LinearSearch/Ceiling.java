static int search(int [] arr , int target){

if (target > arr[arr.length -1]) {
    return -1;
}



int start = 0;
int end = arr.length-1;
while (start <= end) {
   int mid = start + (end - start)/2;
    if (arr[mid] == target) {
        return arr[mid];
    }
    else if(target < arr[mid]){
        end = mid - 1;
    }else if (target > arr[mid]){
        start = mid + 1;
    }
}
return arr[start];
    }
}
