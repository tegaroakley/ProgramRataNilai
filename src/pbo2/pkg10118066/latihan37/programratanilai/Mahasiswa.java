/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan37.programratanilai;

import java.util.Scanner;

/**
 *
 * @author DRAGON
 */
public class Mahasiswa {
    Scanner scanner = new Scanner(System.in);
    public int mhs;
    public double nilai;
    public double rata;
    
    public void ratarata(){
         nilai = 0;
         for (int i = 1 ; i <= mhs; i++){
         System.out.print("Nilai Mahasiswa ke-"+ i +" : ");
         nilai = nilai + scanner.nextDouble();
        }
    }
    public void hasilrata(){
        rata = nilai / mhs ;
            System.out.println("Maka, Rata-rata Nilainya Adalah : "+ rata);   
    }
}
