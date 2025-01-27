/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author Jhonny
 */
public class Cuenta implements Serializable {
    public int numeroCuenta;
    public String moneda ;//si es false es dolares si es true es bolivianos o falso para dolares y true para bolivianos
    public double saldo;
    public String tipoCuenta;
    public String usuario ;
    public ArrayList <Historia> Historia = new ArrayList();
    
    public  Cuenta (int numerocuenta , String moneda,double saldo,String tipoCuenta,String usuario){
    
        this.numeroCuenta=numerocuenta;
        this.moneda = moneda;
        this.saldo=saldo;
        this.tipoCuenta= tipoCuenta;
        
        this.usuario=usuario;
    }
    
   
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    

    public String getMoneda() {
        return moneda;
    }
    public String getTipoCuenta() {
        return tipoCuenta;
    }
    

   

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public ArrayList<Historia> getListaHistoria(){
        return Historia;
    
    }
    public String  getUsuario(){
        return usuario;
    
    }
}
