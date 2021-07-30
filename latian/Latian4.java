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
public class Latian4 {
    public static void main (String []args){
        Scanner masukan = new Scanner (System.in);
        int a,b;
        System.out.print("Masukkan Nilai A= ");
        a = masukan.nextInt();
        System.out.print("Masukkan Nilai B= ");
        b = masukan.nextInt();
        System.out.println("\n");
        System.out.println("Nilai variabel yang ada pada program = ");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        
    }
}
