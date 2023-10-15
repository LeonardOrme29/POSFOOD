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
        conectar();
    }
    private void conectar(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            url="jdbc:oracle:thin:@localhost:1521:XE";
            user="userUno";
            pass="rootUser";
            con=DriverManager.getConnection(url,user,pass);
            System.err.println("SE CONECTO");
            System.err.println("Siuuuuu");
        }catch(Exception e){
            System.out.println("ERROR AL CONECTAR"+" "+e);
        }
    }
    public void desconectar(){
        
    }
}
