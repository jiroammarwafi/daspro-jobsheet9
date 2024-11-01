import java.util.Scanner;
public class ArrayNilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //set limit nilai variabel menjadi 10
        int[] nilaiAkhir = new int[10];
        // loop untuk meminta input pengguna sebanyak 10 kali, length = panjang, alternatif untuk menyesuaikan dengan limit array pada variabel nilai akhir
        for (int i = 0; i < nilaiAkhir.length; i++){
            System.out.print("Masukkan nilai akhir ke-" +i+" : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        // seleksi kelulusan
        for (int i=0; i<nilaiAkhir.length; i++){
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-"+i+" lulus!");
            } else {
                System.out.println("Mahasiswa ke-"+i+" tidak lulus!");
            }
        }
        sc.close();
    }
}