package Modul5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Tugas2 {

        public static void main(String[] args) {
            List<Integer> arr = Arrays.asList(-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30);

            System.out.println("before sorting\n"+arr);


            arr.sort( Comparator.naturalOrder());
            System.out.println("\n\nsorted arrays:\n"+arr);


            Scanner in = new Scanner( System.in );
            System.out.print("\nInsert a number to search the index out of it: ");
            int ans = in.nextInt();

            boolean found =false;
                for (int i=0; i< arr.size(); i++){

                    if (ans== arr.get( i )) {
                        System.out.println("Number found at index: "+i);
                        found=true;
                    }
                }

            if (!found){
                System.out.println("Sorry the number that you've inputted is not available in out arrays lmao xD");
            }
            /*
            List<Integer> arr = Arrays.asList(-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30);
            arr.sort( Comparator.naturalOrder());
            Scanner in = new Scanner( System.in );
            int ans = in.nextInt();
            arr.indexOf(ans);
             */
        }
}
