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
public class Historia implements Serializable{
    public String fecha ;
    public  String descripcion;
    public String monto;
    public String destinatario;
    public int  cuentadestinatario ;
    public Historia(String fecha ,String descripcion,String monto,String destinatario,int cuentadestinario){
    this.fecha=fecha;
    this.descripcion=descripcion;
    this.monto=monto;
    this.cuentadestinatario=cuentadestinario;
    this.destinatario=destinatario;
    
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    // Getter para fecha
    public String getDestinatario() {
        return destinatario;
    }
    public int  getCuenta() {
        return cuentadestinatario;
    }
    public String getFecha() {
        return fecha;
    }
    
    // Setter para descripcion
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // Getter para descripcion
    public String getDescripcion() {
        return descripcion;
    }
    
    // Setter para monto
    public void setMonto(String monto) {
        this.monto = monto;
    }
    
    // Getter para monto
    public String getMonto() {
        return monto;
    }
}
