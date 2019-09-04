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
public class UriUnidad3_1045 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double a,b,c;
       Scanner entrada= new Scanner (System.in);
       a=entrada.nextDouble();
       b=entrada.nextDouble();
       c=entrada.nextDouble();
       if(0<a && 0<b && 0<c) {
           if (a>=b+c ||b>=a+c||c>=a+b) {
           System.out.println("NAO FORMA TRIANGULO");
           }
       else {
           if (a*a==b*b+c*c){
               System.out.println("TRIANGULO RETANGULO");
           }
           if (a*a>b*b+c*c){
               System.out.println("TRIANGULO OBTUSANGULO");
           }
           else {
               System.out.println("TRIANGULO ACUTANGULO");
           }}
       if (a==b&&a==c){
           System.out.println("TRIANGULO EQUILATERO");
           if (a==b||a==c||c==b) {
           System.out.println("TRIANGULO ISOSCELES");
       }
     }
    }}
}
