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
public class Uri3_1042 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1,num2,num3;
       Scanner entrada=new Scanner(System.in);
       num1=entrada.nextInt();
       num2=entrada.nextInt();
       num3=entrada.nextInt();
       if(num1>num2&&num1>num3){
           if(num2>num3){
               System.out.println(num1+" "+num2+" "+num3);
               System.out.println(num1+" "+num2+" "+num3);
           }
           else{
               System.out.println(num1+" "+num3+" "+num2);
               System.out.println(num1+" "+num2+" "+num3);
           }}
       if (num2>num1&&num2>num3){
               if(num1>num3){
                   System.out.println(num2+" "+num1+" "+num3);
                   System.out.println(num1+" "+num2+" "+num3);
               }
               else{
                   System.out.println(num2+" "+num3+" "+num1);
                   System.out.println(num1+" "+num2+" "+num3);
               }}
       if (num3>num2&&num3>num1){
           if(num2>num1){
           System.out.println(num3+" "+num2+" "+num1);
           System.out.println(num1+" "+num2+" "+num3);
       }
           else {
               System.out.println(num3+" "+num1+" "+num2);
               System.out.println(num1+" "+num2+" "+num3);
           }

    }

}}
