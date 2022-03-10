/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author hinda
 */
public class PruebaHerencia {

    public static void main(String[] args) {

        String atributos;

        Turismo t1 = new Turismo(); // Constructor por defecto de Java
        atributos = t1.toString();
        System.out.println(atributos);

        // Creación de instancias de la superclase Vehiculo y
        // de las subclases Turismo, Deportivo y Furgoneta
        Vehiculo miVehiculo = new Vehiculo("4050 ABJ", "VW", "GTI", "", 100.0, true);
        Turismo miTurismo = new Turismo("345674", "4060 TUR", "Skoda", "Fabia", 90.00, false, 2, true);
        Deportivo miDeportivo = new Deportivo(2, "HG4568", "Mercedes", "wv", "blue", 100.00, true);
        Furgoneta miFurgoneta = new Furgoneta(10, 20,"JK15489", "furgoneta", "dgd" ,"verde", 500, false);

    }

}
