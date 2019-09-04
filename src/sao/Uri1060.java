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
public class Uri1060 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a;
        int sum=0;
        Scanner entrada= new Scanner (System.in);
        for (int i=1;i<=6;i++){ 
           a=entrada.nextDouble();
            if(a>=0){
               sum++;
              }  }
         System.out.println(sum+ " valores positivos");

  
            
        
    }
    
}
