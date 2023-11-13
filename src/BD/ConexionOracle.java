/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author leonardo.ormeno
 */
public class ConexionOracle {
    private Connection con=null;
    private String url,user,pass;
    public ConexionOracle(){
        //conectar();
    }
    public Connection conectar(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            url="jdbc:oracle:thin:@localhost:1521:XE";
            user="userUno";
            pass="rootUser";
            con=DriverManager.getConnection(url,user,pass);
            System.err.println("SE CONECTO");
        }catch(Exception e){
            System.out.println("ERROR AL CONECTAR"+" "+e);
        }
        return con;
    }
    public void desconectar(){
        
    }
}
