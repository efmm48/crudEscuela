

package conexionSQL;

//Metodo 1:

//import com.mysql.jdbc.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


//Metodo 2:
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
*/


/**
 *
 * @author djfrank48
 */

public class ConexionSQL {
    
    
    public Connection conexion;
    public Statement sentencia;
    public ResultSet resultado;
  
Connection  conectar=null;
public Connection conexion(){
    
    try {
        Class.forName("com.mysql.jdbc.Driver");
        conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/escuela","root","");
        //JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error Conexion"+e.getMessage());
    }
    
    return conectar;
}

public void DesconectarBaseDeDatos(){
    try {
        if(conectar !=null){
           conectar.close();
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error de Desconexion"+ex.getMessage());
    }
}


// Metodo 2 de conexion:
   
/*
public static boolean Conectar() {
        String url = "jdbc:mysql://localhost:3306/escuela";
        String user = "root";
        String pass = "";
        System.out.println("Conectando...");
        try {
            Escuela.Con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conectado!!");
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

*/
}

