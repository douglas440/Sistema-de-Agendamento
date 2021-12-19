/*
 * To hange this license header, choose License Headers in Project Properties.
 * To hange this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultorio.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Douglas
 */
public class ConnectionFactory {
    
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/consultorio","root","dou12345");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
