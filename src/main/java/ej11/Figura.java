/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11;

/**
 *
 * @author hinda
 */
public abstract class Figura {
    //atributos
    private int base;
    protected int altura;
    
    //constrectores
    public Figura(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Figura() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Figura{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    public abstract void  calcularArea();
    
}
