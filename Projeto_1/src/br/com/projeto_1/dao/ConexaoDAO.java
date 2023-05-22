package br.com.projeto_1.dao;


import java.sql.*;

/** Essa classe contém os métodos para abrir e fechar o banco de dados **/
public class ConexaoDAO {
    
    // Criando um atributo do tipo Connection que servirá para guardar a conexão com o banco de dados
    public static Connection con = null;
    
    /** Método construtor da classe **/
    public ConexaoDAO() {
        
    }
    
    // Método que abre a conexão com o banco de dados
    public static void ConectDB() {
        try {
            // Dados para conectar com o banco de dados Postgres
            String dsn = "projeto_1"; // nome do banco de dados (igual ao criado no Postgres)
            String user = "postgres"; // nome do usuario utilizado para se conectar
            String senha = "postdba";  // senha do usuario acima informado
            
            DriverManager.registerDriver(new org.postgresql.Driver());
            
            String url = "jdbc:postgresql://localhost:5432/" + dsn;
            
            con = DriverManager.getConnection(url, user, senha);
            
            con.setAutoCommit(false);
            if(con == null) {
                System.out.println("erro ao abrir o banco");
            }
        } 
        catch (Exception e) {
            System.out.println("Problema ao abrir a base de dados! " + e.getMessage());
        }
    }
    
    /** Método que fecha a conexão com o banco de dados **/
    public static void CloseDB() {
        try {
            con.close();
        }
        catch (Exception e) {
            System.out.println("Problema ao fechar a base de dados" + e.getMessage());
        }
    }
}
