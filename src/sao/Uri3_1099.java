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
public class Uri3_1099 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,x,y,acum=0;
        Scanner entrada=new Scanner(System.in);
        n=entrada.nextInt();
        for (int i=0;i<=n;i++){
            x=entrada.nextInt();
            y=entrada.nextInt();
            if(x<y){
                for(int j=x;j>=y;j++){
                    if(j%2!=0){
                        j++;
                        System.out.println(j);
                    }
                }}
            if(y<x){
                for(int k=y;k<=x;k++){
                    if(k%2!=0){
                        k++;
                        System.out.println(k);
                    }
                }
            }
            else {
                System.out.println("0");
            }

        }    
}}
