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
public abstract class Azar {

    protected int posibilidades;

    public Azar(int posibilidades) {
        this.posibilidades = posibilidades ;
    }

    public abstract int lanzar();

    @Override
    public String toString() {
        return "Azar{" + "posibilidades=" + posibilidades + '}';
    }

}
