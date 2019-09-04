/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sao;

/**
 *
 * @author PC MASTER
 */
public class UsaRecta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto p1, p2,p3;
        p1= new Punto('1','1');
        p2= new Punto('2','2');
        p3= new Punto ('3','3');
        
        Recta r1,r2;
        r1=new Recta (p1,p2);
        r2= new Recta(p2,p3);
        System.out.println("La pendiente de la recta 1 es "+r1.getPendiente());
        
        
    }
}
