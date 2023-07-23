package PBO;
import java.util.Scanner;
public class wisataAlam {
  public static void main(String[] args) {
    try{
        //IO sederhana
        Scanner masuk = new Scanner(System.in);
        int pilihan;
        System.out.println("WISATA KALIMANTAN SELATAN");
        //object
        wisatakalsel wsta = new wisatakalsel("Tanah Laut");
        System.out.println(wsta.hasil());
        System.out.println("----Pilihan Wisata----");
        System.out.println("1. Pantai\n2. Gunung");
        System.out.print("Pilihan: ");
        pilihan = masuk.nextInt();
        //seleksi if
        if(pilihan == 1) {
            System.out.println("1. Pantai Takisung\n2. Pantai Batakan");
        } else if(pilihan == 2) {
            System.out.println("1. Gunung Pria\n2. Gunung Teletubis");

        } 
        System.out.println("==================================");
        //error handling
    } catch (Exception e) {
        System.out.println("Ada kesalahan yang muncul");
    } finally {
        System.out.println("Terima kasih telah menjalankan program");
    }
        
  }
}
            
