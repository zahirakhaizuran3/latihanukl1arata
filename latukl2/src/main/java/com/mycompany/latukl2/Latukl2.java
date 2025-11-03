/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Latukl2;

import java.util.Scanner;

public class Latukl2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MATEMATIKA RPL ===");
        System.out.println("1. Hitung Faktorial Bilangan");
        System.out.println("2. Hitung Volume Tabung");
        System.out.print("Pilih menu (1/2): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                hitungFaktorial(input);
                break;
            case 2:
                hitungVolumeTabung(input);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    // FUNGSI 1: HITUNG FAKTORIAL
    static void hitungFaktorial(Scanner input) {
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Bilangan harus positif!");
            return;
        }

        long faktorial = 1;
        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }

        System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
    }

    // FUNGSI 2: HITUNG VOLUME TABUNG
    static void hitungVolumeTabung(Scanner input) {
        System.out.print("Masukkan jari-jari tabung (cm): ");
        double r = input.nextDouble();
        System.out.print("Masukkan tinggi tabung (cm): ");
        double t = input.nextDouble();

        double volume = volumeTabung(r, t);
        System.out.println("Volume tabung adalah: " + volume + " cm³");
    }

    // Fungsi dengan parameter
    static double volumeTabung(double jariJari, double tinggi) {
        return Math.PI * jariJari * jariJari * tinggi;
    }
}
