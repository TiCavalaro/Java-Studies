package br.com.projeto_despesa.dao;

import java.sql.*;
import br.com.projeto_despesa.dto.DespesaDTO;

public class DespesaDAO {
    
    public DespesaDAO() {
        
    }
    
    private ResultSet rs = null;
    private Statement stmt = null;
    
    public boolean inserirDespesa(DespesaDTO despesaDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "INSERT INTO Despesa (descricao, valor, data, conta, categoria, situacao, anotacao) "
                    + "VALUES ( "
                    + "'" + despesaDTO.getDescricao() + "', "
                    + "'" + despesaDTO.getValor() + "', "
                    + "'" + despesaDTO.getData() + "', "
                    + "'" + despesaDTO.getConta() + "', "
                    + "'" + despesaDTO.getCategoria() + "', "
                    + "'" + despesaDTO.getSituacao() + "', "
                    + "'" + despesaDTO.getAnotacao() + "') ";
            
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
    
    public ResultSet consultarDespesa(DespesaDTO despesaDTO, int opcao) {
        try {
 
            ConexaoDAO.ConectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "";
            
            switch (opcao) {
                case 1:
                    comando = "SELECT d.* " +
                              "FROM Despesa d " +
                              "WHERE descricao LIKE '" + despesaDTO.getDescricao()+ "%' " +
                              "ORDER BY d.descricao";
                    break;
                case 2:
                    comando = "SELECT d.* "+
                              "FROM Despesa d " +
                              "WHERE d.id_despesa = " + despesaDTO.getId_despesa();
                    break;
                case 3:
                    comando = "SELECT d.id_despesa, d.descricao " +
                              "FROM Despesa d ";
                    break;
            }
           
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return rs;
        }
    }
    
    public boolean alterarDespesa(DespesaDTO despesaDTO) {
        try {
           
            ConexaoDAO.ConectDB();
           
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "UPDATE despesa SET "
                    + "descricao = '" + despesaDTO.getDescricao()+ "', "
                    + "valor = '" + despesaDTO.getValor()+ "', "
                    + "data = " + despesaDTO.getData()+ ", "
                    + "conta = '" + despesaDTO.getConta()+ "', "
                    + "categoria = '" + despesaDTO.getCategoria()+ "', "
                    + "situacao = '" + despesaDTO.getSituacao()+ "', "
                    + "anotacao = '" + despesaDTO.getAnotacao()+ "' "
                    + "WHERE id_despesa = " + despesaDTO.getId_despesa();
            
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
    
    public boolean excluirDespesa(DespesaDTO despesaDTO) {
        try {
            ConexaoDAO.ConectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "DELETE FROM Despesa WHERE id_despesa = "
                    + despesaDTO.getId_despesa();
            
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
