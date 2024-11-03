import java.util.Scanner;

public class KelolaNilai {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs; // deklarasi array
        int input, rataNilai, totalNilai=0, nilaiTertinggi=0, nilaiTerendah=0;

        System.out.print("Berapa banyak nilai yang akan di input ? : ");
        input = sc.nextInt();
        nilaiMhs = new int [input]; // inisialisasi array

        // Loop meminta nilai sebanyak input awal
        for (int i=0; i<nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            nilaiMhs[i] = sc.nextInt();
            totalNilai += nilaiMhs[i];
        }
        rataNilai = totalNilai/input;
        System.out.println("Nilai rata-rata dari ke-" +input+ " mahasiswa tersebut adalah : "+ rataNilai);
        
        // Looping mencari nilai ter - rendah/tinggi dengan perbandingan dua nilai pada array
        for (int i=0; i<nilaiMhs.length; i++) {
        if (nilaiMhs[0] < nilaiMhs[i]) {
            nilaiTertinggi = nilaiMhs[i];
        } else {
            nilaiTerendah = nilaiMhs[i];
        }
        }
        System.out.println("Nilai tertinggi saat ini: "+nilaiTertinggi);
        System.out.println("Nilai terendah saat ini: "+nilaiTerendah);
        System.out.println("------------------------------------------");
        System.out.println("Berikut semua nilai yang telah dimasukkan: ");
        for (int i=0;i<nilaiMhs.length;i++){
            System.out.println("Nilai mahasiswa ke-"+(i+1)+" adalah " + nilaiMhs[i]); 
        } 
        sc.close();
    }
}