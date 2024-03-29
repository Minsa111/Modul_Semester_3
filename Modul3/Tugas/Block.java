package Modul3.Tugas;

public class Block {

    private int height;
    private int width;
    private int length;


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    protected void hasil() {
        Perhitungan ph = new Perhitungan();
        System.out.println("Hasil Luas Balok\t : " + ph.getLuas(this) + " cm");
        System.out.println("Hasil Volume Balok\t : " + ph.getVolume(this) + " cm^3");
    }

    static boolean isCube(long input) {

        return ( Math.round( Math.cbrt( input ) ) * Math.round(Math.cbrt(input))
                * Math.round(Math.cbrt(input))) == input;
    }
}
