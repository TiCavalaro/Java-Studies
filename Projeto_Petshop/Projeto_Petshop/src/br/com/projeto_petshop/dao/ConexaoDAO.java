package br.com.projeto_petshop.dao;

import java.sql.*;

// Classe com metodos para abrir e fechar o DB

public class ConexaoDAO {
    
    // Guardar conexao com o DB
    public static Connection con = null;
    
    public ConexaoDAO() {
        
    }
    
    public static void ConectDB() {
        try {
            // Dados para conectar com o banco
            String dsn = "projeto_petshop"; // nome do banco
            String user = "postgres"; 
            String senha = "postdba";
            
            DriverManager.registerDriver(new org.postgresql.Driver());
            
            String url = "jdbc:postgresql://localhost:5432/" + dsn;
            
            con = DriverManager.getConnection(url, user, senha);
            
            con.setAutoCommit(false);
            
            if (con == null) {
                System.out.println("Erro ao abrir o banco de dados");
            }
        } catch (Exception e) {
            System.out.println("Problema ao abrir a base de dados" + e.getMessage());
        }
    }
    
    public static void CloseDB() {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("Problema ao fechar a base de dados! " + e.getMessage());
        }
    }
}
