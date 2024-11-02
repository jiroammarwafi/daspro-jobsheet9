public class SearchNilai14 {
    public static void main (String[] args) {
        int[] arrNilai = {80,85,78,96,90,82,86};
        int key = 90;
        int hasil = 0;

        // looping untuk mencari kecocokan key dengan nilai pada array
        for (int i=0; i<arrNilai.length; i++) {
            if (key == arrNilai[i]){
                hasil = i; // indeks yang memiliki nilai tersebut
                break;
            }
        }
        System.out.println ();
        System.out.println ("Nilai " +key+" ketemu di indeks ke-"+hasil);
        System.out.println ();
        }
}