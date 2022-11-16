package com.api_visitor_crud.visitor_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {

    public static String status = "Não conectou...";

    public static Connection ConexaoMySQclient(String serverName, String myDatabase, String userName, String password) throws ClassNotFoundException {

        Connection conn = null;
        String driverName = "com.mysql.cj.jdbc.Driver";
        Class.forName(driverName);
        String url = "jdbc:mysql://" + serverName + "/" + myDatabase;

        try{
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Conexão Funcionando");
        }catch (SQLException e){
            System.err.println("Erro na conexão");
        }

        return conn;
    }


}
