/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sao;

import java.util.Scanner;

/**
 *
 * @author PC MASTER
 */
public class Uri_1173 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] n = new int[10];
        int v;
        
       Scanner entrada=new Scanner (System.in);
       v=entrada.nextInt();
       n[0]=v;
       for (int i=1;i<n.length;i++) {                                     
          v=v*2;
          n[i]=v;
           
       }
       mostrarArreglo(n);
       
    }
    public static void mostrarArreglo(int []m){
        for(int i=0;i<m.length;i++){
            System.out.println("N["+i+"] = "+ m[i]);
        }
    }
    
}
