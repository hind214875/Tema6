/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej16;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author hinda
 */
public class Prueba {
    
    public static ArrayList<Robot> cantidadRobotMas50(ArrayList<Robot> list){
        ArrayList<Robot> robots=new ArrayList<>();
        
        for (Robot r : list) {
            if(r.getPorcentajeVida()>50){
                robots.add(r);
            }
        }
        return robots;
    }
    
    public static void main(String[] args) {
        //crear lista
        ArrayList<Robot> robots=new ArrayList<>();
        
        //rellenar la lista aleatoramiente
        for (int i = 0; i < 20; i++) {
            robots.add(new Robot());
        }
        
        //Imprimir la lista de robots ordenada por porcentaje de vida de los robots.
        //Al principio de la lista DEBEN estar los robots con menos porcentaje de vida. 
        Collections.sort(robots);
        System.out.println(robots.toString());
        
        //Imprimir la cantidad de robots que tienen más del 50% de vida. 
        cantidadRobotMas50(robots).forEach(System.out::println);

        //Imprimir el número de serie de los TRES robots que tienen mayor porcentaje de vida. 
       
    }
}
