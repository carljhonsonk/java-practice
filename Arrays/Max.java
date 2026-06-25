public class Max{
    public static void main(String[] args) {
        
    int [] arr = {1,2,4,4,21,42,19};

    int max = arr[0];

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            arr[i] = max;
        }
    }
    System.out.println(max);
    }
}
