package Modul4;

import java.util.Scanner;

public class ok {


    /*
    public static void count(int x){
        int year;
        year = x / 365;

        int month;
        month = x / 30;
        month = month % 12;

        int day;
        day = x%30;

        System.out.println(x+" Days= "+year+" Years "+month+" Month "+day+" Days.");
    }*/
    // **Original Source code**  (Before)

    public static void count(int x){
        int year = countYear( x );

        int month = countMonth( x );

        int day = countDay( x );

        System.out.println(x+" Days= "+year+" Years "+month+" Month "+day+" Days.");
    }


    //Extract Method
    private static int countYear(int x) {
        int year;
        year = x / 365;
        return year;
    }

    private static int countMonth(int x) {
        int month;
        month = x / 30;
        month = month % 12;
        return month;
    }

    private static int countDay(int x) {
        int day;
        day = x %30;
        return day;
    }
    //After Extract Method


    public static void main(){
        int x;
        Scanner in = new Scanner(System.in);
        System.out.print("Number of days: ");
        x = in.nextInt();
        count(x);
    }

    public static void main(String[] args) {
        main();
    }
}


