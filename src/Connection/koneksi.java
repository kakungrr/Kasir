
package Connection;

import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection con;
    public koneksi(){
    }
    public static Connection getConnection(){
         try{
    con=DriverManager.getConnection("jdbc:mysql://localhost/resto","root","");
    }
    catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Gagal Koneksi");
    }
return con;
  }
}