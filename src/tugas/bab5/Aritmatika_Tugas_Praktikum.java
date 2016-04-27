package PrakPemlan;

public class Aritmatika_Tugas_Praktikum {

    public static void hitungPenjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("Hasil penjumlahan = " + nilai);
    }

    public static void hitungPengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("Hasil pengurangan = " + nilai);
    }

    public void hitungPerkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("Hasil perkalian  = " + nilai);
    }
    
    public void hitungPembagian(int a, int b) {
        int nilai = a / b;
        System.out.println("Hasil pembagian   = " + nilai);
    }
    
    public void Sederhana(int a, int b) {
        int x, y, temp;
        if (b == 0) {
            System.out.println("Tidak terdefinisikan");
        }
        x = (a < b) ? b : a;
        y = (a < b) ? a : b;
        while (y != 0) {
            temp = x % y;
            x = y;
            y = temp;
        }
        a /= x;
        b /= x;
        System.out.println("Hasil penyederhanaan = " + a + "/" + b);
    }
}