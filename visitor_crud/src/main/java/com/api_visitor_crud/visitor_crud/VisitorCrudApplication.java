package com.api_visitor_crud.visitor_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.util.Date;
import java.util.Scanner;

@SpringBootApplication
public class VisitorCrudApplication {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SpringApplication.run(VisitorCrudApplication.class, args);



		
		try {
			// Instancia o ServerSocket ouvindo a porta 12345
			ServerSocket servidor = new ServerSocket(12345);
			System.out.println("Servidor ouvindo a porta 12345");
			Socket cliente = servidor.accept();
			Statement s = null;
			Connection connection = ConexaoMySQL.ConexaoMySQclient("localhost:3306", "visitorapi", "root", "bcd127");
			System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());
			String listBd;
			String listName;


			while(true) {
				try{
					s = (Statement) connection.createStatement();

				}catch (SQLException e){
					e.printStackTrace();
				}


				ResultSet r = null;
				ResultSet f = null;
				try{
					 s.executeUpdate("UPDATE visitors SET status = \"VENCIDO\" WHERE DATEDIFF(now(),data_de_cadastro) > 10 " );
					s.executeUpdate("UPDATE visitors SET status = \"ATIVO\" WHERE DATEDIFF(now(),data_de_cadastro) < 10 " );
						f = s.executeQuery("SELECT * FROM visitors");
					System.out.println(r + "Teste xpto");
				}catch (SQLException e){
					e.printStackTrace();
				}
				System.out.println("***************************");
			}
		}
		catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
