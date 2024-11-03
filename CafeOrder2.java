import java.util.Scanner;
public class CafeOrder2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        String search;
        boolean status = false;

        System.out.print("Mau pesan menu apa hari ini ? ");
        search = sc.nextLine().toLowerCase();
        for (int i=0; i<menu.length; i++){
            menu[i].toLowerCase();
            if (search.equals(menu[i].toLowerCase())) { 
                status = true;
                break;
            }
            }
        if (status){
            System.out.println("Menu ini tersedia !");
        }
        else {
            System.out.println("Mohon maaf, menu ini tidak tersedia :(");
        }
        sc.close();
    }
}