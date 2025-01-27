/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.io.Serializable;
import java.util.ArrayList;
/**
 * 
 *
 * @author Jhonny
 */
public class Cliente implements Serializable {
    public String nombre;
    public String apellido;
    public int ci;
    public String direccion;
    public int telefono;
    public String usuario;
    public String contraseña;
    public ArrayList <Cuenta> listaCuentas;
    public  Cliente (String nombre,String apellido,int ci,String direccion,int telefono,String usuario,String contraseña){
        
        this.nombre= nombre;
        this.apellido=apellido;
        this.ci=ci;
        this.direccion=direccion;
        this.telefono =telefono;
        this.usuario=usuario;
        this.contraseña=contraseña;
        listaCuentas=new ArrayList();
    
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

   
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
