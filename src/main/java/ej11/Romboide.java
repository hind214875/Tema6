/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11;

/**
 *
 * @author hinda
 */
public class Romboide extends Figura {

    public Romboide(int base, int altura) {
        super(base, altura);
    }

    public Romboide() {
    }

    @Override
    public String toString() {
        return "Romboide" +super.toString();
    }
    
    @Override
    public void calcularArea(){
        System.out.println("Area Romboide = "+ getBase()*altura);
    }
    
    
}
