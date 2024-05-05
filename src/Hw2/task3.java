package Hw2;

public class task3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,1,5,6,7};
        System.out.println(zero(arr));
    }
    public static boolean zero(int[] arr){
        boolean k = false;
        for (int i = 0; i <arr.length ; i++) {
            if ((arr[i] ==0 && arr[i - 1] ==0) || (arr[i] == 0 && arr[i + 1] ==0)) {
                k = true;
            }
        }
        return k;
    }
}
