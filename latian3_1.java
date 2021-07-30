
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author W10
 */
public class latian3_1 {
    public static void main (String [] args){
        int p,l,t,rumus;
        
       Scanner masukan = new Scanner (System.in);
       //Input
       System.out.print("Nilai Panjang Balok : ");
       p = masukan.nextInt();
       System.out.print("Nilai Lebar Balok : ");
       l = masukan.nextInt();
       System.out.print("Nilai Tinggi Balok : ");
       t = masukan.nextInt();
       //Proses
       System.out.print("==================");
       System.out.print("Menghitung Luas Permukaan Balok");
       System.out.print("==================\n");
       System.out.println("Luas Permukaan Balok = "+((2*p*l)+(2*p*t)+(2*l*t)));
       
    }
}
