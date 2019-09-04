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
public class prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        int r;
        Scanner entrada=new Scanner(System.in);
        num=entrada.nextInt();
        while(num>0){
        r=num%10;
        num=num/10;
        System.out.println(r);
        }
        
    }
    
}
