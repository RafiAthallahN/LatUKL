/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otakatik;

/**
 *
 * @author W10
 */
public class NewClass1 {
    public static void main(String[] args) {
        
    
    int a, b; // inisialisasi variabel a dan b dengan tipe data integer
        for (a = 0; a < 5; a++) { // sebagai perulangan luar
             System.out.println(" ");// untuk membentuk baris sesuai pola perulangan
            for (b = 0; b < a; b++) { // sebagai perulangan dalam dari 1 hingga 4
                System.out.print("*"); // untuk menampilkan bintang dengan membentuk pola segitiga
            }
        }
        System.out.println("\n");
         for (a = 1; a <= 5; a++) { // sebagai perulangan luar
            System.out.println(""); // untuk membentuk baris sesuai pola perulangan
            for (b = a; b <= 5; b++) { // sebagai perulangan dalam mulai dari 5 hingga 1
                System.out.print("*"); // untuk menampilkan bintang dengan membentuk pola segitiga
            }
        }
    }
}
