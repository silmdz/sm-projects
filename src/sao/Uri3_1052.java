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
public class Uri3_1052 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes;
        Scanner entrada=new Scanner(System.in);
        mes=entrada.nextInt();
        if(mes>=1&&mes<=12){
            if(mes==1){
                System.out.println("January");
            }
            if(mes==2){
                System.out.println("February");
            }
            if(mes==3){
                System.out.println("March");
            }
            if(mes==4){
                System.out.println("April");
            }
            if(mes==5){
                System.out.println("May");
            }
            if(mes==6){
                System.out.println("June");
            }
            if(mes==7){
                System.out.println("July");
            }
            if(mes==8){
                System.out.println("August");
            }
        
            if(mes==9){
                System.out.println("September");
            }
            if(mes==10){
                System.out.println("October");
            }
            if(mes==11){
            System.out.println("November");
            }
            if(mes==12){
            System.out.println("December");
            }
    }
    }
}
