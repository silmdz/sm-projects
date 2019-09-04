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
public class Uri1066 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,positivo=0,negativo=0,par=0,impar=0;
        Scanner entrada=new Scanner (System.in);
        
        for(int i=1;i<=5;i++){
            a=entrada.nextInt();
            if(a>0){
                positivo++;

                }
            if (a<0) {
                negativo++;

            }
            if(a%2==0){
                par++;

            }
            else {
                impar++;

            }
            
        }
                System.out.println(par+" valor(es) par(es)");      
                System.out.println(impar+" valor(es) impar(es)"); 
                System.out.println(positivo+" valor(es) positivo(s)");                
                System.out.println(negativo+" valor(es) negativo(s)");                
        
    }
    
}
