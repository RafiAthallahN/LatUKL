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
public class Latian5 {
    public static void main (String [] args){
        int nilai;
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan Nilai : ");
        nilai = masukan.nextInt();
        if(nilai < 70 )
            System.out.println("Siswa tidak lulus");
        if(nilai > 70 )
            System.out.println("Sisea lulus");
    }
}
