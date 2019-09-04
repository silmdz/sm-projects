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
import javax.swing.JOptionPane;
public class Uribasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int precioProducto=300;
    final double IVA=0.21;
    JOptionPane.showMessageDialog (null, "el precio del producto, incluido el IVA es "+(precioProducto+(precioProducto*IVA)));
    
    
    }
    
}
