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
public class Latian7 {
    public static void main (String []args){
        Scanner masuk = new Scanner (System.in);
        System.out.println("Silahkan pilih angka 1 - 3 : ");
        int bil = masuk.nextInt();
        switch (bil){
            case 1 :
                System.out.println("Satu");
                break;
            case 2 : System.out.println("Dua");
            break;
            case 3 : System.out.println("Tiga"); break;
            default : System.out.println("TIdak ada");
        }
    }
}
