/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author hinda
 */
public class Prueba {

    public static ArrayList<Robot> cantidadRobotMas50(ArrayList<Robot> list) {
        ArrayList<Robot> robots = new ArrayList<>();

        for (Robot r : list) {
            if (r.getPorcentajeVida() > 50) {
                robots.add(r);
            }
        }
        return robots;
    }

    public static int busquidaBinaria(ArrayList<Robot> list,int numeroSerie){
           Robot r=new Robot("eret",0);
           return Collections.binarySearch(list, r,(Robot r1,Robot r2)->(r1.getNumeroSerie().compareTo(r2.getNumeroSerie())));
    }
    
    //busquida binaria de robot
      public static int busquidaBinariaRobot(ArrayList<Robot> list,Robot r){
           return Collections.binarySearch(list, r,(Robot r1,Robot r2)->(r1.getNumeroSerie().compareTo( r2.getNumeroSerie())));
    }
   

    public static void main(String[] args) {
        //crear lista
        ArrayList<Robot> robots = new ArrayList<>();
        
        robots.add(new Robot("efuis",1));
        robots.add(new Robot("cxs",100));
        robots.add(new Robot("tkl",19));
        robots.add(new Robot("eret",11));
        robots.add(new Robot("erer",21));

//        //rellenar la lista aleatoramiente
//        for (int i = 0; i < 20; i++) {
//            robots.add(new Robot());
//        }

        //Imprimir la lista de robots ordenada por porcentaje de vida de los robots.
        //Al principio de la lista DEBEN estar los robots con menos porcentaje de vida. 
        Collections.sort(robots);
        System.out.println(robots.toString());

        //Imprimir la cantidad de robots que tienen más del 50% de vida. 
        cantidadRobotMas50(robots).forEach(System.out::println);

        //Imprimir el número de serie de los TRES robots que tienen mayor porcentaje de vida. 
         Comparator<Robot> criterioporcentaje= ( r1, r2)->r1.getPorcentajeVida()-r2.getPorcentajeVida();
         Collections.sort(robots, criterioporcentaje.reversed());
         for (int i = 0; i <3; i++) {
             System.out.println("los tres premiros son: "+robots.get(i).toString());
        }
         
         //Además, debe ser posible ordenar los robots por número de serie.
         System.out.println("ordinar por numero de serie: ");
         Comparator<Robot> criterioanumeroSerie=(r1,r2)->r1.getNumeroSerie().compareTo(r2.getNumeroSerie());
         Collections.sort(robots, criterioanumeroSerie);
         robots.forEach(System.out::println);
         
         //Una vez ordenada la lista por número de serie, realizar búsqueda binaria de algún robot dentro de la lista.
           System.out.println(busquidaBinaria(robots,5));
           Robot r=new Robot("eret",90);
           System.out.println(busquidaBinariaRobot(robots,r));
    }
}
