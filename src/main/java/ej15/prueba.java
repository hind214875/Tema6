/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15;

import java.util.ArrayList;

/**
 *
 * @author hinda
 */
public class prueba {
    public static void main(String[] args) {
        Legislador l=new Diputado(101,"Seville","esqierda","Juan","lopez");
        Legislador B=new Diputado(104,"Malaga","derecha","Alex","Esq");
        Legislador c=new Senador(1000.00,"Cadiz","derecha","Alex","Esq");
        Legislador E=new Senador(2000.00,"Mallorca","derecha","nfdd","sdrg");
        
        ArrayList<Legislador> lista= new ArrayList<>();
        lista.add(l);
        lista.add(B);
        lista.add(c);
        lista.add(E);
        
        for(Legislador le : lista) {
            System.out.println(le.toString());
            System.out.println(le.getCamaraEnQueTrabaja());//polimorfismo
        }
        
    }
}
