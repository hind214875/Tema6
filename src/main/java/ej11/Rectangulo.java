/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11;

/**
 *
 * @author hinda
 */
public class Rectangulo extends Figura{
    //atributos
    
    //constrector
    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        super(base, altura);
    }
    
    
    //
    @Override
    public void calcularArea(){
        System.out.println("Area Rectangulo = "+ base*altura);
    }
    
    
    
    
    
    
    
    
}
