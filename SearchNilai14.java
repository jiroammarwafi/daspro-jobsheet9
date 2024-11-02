import java.util.Scanner;
public class SearchNilai14 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] arrNilai; // deklarasi array
        int hasil = 0;
        int key = 0;

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int input = sc.nextInt();
        // inisialisasi array dengan menyimpan input pengguna sebagai panjang array
        arrNilai = new int [input];

        // looping untuk mencari kecocokan key dengan nilai pada array
        for (int i=0; i<arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            arrNilai[i] = sc.nextInt();
        }
            System.out.print("Masukkan nilai yang ingin dicari: ");
            key = sc.nextInt(); // key search
        for (int i = 0; i<arrNilai.length; i++){
            if (key == arrNilai[i]){ // cari kecocokan nilai
                hasil = i; // indeks yang memiliki nilai tersebut
                System.out.println ();
                System.out.println ("Nilai " + key+" ketemu, merupakan nilai mahasiswa ke-"+(hasil+1));
                System.out.println ();
                break;
            } if ((i+1) == input){ 
                // kondisi jika perulangan telah dilakukan sebanyak input pengguna (banyak nilai) 
                // dan nilai yang dicari tidak ditemukan..
                System.out.println("\nNilai yang dicari tidak ditemukan");
            }
        }
        sc.close();
    }
}