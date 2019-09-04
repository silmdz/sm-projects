/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author PC MASTER
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ArrayList<Integer> num;
    num = new ArrayList();
    int cont=0;
    
    num.add(1);
    num.add(2);
    num.add(9);
    num.add(2);
    num.add(6);
    num.add(4);
    num.add(2);
    num.add(1);
    num.add(2);
    num.add(9);
    num.add(2);
    num.add(6);
    num.add(4);
    num.add(2);
    num.add(1);
    num.add(2);
    num.add(9);
    num.add(2);
    num.add(6);
    num.add(4);
    num.add(2);
    num.add(1);
    num.add(2);
    num.add(9);
    num.add(2);
    num.add(6);
    num.add(4);
    num.add(2);
    
Set <Integer> setb=new HashSet<Integer>(num);
num.addAll(setb);
num.removeAll(num);
setb.addAll(num);

System.out.println(num);
    
    

    
  
    
    }
    
}
