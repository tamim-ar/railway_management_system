package rms;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class jconnection {
    public static Connection ConnecrDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/rms", "root", "");
            System.out.println("Connected");
            return con;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }   
    }
}
