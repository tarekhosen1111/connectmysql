/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connectmysql;

import com.sun.jdi.connect.spi.Connection;
import java.awt.Component;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 *
 * @author tarek
 */
public class Connectmysql {

    private static Component parentComponent;

   public static Connection connectmysql(){
       try{
          String username="root";
          String password="1234";
          String sql="jdbc:mysql://localhost:3306/mysqltonetbeans";
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn= (Connection) DriverManager.getConnection(sql,username,password);
          return conn;
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
       return null;
   }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Connected");
    }
    
}
