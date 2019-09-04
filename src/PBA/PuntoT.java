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
public class PuntoT {
    float x1;
    float y1;
    
    // Constructor
    PuntoT (float x1, float y1){
        this.x1 = x1;
        this.y1 = y1;
    }
    
    // Métodos    
    public float getX(){
        return x1;
    }
    
    public float getY(){
        return y1;
    }
    
    public void setX(float x1) {
        this.x1 = x1;
    }
    
    public void setY(float y1) {
        this.y1 = y1;
    }
    
    
    @Override
    public boolean equals(Object otroPunto) {
        if (this == otroPunto) {
            return true;
        }
        if (otroPunto == null) {
            return false;
        }
        if (getClass() != otroPunto.getClass()) {
            return false;
        }
        final PuntoT other = (PuntoT) otroPunto;
        if (this.x1 != other.x1) {
            return false;
        }
        if (this.y1 != other.y1) {
            return false;
        }
        return true;
    }
    
}
