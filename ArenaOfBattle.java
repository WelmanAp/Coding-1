package arenaofbattle;
import java.util.Scanner;
public class ArenaOfBattle {
    String nama;
    
    public static void Archer(String nama){
        
        System.out.println("******************************\n\tInformasi Hero\n******************************");
        System.out.print("Hero Anda Archer\n");
        System.out.print("Tipe Hero Anda Adalah Jarak Jauh!\n");
        System.out.print("Hero Jenis Ini Memiliki Kemampuan Panah\n");

    }
    
    public static void Tanker(String nama){
        
        System.out.println("******************************\n\tInformasi Hero\n******************************");
        System.out.print("Hero Anda Tanker\n");
        System.out.print("Tipe Hero Anda Adalah Jarak Dekat!\n");
        System.out.print("Hero Jenis Ini Memiliki Kemampuan Pukulan\n");
        
    }
   
    public static void main(String[] args) {
        boolean pass = false;
        while(pass == false){
        
            System.out.println("==Ujian Tengah Semester==\nAlgoritma Pemrograman\n\nArena Of Buddhi");
            System.out.print("Masukkan Nama Anda : ");
            
            Scanner in = new Scanner(System.in);
            
            String nama = in.nextLine();
            
            boolean check1 = false;
            
            while(check1 == false){
            
                    System.out.println("\nSelamat datang di aplikasi AOB, " +nama);
            
                    System.out.print("Pilih Tipe Hero : \n1. Archer\n2. Tanker\n");
            
                    System.out.print("Masukkan Pilihan Tipe (1/2) : ");
            
                    char pilihan = in.next().charAt(0);
                    
                    if(pilihan == '1'){
                        Archer(nama);
                        check1 = true;
                    }
                    else if(pilihan == '2'){
                        Tanker(nama);
                        check1 = true;
                    }
                    else System.out.println("\nMasukan Pilihan Tidak Terdaftar\nSilahkan Coba lagi\n");
                    
            }
        
        boolean gate = false;
        
            while(gate == false){
                System.out.print("===Informasi Layanan===\nTerima Kasih "+nama.toUpperCase() +" Telah Menggunakan Layanan Kami.\n");
                
                System.out.println("\nApakah Anda Masih ingin bermain? (Y/N)\n");
        
                char prompt = in.next().charAt(0);
        
                switch (prompt) {
                    case 'N':
                    case 'n':
                        gate = true;
                        pass = true;
                        break;
                    case 'Y':
                    case 'y':
                        gate = true;
                        break;
                    default:
                        System.out.println("Input Tidak Terdaftar. Silahkan Coba Lagi");
                        break;
                }
        
            }
            
        }
    }
    
}

