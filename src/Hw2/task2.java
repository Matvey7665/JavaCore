package Hw2;

public class task2 {
    public static void main(String[] args) {
        int[] arr = {34,23,45,6,47,77};
        System.out.println(difmaxmin(arr));
    }
    public static int difmaxmin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max - min;
    }
}
