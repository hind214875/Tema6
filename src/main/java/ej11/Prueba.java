/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11;

import java.util.ArrayList;

/**
 *
 * @author hinda
 */
public class Prueba {

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        
        figuras.add(new Rectangulo(10, 12)); // Base=10 Altura=12
        figuras.add(new Triangulo(10, 5)); // Base=10 Altura=5
        figuras.add(new Romboide(15, 5)); // Base=15, Altura=5 
        
        //Figura f=new Figura(1,2);de la clase abstacta no puedo crear nuevo objeto
        
        for (Figura f : figuras) {
            f.calcularArea();
        }
    }

}

