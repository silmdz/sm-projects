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
public class Uri_1180 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner entrada=new Scanner(System.in);
        n=entrada.nextInt();
        int [] x = new int [n];
        for (int i=0;i<x.length;i++){
             x[i]=entrada.nextInt();
            
        }
        System.out.println("Menor valor: "+menorValor(x));
        System.out.println("Posicao: "+menorPosicion(x));
    }
     public static int menorValor(int[]m){
         int menor=m[0];
         for(int i=0;i<m.length;i++){
             if(m[i]<menor){
                 menor=m[i];
            }
         }return menor;
         
     }
     public static int menorPosicion(int[]m){
         int menorp=m[0];
         for(int i=0;i<m.length;i++){
             if(m[i]<menorp){
                 menorp=i;
            }
         }return menorp;
         
     }     
}
