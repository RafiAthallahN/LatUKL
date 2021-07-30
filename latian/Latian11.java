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
public class Latian11 {
    public static void main(String[]args){
        Scanner masuk = new Scanner(System.in);
        int a=0, total=0, bil=7;
        while (bil != 0){
            a++;
            System.out.print("Masukkan bilangan ke-"+a+" : ");
            bil = masuk.nextInt();
            total += bil;
        }
        System.out.print("total jumlah "+(a-1)+" bilangan : ");
    }
}
