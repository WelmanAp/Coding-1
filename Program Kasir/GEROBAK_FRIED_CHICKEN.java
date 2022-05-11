package gerobak_fried_chicken;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GEROBAK_FRIED_CHICKEN {

    public static void main (String []nocha) throws FileNotFoundException{
    String[] kode = new String[10];
    String[] jenis = new String[10];
    int i,j;
    double jumlah=0 ,pjk=0, total=0;
    int[] potong = new int[10];
    int[] harga = new int[10];
    int[] jml = new int[10];
    Scanner input = new Scanner(System.in);

    System.out.println("GEROBAK FRIED CHICKEN");
    System.out.println("---------------------");
    System.out.println("Kode Jenis Harga ");
    System.out.println("---------------------");
    System.out.println("D Dada Rp.2500");
    System.out.println("P Paha Rp.2000");
    System.out.println("S Sayap Rp.1500");
    System.out.println("---------------------");
    System.out.print("Banyak Jenis : ");
    j=input.nextInt();
    for(i=0; i<j; i++)
    {
    System.out.println("\nJenis Ke - " + (i+1));
    System.out.print("Jenis Potong [D/P/S] : ");
    kode[i]= input.next();
    if (null == kode[i])
    {
        jenis[i]="Sayap";
        harga[i]=1500;
    }
    else switch (kode[i]) {
            case "D":
            case "d":
                jenis[i]="Dada";
                harga[i]=2500;
                break;
            case "P":
            case "p":
                jenis[i]="Paha";
                harga[i]=2000;
                break;
            default:
                jenis[i]="Sayap";
                harga[i]=1500;
                break;
        }
    System.out.print("Banyak Potong : ");
    potong[i] = input.nextInt();
    jml[i]=harga[i]*potong[i];
    }
        try (PrintWriter printWriter = new PrintWriter ("DaftarTransaksi.txt")) {
            printWriter.println("\n\tGEROBAK FRIED CHICKEN ");
            printWriter.println("---------------------------------------------");
            printWriter.println("No.\tJenis\tHarga\tBanyak\tJumlah");
            printWriter.println("\tPotong\tSatuan\tBeli\tHarga ");
            printWriter.println("---------------------------------------------");
            for(i=0;i<j;i++)
            {
                printWriter.println(+(i+1)+ "\t" +jenis[i]+ "\t" +harga[i]+ "\t" +potong[i]+ "\t" +jml[i]);
                jumlah=jumlah+jml[i];
            }
            printWriter.println("---------------------------------------------");
            pjk=jumlah*0.1;
            total=jumlah+pjk;
            printWriter.println("\tJumlah Bayar\t\t" +jumlah);
            printWriter.println("\tPajak 10%\t\t" +pjk);
            printWriter.println("\tTotal Bayar\t\t"+total);
        } 
     }
}
