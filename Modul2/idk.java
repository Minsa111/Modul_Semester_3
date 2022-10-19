package Modul2;

import java.util.Scanner;


public class idk {

    static public String [] book= new String[10];
    static public String [] books = new String[10];
    static String [] place = {"Malang","Bandung","Surabaya"};
    static boolean isFrom;
    static boolean isEmpty;
    static boolean isBook;

    static boolean cekDate(int date){
        return date < 2018 || date > 2022;
    }
    static boolean cekFrom(String from){
        isFrom =false;
        for(int i =0; i<3;i++){
            if(from.compareTo(place[i])==0){
                isFrom =true;
                break;
            }
        }
        return isFrom;
    }

    static boolean cekName(String name){
        isBook=false;
        for(int i=0; i<10;i++){
            if(name.compareTo(book[i])==0){
                isBook=true;
                break;
            }
        }
        return isBook;
    }

    static void list(String name){
        isEmpty = false;
        for(int i = 0; i<10; i++){
            if (books[i]==null){
                books[i]= name;
                isEmpty = true;
                break;
            }
        }
        if (!isEmpty){
            System.out.println("Sorry there's no more empty spaces lmao.");
        }
    }
    public static void main(String[] args) {
        String inName, inFrom, temp;
        int inDate;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to library");
        System.out.print("Name:\t");
        inName = input.nextLine();
        try {
            cekName(inName);
        }catch(NullPointerException ignored){}


        do {
            System.out.print("From:\t");
            inFrom = input.nextLine();
            if(!cekFrom(inFrom)){
                System.out.println("The only option that is available is \"Malang\", \"Surabaya\", and \"Bandung\".");
                System.out.println("Don't ask why, because we're racist.");
            }

        }while(!cekFrom(inFrom));


        System.out.print("Year:\t");
        inDate = input.nextInt();
        if(cekDate(inDate)){
            System.out.println("Sorry but we can't receive this year of a book because of pandemic and you're racist.");
            System.out.println("And we will exit by force because you're racist lol.");
        }else{
            System.out.println("Accepted :D");
            list(inName);
            for (int i =0; i<10; i++) {
                if (book[i] == null) {
                    temp = "This is " + inName + ", " + inFrom + ". " + inDate;
                    book[i] = temp;
                    System.out.println(book[i]);
                    break;
                }
            }
        }

    }
}


