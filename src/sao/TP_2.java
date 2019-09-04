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
public class TP_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fils,cols;
        Scanner entrada= new Scanner (System.in);
        fils=entrada.nextInt();
        cols=entrada.nextInt();
        int matriz[][]= new int [fils][cols];
        while((fils>=1&&fils<=100)&&(cols>=1&&cols<=100)){
        
        cargarArreglo (matriz);
        //mostrarArreglo(matriz);
        if(mayorPorFila(matriz)>mayorPorColumna(matriz)){
            System.out.println(mayorPorFila(matriz));
        }
        else {
            System.out.println(mayorPorColumna(matriz));
        }
        fils=entrada.nextInt();
        cols=entrada.nextInt();        
        }
       
    }
    public static void cargarArreglo (int [][] m){
        int i,j;
        Scanner entrada = new Scanner (System.in);
        for (i=0;i<m.length;i++) {
            for(j=0;j<m[i].length;j++){
                System.out.print("m[" + i + "][" + j + "]");
                m[i][j]=entrada.nextInt();
            }
        }
    }
    public static void mostrarArreglo (int [][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++)
                System.out.print(m[i] [j]);
               System.out.println();
            
        }
    }
    public static int mayorMatriz(int [][]m){
        int i,j, mayor=m[0][0];
         for (i = 0; i < m.length; i++) {  
            for (j = 0; j < m[i].length; j++) {
                if (m[i][j] > mayor) {
                    mayor = m[i][j];
                    
                    
                } 
                }
         }
         return mayor;
    }
    public static int mayorPorFila(int[][]m){
        int sum,mayor=0;
         for (int i = 0; i <m.length; i++) {
             sum=m[i][0];
            for (int j =1; j <m[i].length ; j++){
                sum+=m[i][j];
            if(sum>mayor)
                  mayor=sum;    
                }}
         
         return mayor;
    }
    public static int mayorPorColumna (int [][]m){
        int sum,mayor=0;
         for (int j = 0; j < m[0].length; j++) {
             sum=m[0][j];
            for (int i = 1; i < m.length; i++) {
                sum+=m[i][j];
                if(sum>mayor)
                    mayor=sum;
    
             
         }} 
         return mayor;
    }

   
    
    
}

                
