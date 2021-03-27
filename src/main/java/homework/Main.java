package homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
    public static int[] array1(int[] arr){
        for (int i = arr.length -1; i >=0 ; i--) {
            if(arr[i]==4){
                return Arrays.copyOfRange(arr, i+1, arr.length);
            }
        }
        throw new RuntimeException(" Array has no 4");
    }
    public static boolean array2(int[] arr){
        boolean a = false;
        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!= 1 && arr[i] != 4){
                return false;
            }
            if(arr[i] ==1){
               a = true;
            }
            if(arr[i]==4){
                b = true;
            }
        }
        return a&&b;
    }
}
