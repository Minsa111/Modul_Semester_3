package Modul3.Tugas;


import java.util.Scanner;

public class main {
    static int length, height, width;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Block block = new Block();
        Perhitungan hitung = new Perhitungan();

        System.out.println("=== Menghitung Luas dan Volume Balok ===\n");

        System.out.print("Masukkan Panjang \t: ");
        length = input.nextInt();
        block.setLength(length);

        System.out.print("Masukkan Lebar \t\t: ");
        width = input.nextInt();
        block.setWidth(width);

        System.out.print("Masukkan Tinggi \t: ");
        height = input.nextInt();
        block.setHeight(height);

        System.out.println("\n=== Hasil Perhitungan ===\n");
        block.hasil();

        System.out.println("\n=== Cube Tugas 3 ===");
        System.out.println("\nBalok is " + block.isCube(hitung.getLuas(block)) + "\n");

        input.close();
    }
}
