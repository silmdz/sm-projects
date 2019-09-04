/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBA;

/**
 *
 * @author PC MASTER
 */
public class UsaRectaT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PuntoT p1 = new PuntoT (1,1);
        p1.setX(1);
        p1.setY(1);
        PuntoT p2 = new PuntoT (2,2);
        p2.setX(1);
        p2.setY(1);
        PuntoT p3 = new PuntoT (3,3);
        p3.setX(1);
        p3.setY(1);
        PuntoT p4 = p2;
        
        
        Rectat r1 = null;
        Rectat r2 = null;
        r1.setRecta(p1, p2);
        r1.pendiente(p1, p2);
        r2.setRecta(p3,p4);
    }

    
 
   // public UsaRectaT(float p1, float p2) {
     //   super(p1,p2);
    }
        
    //}
    

