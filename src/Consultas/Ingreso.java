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
import java.time.LocalDate;

/**
 *
 * @author leonardo.ormeno
 */
public class Ingreso {
    public static void main(String[] args){
        /*
        String sSQL="";
        ConexionOracle conex=new ConexionOracle();
        String dni="88888888";
        try{
            sSQL="SELECT DISTINCT e.dni FROM asistencia_empleados ae JOIN empleado e ON ae.id_empleado = e.id_empleado WHERE TO_DATE(ae.dia, 'YYYY-MM-DD') = TO_DATE('23-11-10', 'YYYY-MM-DD')";
            String prueba="SELECT * FROM empleado";
            Connection con=conex.conectar();
            Statement cn=con.createStatement();
            ResultSet res=cn.executeQuery(sSQL);
            while(res.next()){
                System.out.println(res.getString("dni"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }*/
        LocalDate fechaDia = LocalDate.now();
        System.out.println(fechaDia.toString().getClass());
        System.out.println(fechaDia.toString());
    }
}
