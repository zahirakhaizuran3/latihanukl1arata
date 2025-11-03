/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latukl;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Latukl1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      
        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

       
        double volume = panjang * lebar * tinggi;

       
        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        
        double total = berat * biayaPerKg;

        
        if (volume > 100) {
            total += 50000;
        }

        
        System.out.println("=== RINCIAN BIAYA PENGIRIMAN ===");
        System.out.println("Volume paket: " + volume + " cm^3");
        System.out.println("Biaya per kg: Rp " + biayaPerKg);
        if (volume > 100) {
            System.out.println("Tambahan biaya volume: Rp 50000");
        }
        System.out.println("Total biaya pengiriman: Rp " + total);
        
//      Ganjil Genap

   System.out.print("Masukkan sebuah bilangan: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan genap.");
        } else {
            System.out.println(angka + " adalah bilangan ganjil.");
        } 
}}

    

