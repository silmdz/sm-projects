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
public class Punto {
    float x1;
    float y1;
    float abcisa;
    float ordenada;
    float nuevoValor;
    
    public Punto(float x1, float y1){
        this.x1=x1;
        this.y1=y1;   
    }
    public float getX()
    {
        return abcisa;
    }
    public float getY(){
        return ordenada;
    }
    public void setX (float nuevoValor){
        this.nuevoValor=abcisa;
    }
    public void setY (float nuevoValor){
        this.nuevoValor=ordenada;
    }
   
    @Override
    public boolean equals (Object otroPunto){
        if (otroPunto instanceof Punto){
            return (x1 == ((Punto)otroPunto).getX())&& (y1 ==((Punto)otroPunto).getY());
        }      
        return true;
    }

    
}

