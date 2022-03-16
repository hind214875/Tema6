/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11;

/**
 *
 * @author hinda
 */
public class Triangulo extends Figura {

    public Triangulo(int base, int altura) {
        super(base, altura);
    }

    public Triangulo() {
    }

    @Override
    public String toString() {
        return "Triangulo"+super.toString() ;
    }
    
    @Override
    public void calcularArea(){
        System.out.println("Area Triangulo"+(base*altura)/2);
    }
}
