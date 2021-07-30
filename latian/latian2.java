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
public class latian2 {
    public static void main (String[] args) {
        int nilai_pbo, nilai_web;
        //Input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukkan Nilai : ");
        System.out.print("NIlai PBO = ");
        nilai_pbo = keyboard.nextInt();
        System.out.print("Nilai Web = " );
        nilai_web = keyboard.nextInt();
        //Pembatas
        System.out.print("\n ================= \n");
        //Output
        System.out.println("Nilai yang Terdapat dalam Program : ");
        System.out.println("Nilai PBO = "+ nilai_pbo);
        System.out.println("Nilai Web = "+ nilai_web);
    }
}
