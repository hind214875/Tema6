/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8;

import java.util.Random;

/**
 *
 * @author hinda
 */
public class Moneda extends Azar {

    private static Random rd = new Random();

    public Moneda(){
        
    }

    @Override
    public int lanzar() {
        return rd.nextInt(2) + 1;
    }
    
     @Override
    public String toString() {
        return super.toString()+" Moneda";
    }

}
