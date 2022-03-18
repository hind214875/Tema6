/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8;

/**
 *
 * @author hinda
 */
public class Prueba {
    public static void main(String[] args) {       
        Dado d=new Dado();
        Dado d1=new Dado();
        Moneda m=new Moneda();
        Moneda m1=new Moneda();
              
        System.out.println(m.lanzar());
        System.out.println(d.lanzar());
    }
}
