import java.util.Scanner;

public class Tugas1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        
        if (n < 1) {
            System.out.println("Nilai n minimal harus 1.");
        } else {
            int totalAngkaDicetak = 0;
            
            
            for (int i = 1; i <= n; i++) {
                
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                    totalAngkaDicetak++;
                }
                
                System.out.println();
            }
            
            System.out.println("Total angka tercetak: " + totalAngkaDicetak);
        }
        
        sc.close();
    }
}