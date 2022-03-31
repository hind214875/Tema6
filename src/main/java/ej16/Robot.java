/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej16;

import java.util.Random;


/**
 *
 * @author hinda
 */
public class Robot implements Comparable<Robot>{
    //atibutos
    private int numeroSerie;
    private int porcentajeVida;//entre 1 y 100
    
    //constantes
    Random RD= new Random();
    
    //constrector
    public Robot() {
        this.numeroSerie = RD.nextInt(10);
        this.porcentajeVida = RD.nextInt(100)+1;
    }

    //getters y setters
    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getPorcentajeVida() {
        return porcentajeVida;
    }
   
    //toString
    @Override
    public String toString() {
        return "Robot:" + "numeroSerie=" + numeroSerie + ", porcentajeVida=" + porcentajeVida + '\n';
    }
    
    //hachCode y equals
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.numeroSerie;
        hash = 37 * hash + this.porcentajeVida;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Robot other = (Robot) obj;
        if (this.numeroSerie != other.numeroSerie) {
            return false;
        }
        return this.porcentajeVida == other.porcentajeVida;
    }

    @Override
    public int compareTo(Robot t) {
        return Integer.compare(porcentajeVida, t.porcentajeVida);
    }
    
    
}
