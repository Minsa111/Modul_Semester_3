package Modul3.Tugas;

public class Perhitungan {
    Block sisi = new Block();

    int getLuas(Block sisi) {
        return sisi.getLength() * sisi.getWidth() * sisi.getHeight();
    }

    int getVolume(Block sisi) {
        return 4 * sisi.getLength() * sisi.getWidth() * sisi.getHeight();
    }
}
