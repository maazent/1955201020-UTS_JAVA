/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSJAVA;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PEMBAGIANKERJASC {
    public static void main(String[] args) {
          // deklarasi variabel
        String nama, alamat;
        int usia, gaji;
        
        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        // Tampilkan output ke user
        System.out.println("### Pendataan Karyawan PT. Petani Kode ###");
        System.out.print("Nama karyawan: ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.next();
        // Tampilkan outpu lagi
        System.out.print("Alamat: ");
        // menggunakan scanner lagi
        alamat = keyboard.next();
        
        System.out.print("Usia: ");
        usia = keyboard.nextInt();
        
        System.out.print("Gaji: ");
        gaji = keyboard.nextInt();
        
        
        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Gaji: Rp " + gaji);
    }
}
