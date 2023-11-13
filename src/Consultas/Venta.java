/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consultas;

import java.util.ArrayList;

/**
 *
 * @author leonardo.ormeno
 */
public class Venta {
    protected ArrayList<Producto> listP;
    public Venta(){
        
    }
    public void addProductos(Producto p){
        listP.add(p);
    }
}
