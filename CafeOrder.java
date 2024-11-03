import java.util.Scanner;
public class CafeOrder{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int jmlPesanan;
        String[] namaPesanan;
        double[] hargaPesanan;
        double totalBiaya=0.0;
        
        System.out.print("Jumlah Pesanan : ");
        jmlPesanan = sc.nextInt();
        namaPesanan = new String [jmlPesanan];
        hargaPesanan = new double [jmlPesanan];

        for (int i=0; i<jmlPesanan; i++) {
            System.out.print("Nama Makanan/Minuman : ");
            sc.nextLine();
            namaPesanan[i] = sc.nextLine();
            System.out.print("Harga Pesanan : ");
            hargaPesanan[i] = sc.nextDouble();
            totalBiaya += hargaPesanan[i];
        }
        System.out.println("\n------------------------------------");
        System.out.println("-----------DAFTAR PESANAN-----------");
        System.out.println("------------------------------------");
        for (int i=0; i<jmlPesanan; i++){
        System.out.println(namaPesanan[i]+" -- "+hargaPesanan[i]);
        }
        System.out.println("------------------------------------");
        System.out.println("TOTAL : " + totalBiaya);
        System.out.println("------------------------------------");
        sc.close();
    }
}