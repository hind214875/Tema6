/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author hinda
 */
public class prueba {
      //busquida binaria
    public static int busquidaBinaria( ArrayList<Legislador> lista,Legislador l){
        return Collections.binarySearch(lista, l,(Legislador l1,Legislador l2)->l1.getProvinciaQueRepresenta().compareTo(l2.getProvinciaQueRepresenta()));
    }
    
    public static void main(String[] args) {
        Legislador l=new Diputado(101,"Seville","esqierda","Juan","lopez");//coversion implicita
        Legislador B=new Diputado(104,"Malaga","derecha","Alex","Esq");
        Legislador c=new Senador(1000.00,"Cadiz","derecha","Alex","Esq");
        Legislador E=new Senador(2000.00,"Mallorca","derecha","nfdd","sdrg");
        
        ArrayList<Legislador> lista= new ArrayList<>();
        lista.add(l);
        lista.add(B);
        lista.add(c);
        lista.add(E);
        
        for(Legislador le : lista) {
            System.out.println(le.toString());//polimorfismo
            System.out.println(le.getCamaraEnQueTrabaja());//polimorfismo
            if(le instanceof Diputado){
                System.out.println(((Diputado) le).getNumeroAsiento());
            }
        }
        
/*19.- Implementa la interfaz Comparator en la clase Legislador del ejercicio 15 para que se puedan ordenar colecciones de objetos de tipo Legislador, tanto por provincia como por partido político. 
20.- Actualiza la clase PruebaLegislador del ejercicio 19, y ordena la lista de Legisladores por ambos criterios. Realiza la búsqueda binaria de algún Legislador de la lista.
*/
        //ordenar por provincia y partido comparator
        Comparator<Legislador> critirioPartido=(l1,l2)->l1.getPartidoPolitico().compareTo(l2.getPartidoPolitico());
        Comparator<Legislador> critirioProvincia=(l1,l2)->l1.getProvinciaQueRepresenta().compareTo(l2.getProvinciaQueRepresenta());
        
        Comparator<Legislador> critirioFinal=critirioPartido.thenComparing(critirioProvincia);
        //ordenar con los dos critirios
        Collections.sort(lista, critirioFinal);
         
         for(Legislador le : lista) {
            System.out.println(le.toString());//polimorfismo
         }
   
       //busquida binaria
        System.out.println("en que posicion es el legislador de Malaga: "+busquidaBinaria(lista,B));
         
        
    }
}
