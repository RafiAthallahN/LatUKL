/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otakatik;

import javax.swing.JOptionPane;

/**
 *
 * @author W10
 */
public class otakatikv2 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Masukkan Jenis Kelamin : ");
        String input2 = JOptionPane.showInputDialog("Masukkan Nilai  : ");
        int input3 = Integer.parseInt(input2);
        
        if((input = "L" || input = "P") && input3 >=85){
        JOptionPane.showMessageDialog(cmpnt, args, input2, input3, icon);
    }}
}
