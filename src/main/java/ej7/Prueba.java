/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7;

import java.util.ArrayList;

/**
 *
 * @author hinda
 */
public class Prueba {
    public static void main(String[] args) {
        
        Camarero c=new Camarero("1","camarero1","Fernardez","1283LK");
        Camarero c1=new Camarero("2","camarero2","Fgf","54896KJ");
        Cosinero co1=new Cosinero("Postres","luisa","perez","45865LK");
        Cosinero co2=new Cosinero("Postres","Alex","perez","453135MB"); 
        
        ArrayList<Trabajador> trabajadores=new ArrayList<>();
        trabajadores.add(c);//conversion implicita
        trabajadores.add(c1);
        trabajadores.add(co1);
        trabajadores.add(co2);
        
        for (Trabajador t : trabajadores) {    
            System.out.println(t);
            t.cotizar();
        }
 
        
        
    }
}
