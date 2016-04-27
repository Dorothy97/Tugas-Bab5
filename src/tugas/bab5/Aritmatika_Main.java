package PrakPemlan;

import java.util.Scanner;

public class Aritmatika_Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // method static
        System.out.println("\tP_E_N_J_U_M_L_A_H_A_N");
        System.out.print("Masukkan angka-1  : ");
        int a = in.nextInt();
        System.out.print("Masukkan angka-2  : ");
        int b = in.nextInt();
        Aritmatika_Tugas_Praktikum.hitungPenjumlahan(a, b);
        System.out.println();
        System.out.println("\tP_E_N_G_U_R_A_N_G_A_N");
        System.out.print("Masukkan angka-1  : ");
        int c = in.nextInt();
        System.out.print("Masukkan angka-2  : ");
        int d = in.nextInt();
        Aritmatika_Tugas_Praktikum.hitungPengurangan(c, d);
        // method non static
        System.out.println();
        Aritmatika_Tugas_Praktikum non = new Aritmatika_Tugas_Praktikum();
        System.out.println("\tP_E_R_K_A_L_I_A_N");
        System.out.print("Masukkan angka-1 : ");
        int e = in.nextInt();
        System.out.print("Masukkan angka-2 : ");
        int f = in.nextInt();
        non.hitungPerkalian(e, f);
        System.out.println();
        System.out.println("\tP_E_M_B_A_G_I_A_N");
        System.out.print("Masukkan angka-1  : ");
        int g = in.nextInt();
        System.out.print("Masukkan angka-2  : ");
        int h = in.nextInt();
        non.hitungPembagian(g, h);
        System.out.println();
        System.out.println("\tBentuk Sederhana dari Pecahan");
        System.out.print("Masukkan pembilang   : ");
        int p1 = in.nextInt();
        System.out.print("Masukkan penyebut    : ");
        int p2 = in.nextInt();
        non.Sederhana(p1, p2);
    }
}