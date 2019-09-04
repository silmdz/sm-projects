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
public class Uri3_1101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x,y,sum=0;
        Scanner entrada=new Scanner(System.in);
               x=entrada.nextInt();
               y=entrada.nextInt();            
        while (x>0&&y>0) {
        
                for (x=x;x<=y;x++) {
                sum+=x;
                System.out.println(x);             
                        


            }
               x=entrada.nextInt();
               y=entrada.nextInt();               
        }
    }
    
}
