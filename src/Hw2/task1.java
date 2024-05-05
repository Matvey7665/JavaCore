package Hw2;

public class task1 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8};
        System.out.println(evennum(arr));
    }
    public static int evennum(int[] arr){
        int k = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] % 2 ==0){
                k++;
            }
        }
        return k;
    }
}
