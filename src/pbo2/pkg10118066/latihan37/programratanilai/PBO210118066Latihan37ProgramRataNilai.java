/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan37.programratanilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA    : Tegar Lucky'q Oakley
 * KELAS   : IF 2
 * NIM     : 10118066
 */
public class PBO210118066Latihan37ProgramRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa();
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        mahasiswa.mhs = scanner.nextInt();
        mahasiswa.ratarata();
        System.out.println(" ");
        mahasiswa.hasilrata();
        System.out.println("(Developed by : Tegar Lucky'q Oakley)");
    }
    
}
