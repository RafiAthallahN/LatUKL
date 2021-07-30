/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatUKL;

/**
 *
 * @author W10
 */
public class Lat1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 10;
        int d;
        int e = 0;
                
           for(int i = 1;i <= c; i++){
               d = a;
               a += b;
               System.out.println("Suku ke- "+i+" adalah "+d);
               
               e += d;
           } 
        System.out.println(e);
    }
}
