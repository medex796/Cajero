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
public class Principal implements Serializable {
     public ArrayList <Cuenta> listaCuenta ;
    public ArrayList <Cliente> listaCliente ;
    
    public Principal (){
    listaCuenta=new ArrayList ();
     listaCliente=new ArrayList ();
    
    }
    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaClientes) {
        this.listaCliente = listaClientes;
    }
    public ArrayList<Cuenta> getListaCuenta() {
        return listaCuenta;
    }

    public void setListaCuenta(ArrayList<Cuenta> listaClientes) {
        this.listaCuenta = listaClientes;
    }
}
