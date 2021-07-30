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
public class Latian10 {
    public static void main(String[] args){
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan batas bilangan : ");
        int batas = masuk.nextInt();
        int hasil = 0 ;
        for(int i=1;i<batas;i++)
            hasil = i++;
        System.out.println("Total jumlah adalah = "+ hasil);
    }
}
