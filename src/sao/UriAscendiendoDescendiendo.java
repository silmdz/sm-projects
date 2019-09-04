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
public class UriAscendiendoDescendiendo {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        int x,y;
        Scanner entrada=new Scanner(System.in);
        x=entrada.nextInt();
        y=entrada.nextInt();
        while(x!=y) {
           
            if(x<y) {
                System.out.println("Crescente");
            }
            else {
                System.out.println("Decrescente");
            }
        x=entrada.nextInt();
        y=entrada.nextInt();   
        }

   
    }    
}
