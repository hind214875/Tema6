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
public class PalindromoRecursiva {
    public static boolean palindromo(String palabra,int palabraLength,int numero) {
        if (palabraLength<= palabra.length() || palabraLength>0 || numero>0) {
            if(palabra.charAt(numero)==palabra.charAt(palabraLength)){
                return palindromo(palabra,palabraLength-1,numero-1);
            }else{
                return false;
            }
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
         String palabra = "holaloh";
         System.out.println("es palidromo? "+palindromo(palabra,palabra.length(),palabra.length()));
    }
}
