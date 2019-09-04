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
public class Intervalo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,x,sum=0,suma=0;
       Scanner entrada=new Scanner(System.in);
       n = entrada.nextInt();
       for(int i=1;i<=n;i++) {
           x=entrada.nextInt();
           if(x>=10&&x<=20){
               sum++;
           }
           else {
               suma++;
               
           }

       }
           System.out.println(sum+" in");
           System.out.println(suma+" out");       
 
         
   }
    
    
}
