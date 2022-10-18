package Modul2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nim;
        String NIM = null;
        String in_email;
        String Email = null;
        String in_phoneNum = null;
        String PhoneNum;
        String ans;
        boolean nim_correct =false;
        boolean email_correct = false;
        boolean phoneNum_correct = false;
        boolean smartfren = false;
        boolean axis = false;
        boolean three = false;
        boolean indosat = false;
        boolean xl = false;

        String code = "10370311";
        String emailAddress = "@webmail.umm.ac.id";
        String regex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

        //The program
        //NIM input
        while(!nim_correct){
            try {
                System.out.print("Please input your full NIM :");
                nim = in.next();

                if (!nim.contains(code)) {
                    throw new Exception(" The number needs to contains \"10370311\"");
                } else if (nim.length() != 15) {
                    throw new Exception(" The number needs to be 15 digits!");
                } else {
                    nim_correct = true;
                    NIM = nim;
                }

                System.out.println("Your nim is: " +nim);
            }catch(Exception e){
                System.out.println(e+"\n");
            }
        }

        //email input
        while(!email_correct){
            try{
                System.out.print("Plase create a new e-mail using \"webmail.umm.ac.id\": ");
                in_email = in.next();
                Pattern pat = Pattern.compile(regex);
                if(!in_email.contains(emailAddress)){
                    throw new Exception("The email need to contain \"webmail.umm.ac.id\".");
                }else if (!pat.matcher(in_email).matches()){
                    throw new Exception("Please input an appropriate format of an email!!!");
                } else{
                    email_correct=true;
                    System.out.println("Email succesfully created!!!");
                    Email = in_email;
                }
            }catch (Exception e){
                System.out.println(e+"\n");
            }
        }
        while(!phoneNum_correct) {
            try {
                System.out.print("Please input your phone number (Indonesian number only): +62");
                in_phoneNum = in.next();
                if(!in_phoneNum.matches("[0-9]+")){
                    throw new Exception("The phone number needs to be a number.");
                }else if(in_phoneNum.startsWith("817")||in_phoneNum.startsWith("818")||in_phoneNum.startsWith("819")||in_phoneNum.startsWith("859")||in_phoneNum.startsWith("877")||in_phoneNum.startsWith("878")){
                    xl = true;
                    phoneNum_correct = true;
                }else if(in_phoneNum.startsWith("838")||in_phoneNum.startsWith("831")||in_phoneNum.startsWith("832")||in_phoneNum.startsWith("833")){
                    axis = true;
                    phoneNum_correct = true;
                }else if(in_phoneNum.startsWith("895")||in_phoneNum.startsWith("896")||in_phoneNum.startsWith("897")||in_phoneNum.startsWith("898")||in_phoneNum.startsWith("899")){
                    three=true;
                    phoneNum_correct = true;
                }else if(in_phoneNum.startsWith("881")||in_phoneNum.startsWith("882")||in_phoneNum.startsWith("883")||in_phoneNum.startsWith("884")||in_phoneNum.startsWith("885")||in_phoneNum.startsWith("886")||in_phoneNum.startsWith("887")||in_phoneNum.startsWith("888")||in_phoneNum.startsWith("889")){
                    smartfren = true;
                    phoneNum_correct = true;
                }else if(in_phoneNum.startsWith("814")||in_phoneNum.startsWith("815")||in_phoneNum.startsWith("816")||in_phoneNum.startsWith("855")||in_phoneNum.startsWith("856")||in_phoneNum.startsWith("857")||in_phoneNum.startsWith("858")){
                    indosat = true;
                    phoneNum_correct = true;
                }else{
                    System.out.println("Are you sure your number is right?");
                    System.out.print("62"+in_phoneNum+"?(y/n)");
                    ans = in.next();
                    if (ans.compareTo("y")==0){
                        phoneNum_correct = true;
                    }
                }

            }catch(Exception e){
                System.out.println(e+"\n");
            }finally {
                PhoneNum = "62"+in_phoneNum;
            }
            System.out.println("Your data: \n\nNIM\t\t\t\t:\t"+NIM);
            System.out.println("Email\t\t\t:\t"+Email);
            System.out.println("Phone Number\t:\t"+PhoneNum);
            if(smartfren){
                System.out.println("Number type\t:\tSmartfren");
            }else if (xl){
                System.out.println("Number type\t\t:\tXL");
            }else if (axis){
                System.out.println("Number type\t\t:\tAxis");
            }else if(three){
                System.out.println("Number type\t\t:\tThree");
            }else if (indosat){
                System.out.println("Number type\t\t:\tIndosat");
            }else{
                System.out.println("Number type\t\t:\tUnknown");
            }
        }
    }
}
