package tokokelontong;
import java.util.Scanner;
public class TokoKelontong {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
    System.out.print("TOKO KELONTONG KERONCONGAN"+
    "\n\n"+"A. Susu Dancow"+
    "\n\t"+"1. Ukuran Kecil"+
    "\n\t"+"2. Ukuran Sedang"+
    "\n\t"+"3. Ukuran Besar"+
    
    "\n"+"B. Susu Bendera"+
    "\n\t"+"1. Ukuran Kecil"+
    "\n\t"+"2. Ukuran Sedang"+
    "\n\t"+"3. Ukuran Besar"+
    
    "\n"+"C. Susu SGM"+
    "\n\t"+"1. Ukuran Kecil"+
    "\n\t"+"2. Ukuran Sedang"+
    "\n\t"+"3. Ukuran Besar"
    +"\n");
    
    System.out.print("Masukkan jenis susu: ");
    String brand = Input.nextLine();
    System.out.print("Masukkan ukuran kaleng: ");
    String size = Input.nextLine();
    
    String satuan = brand+size;
    int harga = 0;
    switch (satuan) {
    case "A1":
        harga = 25000;
        break;
    case "A2":
        harga = 20000;
        break;
    case "A3":
        harga = 15000;
    case "B1":
        harga = 20000;
        break;
    case "B2":
        harga = 17500;
        break;
    case "B3":
        harga = 13500;
        break;
    case "C1":
        harga = 22000;
        break;
    case "C2":
        harga = 18500;
        break;
    case "C3":
        harga = 15000;
        break;
    }
    System.out.println("Harga satuan barang Rp. "+harga);
    System.out.print("Jumlah yang dibeli: ");
    int jumlah = Input.nextInt();
    int total = jumlah*harga;
    System.out.print("Harga yang harus dibayar sebesar Rp. "+total);
Input.close();
    }
    
}
