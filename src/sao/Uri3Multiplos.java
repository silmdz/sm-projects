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
public class Uri3Multiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int a,b;
    Scanner entrada = new Scanner (System.in);
    a = entrada.nextInt();
    b = entrada.nextInt();
    
    if (a%b==0 || b%a==0) {
      
        System.out.println("Sao Multiplos");
    }
    else{
        System.out.println("Nao sao Multiplos");
        }  
    
    }
}