import java.util.Scanner;

public class InputProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();
        
        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggi = scanner.nextDouble();
        
        System.out.println("\nData yang dimasukkan:");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi Badan: " + tinggi + " cm");
        
        scanner.close();
    }
}