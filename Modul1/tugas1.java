package Modul1;

public class tugas1 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[5] = 25;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error on the thingy");
        }finally {
            System.out.println("Array index out of bound exception checked");
        }

        //after
        System.out.println("And now I could be runned and not stopped beacuse of that arrayindexoutofbound exception :D");
    }
}
