package oke_jek;
import java.util.Scanner;

public class Oke_Jek {
    String nama;
    
    public static void OKEGO(String nama){
        System.out.println("******************************\n\tLayanan OKE - GO\n******************************");
        System.out.print("Masukkan Berat Kiriman (0 - 50 KG) : ");
        
        Scanner in1 = new Scanner(System.in);
        
        float kg = in1.nextInt();
        
        System.out.print("Menggunakan Asuransi (Y / N) : ");
        
        char asuransi = in1.next().charAt(0);
        
        System.out.print("Dapat Voucher (Y / N) : ");
        
        char voucher = in1.next().charAt(0);
        
        total(kg, 0, asuransi, voucher, nama);
        
    }
    
    public static void OKEFOOD(String nama){
        System.out.println("******************************\n\tLayanan OKE - FOOD\n******************************");
        System.out.print("Masukkan Berat Satuan Makanan (0 - 20 KG) : ");
        
        Scanner in1 = new Scanner(System.in);
        
        float kg = in1.nextInt();
        
        System.out.print("Jumlah Porsi Makanan : ");
        
        int satuan = in1.nextInt();
        
        System.out.print("Dapat Voucher (Y / N) : ");
        
        char voucher = in1.next().charAt(0);
        
        total(kg, satuan, '-', voucher, nama);
        
    }
    
    public static void total(float kg, int satuan, char asuransi, char voucher,String nama){
        float ongkos = 0;
        
        if(satuan > 3){
            ongkos += satuan * kg * 13000;
        }
        
        else ongkos += kg * 10000;
        
        if(satuan > 0 && satuan <= 3){
            ongkos *= satuan;
        }
        
        if(asuransi == 'Y' || asuransi == 'y'){
            ongkos += 15000;
        }
        
        
        System.out.print("===Informasi Layanan===\nTerima Kasih "+nama.toUpperCase() +" Telah Menggunakan Layanan Kami.\n");
        System.out.printf("Berat Kiriman Anda %.1f Kilogram\n", kg);
        System.out.printf("Total Ongkos Anda Rp. %.2f\n", ongkos);
        
        float diskon = 0;
        
        if(voucher == 'Y' || voucher == 'y'){
            diskon += 7000;
        }

        System.out.printf("Ongkos Yang Perlu Dibayar Rp. %.2f\n", ongkos - diskon);
        System.out.printf("Anda Mendapat Diskon Sebesar %.2f%%\n", ((ongkos - (ongkos - diskon))/ongkos) * 100);
        System.out.printf("Anda Mendapat Potongan Harga Sebesar Rp. %.2f\n\n", diskon);
        
    }
    
    public static void main(String[] args) {
        boolean pass = false;
        while(pass == false){
        
            System.out.println("==Kisi - kisi UTS==\nAlgoritma Pemrograman\n\nAplikasi OKE - JEX (Online Expedition)\nHanya Melayani Wilayah Tangerang");
            System.out.print("Masukkan Nama Anda : ");
            
            Scanner in = new Scanner(System.in);
            
            String nama = in.nextLine();
            
            boolean check1 = false;
            
            while(check1 == false){
            
                    System.out.println("\nSelamat datang di aplikasi OKE - JEX, " +nama);
            
                    System.out.print("Tipe Layanan OKE - JEX : \n1. OKE - GO\n2. OKE - FOOD\n");
            
                    System.out.print("Masukkan Pilihan Layanan (1/2) : ");
            
                    char pilihan = in.next().charAt(0);
                    
                    if(pilihan == '1'){
                        OKEGO(nama);
                        check1 = true;
                    }
                    else if(pilihan == '2'){
                        OKEFOOD(nama);
                        check1 = true;
                    }
                    else System.out.println("\nMasukan Pilihan Tidak Terdaftar\nSilahkan Coba lagi\n");
                    
            }
        
        boolean gate = false;
        
            while(gate == false){
                
                System.out.println("\nApakah Anda Masih Akan Melakukan Transaksi Lain? (Y/N)\n");
        
                char prompt = in.next().charAt(0);
        
                if(prompt == 'N' || prompt == 'n'){
                    gate = true;
                    pass = true;
                }
                else if(prompt == 'Y' || prompt == 'y'){
                    gate = true;
                }
                else System.out.println("Input Tidak Terdaftar. Silahkan Coba Lagi");
        
            }
            
        }
    }
    
}
