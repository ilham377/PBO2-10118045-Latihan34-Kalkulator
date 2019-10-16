/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan34kalkulator;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 *
 * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : program kalkulator
 */
public class PBO10118045Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        
        DecimalFormat df = new DecimalFormat("#,##0.##", symbols);
        Kalkulator Kalkulator = new Kalkulator();
        
        
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        Scanner scanner = new Scanner (System.in);
        Kalkulator.setValue1(scanner.nextDouble());
        System.out.print("Masukkan Angka ke-2 : ");
        Scanner scanner1 = new Scanner (System.in);
        Kalkulator.setValue2(scanner.nextDouble());
        System.out.println("");
        System.out.println("hasil Pertambahan : " +Kalkulator.tambahBilangan());
        System.out.println("Hasil Perkurangan : " +Kalkulator.kurangBilangan());
        System.out.println("Hasil Perkalian : " +Kalkulator.kaliBilangan());
        System.out.println("Hasil Pembagian : " +df.format(Kalkulator.bagiBilangan()));
        System.out.println("Hasil Sisa : " +Kalkulator.sisaBilangan());
    }
    
}
