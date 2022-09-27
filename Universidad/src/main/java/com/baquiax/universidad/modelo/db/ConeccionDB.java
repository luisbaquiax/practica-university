/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baquiax.universidad.modelo.db;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author luis
 */
public class ConeccionDB {

    private static ConeccionDB conneccionDB = null;
    private static final String URL = "jdbc:mysql://localhost:3306/universidad";
    private static final String PASSWORD = "luisbaquiax1234";
    private static final String USER = "root";

    private static Connection CONN;

    public ConeccionDB() {
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            CONN = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Ya nos conectamos a la base de datos.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Connection getConeccion() {
        if (conneccionDB == null) {
            conneccionDB = new ConeccionDB();
        }
        return CONN;
    }
}
