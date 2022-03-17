/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje5;

import java.util.ArrayList;

/**
 *
 * @author hinda
 */
public class Prueba {

    public static void main(String[] args) {
        /*Creación de 5 objetos Cliente, uno con el constructor por defecto y cuatro con el parametrizado. 
          De los cuatro objetos creados con el parametrizado, 3 tendrán los mismos estados. */

        Cliente c = new Cliente();
        Cliente c1 = new Cliente("Juan", "1234J", 22);
        Cliente c2 = new Cliente("Juan", "1234J", 22);
        Cliente c3 = new Cliente("Juan", "1234J", 22);
        Cliente c4 = new Cliente("Hinda", "1834J", 22);

        //ArrayList<Cliente> clientes = new ArrayList<>();

        /*Imprime los hashCode de cada instancia, y comprueba cuáles son iguales y cuáles distintos*/
//        for (Cliente cl : clientes) {
//            System.out.println("el hashCode de cada cliente: " + cl.hashCode());
//        }
        System.out.println("el hashCode de cada cliente: " + c.hashCode());
        System.out.println("el hashCode de cada cliente: " + c1.hashCode());
        System.out.println("el hashCode de cada cliente: " + c2.hashCode());
        System.out.println("el hashCode de cada cliente: " + c3.hashCode());
        System.out.println("el hashCode de cada cliente: " + c4.hashCode());

        /*Comprobaciones de las propiedades transitiva, reflexiva, simétrica y nula.*/
        System.out.println("equals: " + c.equals(c1));
        System.out.println("c1 y c2 equals? " + c1.equals(c2));
        System.out.println("es c1 equals null? "+c1.equals(null));

        /*
        Reflexiva: cualquier objeto que se compare con si mismo debe de devolver siempre verdadero. ( obj.equals(obj) ) 
        Simétrica: si tenemos dos objetos a y b, y se cumple a.equals(b) entonces se debe de cumplir b.equals(a). 
        Transitiva: como su nombre indica para tres objetos a, b y c si se cumple que a.equals(b) y b.equals(c) debe de cumplirse también que a.equals(c). 
        Nula: siempre que comparemos cualquier objeto con null el resultado debe de ser falso. 

         */
    }
}
