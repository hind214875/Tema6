/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuscarEnListaRecursividad;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class BuscarElemnto {

//    public static void rellenarMatrix(int[][] matrix) {
//        Random rd = new Random();
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = rd.nextInt(100) + 1;
//            }
//        }
//    }
//
//    public static void ImprimirPorConsola(int[][] matriz) {
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.print(matriz[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static String buscarElemento(int[][] matriz, int element, int fila, int columna) {
//
//        if (matriz[fila][columna] != element) {
//            buscarElemento(matriz, element, (fila - 1), (columna - 1));
//        } else {
//            return " " + fila + " " + columna;
//        }
//        return " nothing";
//    }
    public static int buscarElemento(int[] lista, int elemento, int i) {
        if (i == lista.length || lista[i] == elemento) {
            if (i == lista.length) {
                return -1;
            } else {
                return i;
            }
        } else {
            return buscarElemento(lista, elemento, i + 1);
        }
    }

    public static void main(String[] args) {
        //buscar elemto en una lista con la recursevidad
        /* en matriz
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int elemento;

        rellenarMatrix(matriz);
        ImprimirPorConsola(matriz);

        System.out.println("Que elemento estas buscando?");
        elemento = sc.nextInt();
        
        System.out.println(buscarElemento(matriz,elemento,2,2));*/

 /* en lista */
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int elemento;
        int[] list = new int[5];

        for (int i = 0; i < list.length; i++) {
            list[i] = rd.nextInt(10) + 1;
        }

        System.out.println(Arrays.toString(list));
        System.out.println("Que elemento estas buscando?");
        elemento = sc.nextInt();

        System.out.println("la posicion del elemento buscando es: " + buscarElemento(list, elemento, 0));

    }

}
