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
public class Latian6 {
    public static void main(String []args){
        Scanner masukan =  new Scanner(System.in);
        System.out.print("Masukkan nilai Web : ");
        int nilai = masukan.nextInt();
        if (nilai >= 90)
            System.out.println("A");
        else if (nilai >= 75)
            System.out.println("B");
        else if (nilai >= 50)
            System.out.println("C");
        else if (nilai >= 35)
            System.out.println("D");
        else
            System.out.println("E");
        
    }
}
