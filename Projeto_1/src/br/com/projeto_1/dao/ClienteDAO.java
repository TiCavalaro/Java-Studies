package br.com.projeto_1.dao;

import java.sql.*;
import br.com.projeto_1.dto.ClienteDTO;

public class ClienteDAO {
    
    // Método construtor da classe
    public ClienteDAO() {
        
    }
    
    private ResultSet rs = null; // Atributo do tipo ResultSet utilizado para realizar consultas
    private Statement stmt = null; // Manipular o banco de dados
    
    public boolean inserirCliente(ClienteDTO clienteDTO) {
        try {
            // Chama o método que está na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "Insert into cliente (nome, logradouro, numero, bairro, cidade, estado, cep, cpf, rg) "
                    + "values ( "
                    + "'" + clienteDTO.getNome() + "', "
                    + "'" + clienteDTO.getLogradouro() + "', "
                    + clienteDTO.getNumero() + ", "
                    + "'" + clienteDTO.getBairro() + "', "
                    + "'" + clienteDTO.getCidade() + "', "
                    + "'" + clienteDTO.getEstado() + "', "
                    + "'" + clienteDTO.getCep() + "', "
                    + "'" + clienteDTO.getCpf() + "', "
                    + "'" + clienteDTO.getRg() + "') ";
            
            stmt.execute(comando.toUpperCase());
            
            ConexaoDAO.con.commit();
            
            stmt.close();
            
            return true;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        finally {
            ConexaoDAO.CloseDB();
        }
    }
    
    public ResultSet consultarCliente(ClienteDTO clienteDTO, int opcao) {
        try {
            // Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            // Cria o Statement que é responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            // Comando SQL que sera executado no banco de dados
            String comando = "";
            
            switch (opcao) {
                case 1:
                    comando = "SELECT c.* " +
                              "FROM cliente c " +
                              "WHERE nome LIKE '" + clienteDTO.getNome() + "%' " +
                              "ORDER BY c.nome";
                    break;
                case 2:
                    comando = "SELECT c.* "+
                              "FROM cliente c " +
                              "WHERE c.id_cliente = " + clienteDTO.getId_cliente();
                    break;
                case 3:
                    comando = "SELECT c.id_cliente, c.nome " +
                              "FROM cliente c ";
                    break;
            }
            // Executa o comando SQL no banco de dados
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return rs;
        }
    }
    
    public boolean alterarCliente(ClienteDTO clienteDTO) {
        try {
            // Chama o método que está na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            // Cria o Statement que é responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "UPDATE cliente SET "
                    + "nome = '" + clienteDTO.getNome() + "', "
                    + "logradouro = '" + clienteDTO.getLogradouro() + "', "
                    + "numero = " + clienteDTO.getNumero() + ", "
                    + "bairro = '" + clienteDTO.getBairro() + "', "
                    + "cidade = '" + clienteDTO.getCidade() + "', "
                    + "estado = '" + clienteDTO.getEstado() + "', "
                    + "cep = '" + clienteDTO.getCep() + "', "
                    + "cpf = '" + clienteDTO.getCpf() + "', "
                    + "rg = '" + clienteDTO.getRg() + "' "
                    + "WHERE id_cliente = " + clienteDTO.getId_cliente();
            
            // Executa o comando SQL no banco de dados
            stmt.execute(comando.toUpperCase());
            // Da um commit no banco de dados
            ConexaoDAO.con.commit();
            // Fecha o statement
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }
    
    public boolean excluirCliente(ClienteDTO clienteDTO) {
        try {
            ConexaoDAO.ConectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "DELETE FROM cliente WHERE id_cliente = "
                    + clienteDTO.getId_cliente();
            
            stmt.execute(comando);
            
            // Da um commit no banco de dados
            ConexaoDAO.con.commit();
            // Fecha o statement
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }
    
}
