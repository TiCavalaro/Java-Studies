package br.com.projeto_petshop.ctr;

import java.sql.*;
import br.com.projeto_petshop.dto.AnimalDTO;
import br.com.projeto_3.dto.ProdutoDTO;
import br.com.projeto_petshop.dao.ServicoDAO;
import br.com.projeto_petshop.dao.ConexaoDAO;

public class ProdutoCTR {
    
    ServicoDAO produtoDAO = new ServicoDAO();
    
    public ProdutoCTR() {
        
    }
    
    public String inserirProduto(ProdutoDTO produtoDTO, AnimalDTO fornecedorDTO) {
        try {
            if (produtoDAO.inserirProduto(produtoDTO, fornecedorDTO)) {
                return "Produto cadastrado com sucesso!";
            } else {
                return "Produto não cadastrado!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Produto não cadastrado...";
        }
    }
    
    public String alterarProduto(ProdutoDTO produtoDTO, AnimalDTO fornecedorDTO) {
        try {
            if (produtoDAO.alterarProduto(produtoDTO, fornecedorDTO)) {
                return "Produto alterado com sucesso!";
            } else {
                return "Produto não alterado!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Produto não alterado...";
        }
    }
    
    public String excluirProduto(ProdutoDTO produtoDTO) {
        try {
            if(produtoDAO.excluirProduto(produtoDTO)) {
                return "Produto excluído com sucesso!";
            } else {
                return "Produto não excluído!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Produto não excluído...";
        }
    }
    
    public ResultSet consultarProduto(ProdutoDTO produtoDTO, int opcao) {
        ResultSet rs = null;
        
        rs = produtoDAO.consultarProduto(produtoDTO, opcao);
        
        return rs;
    }
    
    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
}
