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
        for (int j : arr) {
            if (j != 1 && j != 4) {
                return false;
            }
            if (j == 1) {
                a = true;
            }
            if (j == 4) {
                b = true;
            }
        }
        return a&&b;
    }
}
