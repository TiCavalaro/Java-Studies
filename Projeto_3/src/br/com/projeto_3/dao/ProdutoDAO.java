package br.com.projeto_3.dao;

import java.sql.*;
import br.com.projeto_3.dto.ProdutoDTO;
import br.com.projeto_3.dto.FornecedorDTO;

public class ProdutoDAO {
    
    public ProdutoDAO() {
        
    }
    
    private ResultSet rs = null;
    
    private Statement stmt = null;
    
    public boolean inserirProduto(ProdutoDTO produtoDTO, FornecedorDTO fornecedorDTO) {
        try {
            
            ConexaoDAO.ConectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "INSERT INTO PRODUTO (nome_prod, desc_prod, cod_bar_prod, "
                    + "p_custo_prod, p_venda_prod, id_for) values ( "
                    + "'" + produtoDTO.getNome_prod() + "', "
                    + "'" + produtoDTO.getDesc_prod() + "', "
                    + "'" + produtoDTO.getCod_bar_prod() + "', "
                    + produtoDTO.getp_Custo_prod() + ", "
                    + produtoDTO.getp_Venda_prod() + ", "
                    + fornecedorDTO.getId_for() + ") ";
            
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
    
    public boolean alterarProduto(ProdutoDTO produtoDTO, FornecedorDTO fornecedorDTO) {
        try {
            
            ConexaoDAO.ConectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "UPDATE produto SET "
                    + "nome_prod = '" + produtoDTO.getNome_prod() + "', "
                    + "desc_prod = '" + produtoDTO.getDesc_prod() + "', "
                    + "cod_bar_prod = '" + produtoDTO.getCod_bar_prod() + "', "
                    + "p_custo_prod = " + produtoDTO.getp_Custo_prod() + ", "
                    + "p_venda_prod = " + produtoDTO.getp_Venda_prod() + ", "
                    + "id_for = " + fornecedorDTO.getId_for() + " "
                    + "WHERE id_prod = " + produtoDTO.getId_prod();
            
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
    
    public boolean excluirProduto(ProdutoDTO produtoDTO) {
        try {
            ConexaoDAO.ConectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "DELETE FROM produto WHERE id_prod = "
                    + produtoDTO.getId_prod();
            
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
    
    public ResultSet consultarProduto(ProdutoDTO produtoDTO, int opcao) {
        try {
            ConexaoDAO.ConectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "";
            
            switch (opcao) {
                case 1:
                    comando = "SELECT p.* "
                            + "FROM produto p "
                            + "WHERE p.nome_prod ilike '" + produtoDTO.getNome_prod() + "%' "
                            + "ORDER BY p.nome_prod";
                    break;
                case 2:
                    comando = "SELECT p.*, f.nome_for, f.id_for "
                            + "FROM produto p, fornecedor f "
                            + "WHERE p.id_for = f.id_for and "
                            + "p.id_prod = " + produtoDTO.getId_prod();
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
