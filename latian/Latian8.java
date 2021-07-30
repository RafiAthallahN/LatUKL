/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latian;

import java.util.Scanner;

/**
 *
 * @author W10
 */
public class Latian8 {
    public static void main (String[]args){
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan Nilai TPA : ");
        int TPA = masuk.nextInt();
        System.out.print("Masukkan Nilai Bahasa Inggris : ");
        int bing = masuk.nextInt();
        if ((TPA > 85)&&(bing > 80))
            System.out.println("Siswa dapat beasiswa");
        else 
            System.out.println("Siswa tidak mendapat beasiswa");
    }
}
