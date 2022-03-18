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
public class Dado extends Azar{

    public Dado(int posibilidades) {
        super(posibilidades);
    }
    
    
    @Override
    public int lanzar() {
        Random rd=new Random();
        return rd.nextInt(6)+1;
    }

    @Override
    public String toString() {
        return super.toString()+"";
    }
    
    
    
}
