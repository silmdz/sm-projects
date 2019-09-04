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
public class Tp1Sao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int P,N = 0,ant,rest=0;
       int[]alt= new int [N]; 
       Scanner entrada= new Scanner (System.in);
       P=entrada.nextInt();
       N=entrada.nextInt();
       for (int i=0;i<=N;i++) {
           N=i;
           alt [i]=entrada.nextInt();
       }
       for(int i=0;i<N;i++){
        ant=i;
        rest=ant-(++ant);
       }
       
        if (rest>P) {
            System.out.println("YOU WIN)");
       }
        else {
            System.out.println("GAME OVER");
        }
   

       
    }
    
}
