package br.com.projeto_petshop.dao;

import java.sql.*;
import br.com.projeto_petshop.dto.AnimalDTO;
import br.com.projeto_petshop.dto.ClienteDTO;

public class AnimalDAO {
    
    public AnimalDAO() {
    }
    
    // Atributo do tipo ResultSet utilizado para realizar consultas
    private ResultSet rs = null;
    // Manipular o banco de dados
    private Statement stmt = null;
    
    AnimalDTO animalDTO = new AnimalDTO();
    
    public boolean inserirAnimal(AnimalDTO animalDTO, ClienteDTO clienteDTO) {
        try {
            //Abrir DB
            ConexaoDAO.ConectDB();
            // Statement para executar algo no DB
            stmt = ConexaoDAO.con.createStatement();
        
            String comando = "INSERT INTO animal (nomeAnimal, sexoAnimal, racaAnimal, idCliente) "
                + "VALUES ( "
                + "'" + animalDTO.getNomeAnimal()+ "', "
                + "'" + animalDTO.getSexoAnimal()+ "', "
                + "'" + animalDTO.getRacaAnimal()+ "', "
                + clienteDTO.getIdCliente() + "); ";
            
            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        finally {
            ConexaoDAO.CloseDB();
        }
    }
    
    public boolean alterarAnimal(AnimalDTO animalDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "UPDATE animal SET "
                    + "nomeAnimal = '" + animalDTO.getNomeAnimal() + "', "
                    + "sexoAnimal = '" + animalDTO.getSexoAnimal() + "', "
                    + "racaAnimal = '" + animalDTO.getRacaAnimal() + "' "
                    + "WHERE idAnimal = " + animalDTO.getIdAnimal();
            
            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }
    
    public ResultSet consultarAnimal(AnimalDTO animalDTO, int opcao) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "";
            
            switch(opcao) {
                case 1:
                    comando = "SELECT a.idAnimal, a.nomeAnimal "
                            + "FROM animal a "
                            + "WHERE a.nomeAnimal ilike '" + animalDTO.getNomeAnimal()+ "%' "
                            + "ORDER BY a.nomeAnimal";
                    break;
                case 2:
                    comando = "SELECT a.* "
                            + "FROM animal a "
                            + "WHERE a.idAnimal = " + animalDTO.getIdAnimal();
                    break;
                case 3:
                    comando = "SELECT a.* "
                            + "FROM animal a";
                    break;
                    
            }
            
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return rs;
        }
    }
    
    public boolean excluirAnimal(AnimalDTO animalDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "DELETE FROM animal WHERE idAnimal = " + animalDTO.getIdAnimal();
            
            stmt.execute(comando);
            ConexaoDAO.con.commit();
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
