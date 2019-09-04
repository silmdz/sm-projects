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
public class Uri1078 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n,mult=0;
       Scanner entrada= new Scanner(System.in);
       n=entrada.nextInt();
       for(int i=1; i<=10;i++) {
           
           mult=n*i;
       
       System.out.println(i+" x "+n+" = "+mult);  
       }
        
            
    }
    
}
