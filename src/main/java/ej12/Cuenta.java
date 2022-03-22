/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author hinda
 */
public abstract class Cuenta {
    //atributos
    private String numeroCuenta;
    private double saldo;
    private Cliente cliente;
    
    //constantes 
        
        
    //constrectores

    public Cuenta(Cliente cliente) {
        this.numeroCuenta = RandomStringUtils.randomAlphabetic(20).toLowerCase();
        this.saldo = 0;
        this.cliente = cliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public abstract void actualizarSaldo();
    
    public abstract void retirar(double saldo);
    
    
}
