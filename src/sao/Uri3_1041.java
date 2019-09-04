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
public class Uri3_1041 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float x,y;
        Scanner entrada= new Scanner (System.in);
        x=entrada.nextFloat();
        y=entrada.nextFloat();
        if(x==0&&y==0) {
            System.out.println("Origem");
        }
        else {
            if (x>0&&y>0) {
                System.out.println("Q1");
            }
            if (x<0&&y>0) {
                System.out.println ("Q2");
            }
            if(x<0&&y<0){
                System.out.println("Q3");
            }
            if(x>0&&y<0){
                System.out.println("Q4");
            }
        }
        if(x==0&&(y>0||y<0)) {
            System.out.println("Eixo Y");
        }
        if (y==0&&(x>0||x<0)){
            System.out.println("Eixo X");
        }
        
        
    }
    
}
