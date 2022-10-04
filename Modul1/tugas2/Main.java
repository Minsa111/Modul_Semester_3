package Modul1.tugas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nim;
        boolean correct =false;
        String code = "10370311";
        while(!correct){
            try {
                System.out.print("Please input your full NIM :");
                nim = in.next();

                if (!nim.contains(code)) {
                    throw new Exception(" The number needs to contains \"10370311\"");
                } else if (nim.length() != 15) {
                    throw new Exception(" The number needs to be 15 digits!");
                }else {
                    correct = true;
                }

                System.out.println("Your nim is: " +nim);
            }catch(Exception e){
                System.out.println(e+"\n");
            }
        }
    }
}
