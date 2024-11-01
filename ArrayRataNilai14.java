import java.util.Scanner;
public class ArrayRataNilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs; // deklarasi array
        double[] total = new double [2];
        double[] rata2 = new double [2];
        int jmlLulus=0, jmlTdkLulus=0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = sc.nextInt(); // meminta input
        nilaiMhs = new int [jmlMhs]; // inisialisasi array dengan kapasitas menyesuaikan var. jmlMhs

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i=0; i<nilaiMhs.length; i++){
            if (nilaiMhs[i] > 70) { // menggunakan indeks 0 untuk menyimpan nilai mahasiswa yang lulus
                jmlLulus++; // menambah dan menyimpan jumlah mahasiswa yang lulus
                total[0] += nilaiMhs[i];
                rata2[0] = total [0]/jmlLulus;
            }
            else { // menggunakan indeks 1 untuk menyimpan nilai mahasiswa yang tidak lulus
                jmlTdkLulus++;
                total[1] += nilaiMhs[i];
                rata2[1] = total [1]/jmlTdkLulus;
            }
        }
        System.out.println("Rata-rata nilai lulus = " + rata2 [0]);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2 [1]);
    sc.close();
    }
}