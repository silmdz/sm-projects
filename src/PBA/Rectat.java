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
public class  Rectat extends PuntoT {
    
    PuntoT p1;



    private PuntoT p2, p3,p4;
    boolean paralela = false;        
    

    public Rectat(float p1, float p2) {
        super(p1, p2);
    }

//    public void Recta (Punto p1, Punto p2) {
//        this.p1 = p1;
//        this.p2 = p2;
//    }

    public PuntoT getP1(){
        return p1;
    }
    
    public PuntoT getP2(){
        return p2;
    }
    
    public void setP1(PuntoT p1) {
        this.p1 = p1;
    }
    
    public void setP2(PuntoT p2) {
        this.p2 = p2;
    }
    
        
    //Recta Identidad
    public void setRecta(PuntoT x1,PuntoT y1){
        this.x1 = 1;
        this.y1 = 1;
    }
    
    //Métodos
    
    //pendiente
    public float pendiente(PuntoT p1, PuntoT p2){
        return (p2.y1-p1.y1)/(p2.x1-p1.x1);
    }
    
    //determinar si dos rectas son paralelas
    public boolean paralelas(Rectat otraRecta){   
        if ((p2.y1-p1.y1)/(p2.x1-p1.x1) == (p4.y1-p3.y1)/(p4.x1-p3.x1)){
            paralela = true;
        }
        return paralela;
    }    
    
    
     @Override
    public boolean equals(Object otraRecta) {
        if (this == otraRecta) {
            return true;
        }
        if (otraRecta == null) {
            return false;
        }
        if (getClass() != otraRecta.getClass()) {
            return false;
        }
        final PuntoT other = (PuntoT) otraRecta;
        if (this.x1 != other.x1) {
            return false;
        }
        if (this.y1 != other.y1) {
            return false;
        }
        return true;
    }
    
    
    
    
    //determinar si son rectas iguales
//    @Override
//    public boolean equals(Object otraRecta){
//        boolean equal = false;
//        // En el condicional se verifica primero que la recta 1 y la recta 2 tengan la misma ordenada al
//        // origen, luego se verifica que tengan la misma pendiente.
//        if (p1.y1-(((p2.y1-p1.y1)/(p2.x1-p1.x1))*p1.x1) == (p3.y1-(((p4.y1-p3.y1)/(p4.x1-p3.x1))*p3.x1))){
//            if (paralela == true){
//                equal = true;
//        }
//        }
//        return equal;
//    }    

    
}
