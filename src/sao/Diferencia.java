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
public class Diferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a,b,c,d;
    Scanner entrada = new Scanner (System.in);
    a = entrada.nextInt();
    b = entrada.nextInt();
    c = entrada.nextInt();
    d = entrada.nextInt();
    System.out.println("DIFERENCA = "+((a*b)-(c*d)));
    
    
    
    }
    
}
