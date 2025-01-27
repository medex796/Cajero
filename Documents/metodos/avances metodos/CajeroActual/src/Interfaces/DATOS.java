/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.io.Serializable;

/**
 *
 * @author Jhonny
 */
public class DATOS implements Serializable{
   public String numeroCuenta ;
    public String nombreApellido; 
    public String tipoCuenta;
    public String tipoMoneda;
    public String saldo;
    public DATOS(String numeroCuenta, String nombreApellido, String tipoCuenta, String tipoMoneda, String saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreApellido = nombreApellido;
        this.tipoCuenta = tipoCuenta;
        this.tipoMoneda = tipoMoneda;
        this.saldo = saldo;
    }

    // Getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public String getSaldo() {
        return saldo;
    } 
}
