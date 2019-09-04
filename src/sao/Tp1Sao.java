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
public class Tp1Sao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int P,N=0;
        int [] alt= new int[N];
        Scanner entrada=new Scanner (System.in);
        P=entrada.nextInt();
        N=entrada.nextInt();
        for(int i=0;i<N;i++) {
            alt[i]=entrada.nextInt();
            }
        boolean win=true;
        for (int i=0;i<N-1;i++){
            if((alt[i+1]-alt[i])>P||(alt[i]-alt[i+1])>P){
            win=false;
        }
        }
            if (win){
                System.out.println("YOU WIN");
            }
            else {
                System.out.println("GAME OVER");
            }
        }
                
    }
    

