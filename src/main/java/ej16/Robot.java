/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej16;

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;


/**
 *
 * @author hinda
 */
public class Robot implements Comparable<Robot>{
    //atibutos
    private String numeroSerie;
    private int porcentajeVida;//entre 1 y 100
    
    //constantes
    Random RD= new Random();
    
    //constrector
    public Robot() {
        this.numeroSerie =RandomStringUtils.randomAlphabetic(5).toLowerCase(); 
        this.porcentajeVida = RD.nextInt(100)+1;
    }

    public Robot(String numeroSerie, int porcentajeVida) {
        this.numeroSerie = numeroSerie;
        this.porcentajeVida = porcentajeVida;
    }


    public String getNumeroSerie() {
        return numeroSerie;
    }

    //getters y setters
    public void setNumeroSerie(String numeroSerie) {
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
    public int compareTo(Robot t) {
        return Integer.compare(porcentajeVida, t.porcentajeVida);
    }
    
    
}
