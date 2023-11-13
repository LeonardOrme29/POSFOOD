/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consultas;

/**
 *
 * @author leonardo.ormeno
 */
public class Producto {
    protected String nombre;
    protected String categoria;
    protected String desc;
    protected double precio;
    protected int cant;
    public Producto(){
    }
    public Producto(String nombre,String desc,int cant ){
        this.nombre=nombre;
        this.desc=desc;
        this.cant=cant;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDesc() {
        return desc;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCant() {
        return cant;
    }
    
}
