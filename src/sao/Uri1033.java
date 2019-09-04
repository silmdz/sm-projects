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
public class Uri1033 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x,y,i=0;
        Scanner entrada= new Scanner (System.in);
        x=entrada.nextInt();
        y=entrada.nextInt(); 
        if (x>y){
        for (i=y;i<x;i++) {
            
            if(i%5==2||i%5==3){
                
             System.out.println(i);
            }}}
        if(y>x) {
        for (i=x;i<y;i++){
            
            if(i%5==2||i%5==3){
                
             System.out.println(i); 
        }}}
        
            
     
    
       
    
    }
}
