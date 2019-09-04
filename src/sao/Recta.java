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
public class Recta {
    float m, p1, p2,x,y,pendiente;
    
    public Recta (Punto p1, Punto p2){   
       
    }
    public Recta (){
        
    }
  
    public float getPendiente(){
        
        return m;
    }
   public void setPendiente (Punto p1, Punto p2){
       
       m=(p2.x1-p1.y1)/(p2.x1-p1.x1);

               
   }
    public boolean equals (Object otraRecta){
        if (otraRecta instanceof Recta){
            return (p1==((Recta)otraRecta).getPendiente())&&(p2==((Recta)otraRecta).getPendiente());
        }
        return true;
       
    }
    boolean p1Conp2(Recta unaRecta){
       return (this.p1==unaRecta.p2);                
  }
 boolean Paralela(Recta otraRecta){
    if (otraRecta instanceof Recta){
    return (pendiente == ((Recta)otraRecta).getPendiente());
        }      
    return true;       
 }
    
            
}
