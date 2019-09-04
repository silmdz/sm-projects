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
public class UriIntervalo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a;
        Scanner entrada = new Scanner (System.in);
        a = entrada.nextFloat();
        if (a>=0 && a<=100) { 
            if (a>=0&a<=25) {
                System.out.println ("Intervalo [0,25]"); 
            }
                if (a>25&a<=50) {
                    System.out.println ("Intervalo (25,50]");
                }{
            if (a>50&a<=75) {
                    System.out.println ("Intervalo (50,75]");
            }
                    {
                    if (a>75&a<=100) {
                        System.out.println("Intervalo (75,100]");
                
                    }
                    
            }
                
        }
            
            
            }
        else {
        
  System.out.println("Fora de intervalo"); }
 
     }           
            
                
                    
               
            
        }  
        
         
                
               
                
             
                           
                
               
                
             
                
        
    
    
    

