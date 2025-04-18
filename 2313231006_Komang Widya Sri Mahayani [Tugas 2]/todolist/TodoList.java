/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.todolist;

/**
 *
 * @author Made Aditya
 */
import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            System.out.println("\n=== MENU TO-DO LIST ===");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Lihat Daftar Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline
            
            switch (choice) {
                case 1:
                    System.out.print("Masukkan tugas baru: ");
                    String newTask = scanner.nextLine();
                    tasks.add(newTask);
                    System.out.println("Tugas berhasil ditambahkan!");
                    break;
                    
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("Daftar tugas kosong.");
                    } else {
                        System.out.println("\nDAFTAR TUGAS:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                    
                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("Daftar tugas kosong, tidak ada yang bisa dihapus.");
                    } else {
                        System.out.println("\nDAFTAR TUGAS:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        System.out.print("Masukkan nomor tugas yang akan dihapus: ");
                        int taskNumber = scanner.nextInt();
                        if (taskNumber > 0 && taskNumber <= tasks.size()) {
                            String removedTask = tasks.remove(taskNumber - 1);
                            System.out.println("Tugas '" + removedTask + "' berhasil dihapus.");
                        } else {
                            System.out.println("Nomor tugas tidak valid!");
                        }
                    }
                    break;
                    
                case 4:
                    running = false;
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-4.");
            }
        }
        
        scanner.close();
    }
}