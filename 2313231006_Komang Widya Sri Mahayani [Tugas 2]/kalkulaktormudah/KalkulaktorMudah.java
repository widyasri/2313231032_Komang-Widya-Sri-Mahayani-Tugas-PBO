/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kalkulaktormudah;

import java.util.Scanner;

/**
 *
 * @author Made Aditya
 */
public class KalkulaktorMudah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lanjut;
        
        do {
            System.out.println("\nKalkulaktor Mudah By Widya");
            System.out.println("---------------------");
            
            // Input angka pertama
            System.out.print("Tolong Masukkan Bilangan Pertama: ");
            double angka1 = scanner.nextDouble();
            
            // Input operator
            System.out.print("Tolong Masukkan Operasi Perhitungan (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);
            
            // Input angka kedua
            System.out.print("Tolong Masukkan Bilangan Kedua: ");
            double angka2 = scanner.nextDouble();
            
            double hasil = 0;
            boolean operatorValid = true;
            
            // Proses perhitungan
            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    break;
                case '/':
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                    } else {
                        System.out.println("Error: Pembagian Dengan 0!");
                        operatorValid = false;
                    }
                    break;
                case '%':
                    hasil = angka1 % angka2;
                    break;
                default:
                    System.out.println("Error: Operator Tidak Valid!");
                    operatorValid = false;
            }
            
            // Tampilkan hasil jika operator valid
            if (operatorValid) {
                System.out.println("Hasil Operasi Bilangan: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
            }
            
            // Tanya apakah ingin lanjut
            System.out.print("\nIngin Mencobanya Kembali? (y/n): ");
            lanjut = scanner.next();
            
        } while (lanjut.equalsIgnoreCase("y"));
        
        System.out.println("Thank You For Using This Calculator!");
        scanner.close();
    }
}