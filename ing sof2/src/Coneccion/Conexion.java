/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coneccion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Squall
 */
public class Conexion {
    private Connection cnn;  

    public Conexion() {
            try {
                cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cine?zeroDateTimeBehavior=convertToNull","root","");
                Class.forName("com.mysql.jdbc.Driver");
                } catch (SQLException | ClassNotFoundException ex) {
                System.out.println("LOG: problema de conexion");
                }
    }

    public Connection getCnn() {
        return cnn;
    }

    public void setCnn(Connection cnn) {
        this.cnn = cnn;
    }
      public void CerarConexion(){
          try {
              this.cnn.close();
              this.cnn = null;
          } catch (SQLException ex) {
              Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
}

    

