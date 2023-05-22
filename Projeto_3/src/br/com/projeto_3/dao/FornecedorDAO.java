package br.com.projeto_3.dao;

import java.sql.*;
import br.com.projeto_3.dto.FornecedorDTO;
import java.text.SimpleDateFormat;

public class FornecedorDAO {   
    
    public FornecedorDAO() {
    }
    
    SimpleDateFormat data_format = new SimpleDateFormat("dd/mm/yyyy");
    // Atributo do tipo ResultSet utilizado para realizar consultas
    private ResultSet rs = null;
    // Manipular o banco de dados
    private Statement stmt = null;
    
    FornecedorDTO fornecedorDTO = new FornecedorDTO();
    
    public boolean inserirFornecedor(FornecedorDTO fornecedorDTO) {
        try {
            //Abrir DB
            ConexaoDAO.ConectDB();
            // Statement para executar algo no DB
            stmt = ConexaoDAO.con.createStatement();
        
            String comando = "INSERT INTO fornecedor (nome_for, cnpj_for, tel_for, data_cad_for) "
                + "VALUES ( "
                + "'" + fornecedorDTO.getNome_for() + "', "
                + "'" + fornecedorDTO.getCnpj_for() + "', "
                + "'" + fornecedorDTO.getTel_for() + "', "
                + "to_date('" + data_format.format(fornecedorDTO.getData_cad_for()) + "', 'dd/mm/yyyy')"
                + "); ";
            
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
    
    public boolean alterarFornecedor(FornecedorDTO fornecedorDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "UPDATE fornecedor SET "
                    + "nome_for = '" + fornecedorDTO.getNome_for() + "', "
                    + "cnpj_for = '" + fornecedorDTO.getCnpj_for() + "', "
                    + "tel_for = '" + fornecedorDTO.getTel_for() + "', "
                    + "data_cad_for = to_date('" + data_format.format(fornecedorDTO.getData_cad_for()) + "','dd/mm/yyyy') "
                    + "WHERE id_for = " + fornecedorDTO.getId_for();
            
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
    
    public ResultSet consultarFornecedor(FornecedorDTO fornecedorDTO, int opcao) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "";
            
            switch(opcao) {
                case 1:
                    comando = "SELECT f.id_for, f.nome_for "
                            + "FROM fornecedor f "
                            + "WHERE f.nome_for ilike '" + fornecedorDTO.getNome_for() + "%' "
                            + "ORDER BY f.nome_for";
                    break;
                case 2:
                    comando = "SELECT f.nome_for, f.cnpj_for, f.tel_for, to_char(f.data_cad_for, 'dd/mm/yyyy') as data_cad_for "
                            + "FROM fornecedor f "
                            + "WHERE f.id_for = " + fornecedorDTO.getId_for();
                    break;
                case 3:
                    comando = "SELECT f.nome_for, f.cnpj_for, f.tel_for, to_char(f.data_cad_for, 'dd/mm/yyyy') as data_cad_for "
                            + "FROM fornecedor f";
                    break;
                    
            }
            
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return rs;
        }
    }
    
    public boolean excluirFornecedor(FornecedorDTO fornecedorDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "DELETE FROM fornecedor WHERE id_for = " + fornecedorDTO.getId_for();
            
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
