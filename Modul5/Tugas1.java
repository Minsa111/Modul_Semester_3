package Modul5;

import java.util.Arrays;
import java.util.Scanner;



public class Tugas1 {
    public static void main(String[] args) {
        int[] arr = {-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30};
        System.out.println("before sorting");
        System.out.println(Arrays.toString( arr )+"\n\n");
        for (int i = 0; i < 11; i++) {

            for(int j = i+1; j < 11; j++) {

                if (arr[i] > arr[j]) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
        Scanner in = new Scanner( System.in );
        System.out.println("Pick a number between\n"+Arrays.toString(arr)+":");
        int ans = in.nextInt();

        for (int i=0; i<11; i++){
            if (ans==arr[i]){
                System.out.println(ans+" is at index "+i);
            }
        }
    }
}