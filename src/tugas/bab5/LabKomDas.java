package PrakPemlan;

public class LabKomDas {
    // membuat konstanta final untuk harga tetap dari jaket A, B, dan C
    private final static int jaket_A = 100000;
    private final static int jaket_B = 125000;
    private final static int jaket_C = 175000;
    
        public static void Jaket_A(int a){
        if(a <= 100){
            int harga = a * jaket_A;
            System.out.println("Total harga\t\t\t\t: Rp. " + harga);
        }
        else{
            int harga = a * 95000;
            System.out.println("Total harga\t\t\t\t: Rp. " + harga);
        }
    }
        
    public static void Jaket_B(int b){
        if(b <= 100){
            int harga = b * jaket_B;
            System.out.println("Total harga\t\t\t\t: Rp. " + harga);
        }
        else{
            int harga = b * 120000;
            System.out.println("Total harga\t\t\t\t: Rp. " + harga);
        }
    }
    
    public static void Jaket_C(int c){
        if(c <= 100){
            int harga = c * jaket_C;
            System.out.println("Total harga\t\t\t\t: Rp. " + harga);
        }
        else{
            int harga = c * 160000;
            System.out.println("Total harga\t\t\t\t: Rp. " + harga);
        }
    }
}