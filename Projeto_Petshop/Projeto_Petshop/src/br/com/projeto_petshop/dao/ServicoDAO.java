package br.com.projeto_petshop.dao;

import java.sql.*;
import br.com.projeto_petshop.dto.ServicoDTO;

public class ServicoDAO {
    
    public ServicoDAO() {
    }
    
    private ResultSet rs = null;
    private Statement stmt = null;
    
    public boolean inserirServico(ServicoDTO servicoDTO) {
        try {
            
            ConexaoDAO.ConectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "INSERT INTO servico (tituloServico, valorServico) "
                    + "VALUES ( "
                    + "'" + servicoDTO.getTituloServico() + "', "
                    + servicoDTO.getValorServico() + ") ";
            
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
    
    public boolean alterarServico(ServicoDTO servicoDTO) {
        try {
            
            ConexaoDAO.ConectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "UPDATE servico SET "
                    + "tituloServico = '" + servicoDTO.getTituloServico() + "', "
                    + "valorServico = " + servicoDTO.getValorServico() + " "
                    + "WHERE idServico = " + servicoDTO.getIdServico();
            
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
    
    public boolean excluirServico(ServicoDTO servicoDTO) {
        try {
            ConexaoDAO.ConectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "DELETE FROM servico WHERE idServico = "
                    + servicoDTO.getIdServico();
            
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
    
    public ResultSet consultarServico(ServicoDTO servicoDTO, int opcao) {
        try {
            ConexaoDAO.ConectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "";
            
            switch (opcao) {
                case 1:
                    comando = "SELECT s.* "
                            + "FROM servico s "
                            + "WHERE s.tituloServico ilike '" + servicoDTO.getTituloServico() + "%' "
                            + "ORDER BY s.tituloServico";
                    break;
                case 2:
                    comando = "SELECT s.* "
                            + "FROM servico s "
                            + "WHERE s.idServico = " + servicoDTO.getIdServico();
                    break;
                    
            }
            
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return rs;
        }
    }
}
