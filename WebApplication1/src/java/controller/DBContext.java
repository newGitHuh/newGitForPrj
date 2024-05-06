/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author admin
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tucuo
 */
public class DBContext {
    String instance = "";
    String serverName = "LAPTOP-FBBG2CEA";
    String portNumber = "1433";
    String dbName = "PE_DBI202_SU23";
    String userID = "sa";
    String password = "sa";
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + "\\" + instance + ";databaseName=" + dbName;
        if (instance == null || instance.trim().isEmpty()){
         url = "jdbc:sqlserver://" + serverName + ":" + portNumber +";databaseName=" + dbName;
         }
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      // Class.forName(): Load class Driver tại thời điểm chạy.
      //"com.microsoft.sqlserver.jdbc.SQLServerDriver" là địa chỉ của Driver.
      return DriverManager.getConnection(url, userID, password);
      
    }
    public static void main(String[] args) {
        try {
            System.out.println(new DBContext().getConnection());
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
    }
}
