/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemlogin;

import java.util.Scanner;

/**
 *
 * @author Widya Sri
 */
public class SistemLogin {
    public static void main(String[] args) {
        final String USERNAME_BENAR = "WidyaSri";
        final String PASSWORD_BENAR = "NakKodya123";
        int percobaan = 0;
        final int MAKSIMAL_PERCCOBAAN = 3;
        boolean loginBerhasil = false;
        
        Scanner scanner = new Scanner(System.in);
        
        while (percobaan < MAKSIMAL_PERCCOBAAN && !loginBerhasil) {
            System.out.print("Tolong Masukkan Nama Pengguna (Username): ");
            String username = scanner.nextLine();
            
            System.out.print("Tolong Masukkan Kata Sandi (Password): ");
            String password = scanner.nextLine();
            
            if (username.equals(USERNAME_BENAR) && password.equals(PASSWORD_BENAR)) {
                loginBerhasil = true;
                System.out.println("Selamat Datang di Website Kami, " + username + "!");
            } else {
                percobaan++;
                System.out.println("Username atau password salah. Percobaan " + percobaan + " dari " + MAKSIMAL_PERCCOBAAN);
                
                if (percobaan == MAKSIMAL_PERCCOBAAN) {
                    System.out.println("Mohon Maaf, Akun Anda Diblokir!!!");
                }
            }
        }
        
        scanner.close();
    }
}
