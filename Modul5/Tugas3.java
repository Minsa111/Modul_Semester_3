package Modul5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.*;
public class Tugas3 {
    public static void main(String[] args) {
        int size;
        float ans, tempSize;
        float positive=0, negative=0, nol=0;


        Scanner in = new Scanner( System.in );
        System.out.printf( "Size: " );
        size = in.nextInt();
        int[] arr = new int[size];
        tempSize=size;
        in.nextLine();


        System.out.printf( "Number: " );
        String str[] = in.nextLine().split( " ");


        for(int i =0; i<arr.length; i++){
            arr[i] = Integer.parseInt( str[i] );
        }

        Arrays.sort( arr );
        System.out.println(Arrays.toString( arr ));

        for(int i=0;i<arr.length; i++){
            if (arr[i]<0){
                negative++;
            } else if (arr[i]>0) {
                positive++;
            }else {
                nol++;
            }
        }
        ans = positive/tempSize;
        System.out.printf("\nPositive\t: %.2f\n",ans);
        ans = negative/tempSize;
        System.out.printf("Negative\t: %.2f\n",ans);
        ans = nol/tempSize;
        System.out.printf("Zero\t\t: %.2f\n",ans);
    }
}
