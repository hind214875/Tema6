/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuscarEnListaRecursividad;

/**
 *
 * @author hinda
 */
public class PalindromoItirativa {
    public static boolean palindromo(String palabra){
        String reverse = "";
        for (int i = palabra.length()-1; i >=0 ; i--) {
            reverse+=palabra.charAt(i);
        }

        return reverse.equalsIgnoreCase(palabra);
    }
    
    public static void main(String[] args) {
         String palabra="holaaloh";
         System.out.println("es palindromo? "+palindromo(palabra));
         
    }
}
