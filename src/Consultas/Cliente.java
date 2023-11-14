/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consultas;

import BD.ConexionOracle;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author leonardo.ormeno
 */
public class Cliente {
    protected ConexionOracle conex;
    protected Connection ccon;
    private String id_cliente;
    private String dniCliente;
    private String nombre;
    private String apellido_p;
    private String apellido_m;
    private String celular;
    private String f_nacimiento;
    private String sexo;
    public Cliente(String dni){
    }
    public boolean llenarCliente(String dni){
        String sSQL="";
        try{
            sSQL="SELECT * FROM cliente WHERE cliente.dni='"+dni+"'";
            Statement cn=ccon.createStatement();
            ResultSet res=cn.executeQuery(sSQL);
            if (res.getString("id_cliente") != null && !res.getString("id_cliente").isEmpty()) {
                return false;
            }else{
                id_cliente=res.getString("id_cliente");
                dniCliente=res.getString("dni");
                nombre=res.getString("nombre");
                apellido_p=res.getString("apellido_p");
                apellido_m=res.getString("apellido_m");
                celular=res.getString("celular");
                f_nacimiento=res.getString("f_nacimiento");
                sexo=res.getString("sexo");
                return true;
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return false;
    }
    public void crearCliente(String dni,String nom,String ap_p, String ap_m,String cel,String f_nac, String sex){
        String sqlIngreso="INSERT INTO cliente (id_cliente, dni, nombre, apellido_p,apellido_m, celular,f_nacimiento,sexo) VALUES (boleta_seq.NEXTVAL, '"+dni+"','"+nom+"','"+ap_p+"','"+ap_m+"','"+cel+"',TO_DATE('"+f_nac+"','YYYY-MM-DD'),'"+sexo+"')";
        try{
            Statement st=ccon.createStatement();
            st.executeQuery(sqlIngreso);
            ccon.commit();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
