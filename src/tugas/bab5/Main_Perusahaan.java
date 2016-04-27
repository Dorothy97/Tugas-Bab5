package PrakPemlan;

import java.util.Scanner;

public class Main_Perusahaan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jlh;
        System.out.println("\t\tPT. JAKET APIK CV. LABKOMDAS\n");
        System.out.println("Tersedia 3 tipe jaket :");
        System.out.println("\t1.\tJaket A");
        System.out.println("\t2.\tJaket B");
        System.out.println("\t3.\tJaket C");
        System.out.print("Pilihlah nomor tipe jaket yang Anda inginkan : ");
        int pil = in.nextInt();
        switch (pil) {
            case 1:
                System.out.print("Jumlah jaket A yang ingin Anda beli\t: ");
                jlh = in.nextInt();
                LabKomDas.Jaket_A(jlh);
                break;
            case 2:
                System.out.print("Jumlah jaket B yang ingin Anda beli\t: ");
                jlh = in.nextInt();
                LabKomDas.Jaket_B(jlh);
                break;
            case 3:
                System.out.print("Jumlah jaket C yang ingin Anda beli\t: ");
                jlh = in.nextInt();
                LabKomDas.Jaket_C(jlh);
                break;
            default:
                System.out.println("!!! Pilihan tidak valid !!!");
        }
    }
}