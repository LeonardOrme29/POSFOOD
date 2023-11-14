/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consultas;

import BD.ConexionOracle;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oracle.sql.DATE;

/**
 *
 * @author leonardo.ormeno
 */
public class Empleado {
    protected ConexionOracle conex;
    protected Connection ccon;
    //datos del login empleado
    private String user;
    private String pass;
     //datos del empleado
    private String id_empleado;
    private String dni;
    private String nombre;
    private String apellido_p;
    private String apellido_m;
    private String celular;
    private String f_nacimiento;
    private String sexo;
    private String rol;
    private String name_concat;
    private String estado;

    public Empleado(String user, String pass){
        this.user=user;
        this.pass=pass;
        conex=new ConexionOracle();
        ccon=conex.conectar();
    }
    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public Connection getCcon() {
        return ccon;
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public String getApellido_m() {
        return apellido_m;
    }

    public String getCelular() {
        return celular;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getRol() {
        return rol;
    }

    public String getName_concat() {
        return name_concat;
    }

    public String getEstado() {
        return estado;
    }
    
    public void initEmpleado(){
        String sSQL="";
        try{
            sSQL="SELECT e.* FROM login l JOIN empleado e ON l.id_empleado=e.id_empleado WHERE l.usuario='"+user+"'";
            Statement cn=ccon.createStatement();
            ResultSet res=cn.executeQuery(sSQL);
            while(res.next()){
                id_empleado=res.getString("id_empleado");
                dni=res.getString("dni");
                nombre=res.getString("nombre");
                apellido_p=res.getString("apellido_p");
                apellido_m=res.getString("apellido_m");
                celular=res.getString("celular");
                f_nacimiento=res.getString("f_nacimiento");
                sexo=res.getString("sexo");
                rol=res.getString("rol");
                name_concat=res.getString("name_concat");
                estado=res.getString("estado");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public boolean authUser(){
        String sSQL="";
        String contra="";
        try{
            sSQL="SELECT pass FROM Login WHERE usuario='"+user+"'";
            Statement cn=ccon.createStatement();
            ResultSet res=cn.executeQuery(sSQL);
            while(res.next()){
                contra=res.getString("pass");
            }
        }catch(SQLException e){
        }
        System.out.println(contra);
        if(contra.equals(pass)){
            return true;
        }else{
            return false;
        }
    }
    public boolean authUser(String password){
        String sSQL="";
        String usuarioaux="";
        try{
            sSQL="SELECT usuario FROM Login WHERE pass='"+password+"'";
            Statement cn=ccon.createStatement();
            ResultSet res=cn.executeQuery(sSQL);
            while(res.next()){
                usuarioaux=res.getString("usuario");
            }
        }catch(SQLException e){
        }
        if(usuarioaux.equals(user)){
            return true;
        }else{
            return false;
        }
    }
    public ArrayList<String> dnis(){
        ArrayList<String> ArrayDNI = new ArrayList<>();
        String sSQL="";
        try{
            sSQL="SELECT * FROM EMPLEADO";
            Statement cn=ccon.createStatement();
            ResultSet res=cn.executeQuery(sSQL);
            while(res.next()){
                ArrayDNI.add(res.getString("DNI"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return ArrayDNI;
    }
    public ArrayList<String> nombres(){
        ArrayList<String> ArrayDNI = new ArrayList<>();
        String sSQL="";
        try{
            sSQL="SELECT * FROM EMPLEADO";
            //Connection ccon=conex.conectar();
            Statement cn=ccon.createStatement();
            ResultSet res=cn.executeQuery(sSQL);
            while(res.next()){
                ArrayDNI.add(res.getString("NOMBRE"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return ArrayDNI;
    }
    public static void main(String[] args){
        Empleado e= new Empleado("LOrmeño","LOrm");
        System.out.println(e.getPass());
        System.out.println(e.getUser());
        System.out.println(e.authUser());
    }
}
