package builderpattern;

import java.util.Scanner;


public class BuilderPattern {

    
    public static void main(String[] args) {
        IkanBuilder ikanBuilder = new IkanBuilder();
        Ikan PaketTawar = ikanBuilder.preparePaketTawar();
        Ikan PaketLaut = ikanBuilder.preparePaketLaut();
        Ikan PaketMix = ikanBuilder.preparePaketMix();
        Scanner myObj = new Scanner(System.in);
        
       while(true){
           System.out.println("\nSelamat Datang Di Toko Panca Aquarium");
           System.out.println("Daftar Paket Ikan");
           System.out.println("1. Paket Tawar = Oscar dan Cupang ");
           System.out.println("2. Paket Laut = Nemo dan Pari ");
           System.out.println("3. Paket Mix = Arwana dan Hiu ");
           System.out.println("4. Keluar");
           System.out.print("Masukkan Angka = ");
           int angka = myObj.nextInt();
        switch (angka) {
            case 1:
                System.out.println("\nPaket Tawar");
                PaketTawar.showItems();
                System.out.println("Total Cost : " + PaketTawar.getCost());
                break;
            case 2:
                System.out.println("\nPaket Laut");
                PaketLaut.showItems();
                System.out.println("Total Cost : " + PaketLaut.getCost());
                break;
            case 3:
                System.out.println("\nPaket Mix");
                PaketMix.showItems();
                System.out.println("Total Cost : " + PaketMix.getCost());
                break;
            case 4: 
                System.out.println("Exiting Program...");
                System.exit(0);
                break;
            default:
                System.out.println("\nAngka Yang Anda Masukkan Tidak Ada DiToko");
        } 
        }
    }
}

