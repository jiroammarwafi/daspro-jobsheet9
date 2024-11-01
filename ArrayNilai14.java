import java.util.Scanner;
public class ArrayNilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //set limit nilai variabel menjadi 10
        int[] nilaiAkhir = new int[10];
        // loop untuk me
        for (int i = 0; i<10; i++){
            System.out.print("Masukkan nilai akhir ke-" +i+" : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i=0; i<10; i++){
            System.out.println("Nilai akhir ke-"+i+" adalah "+nilaiAkhir[i]);
        }
        sc.close();
    }
}