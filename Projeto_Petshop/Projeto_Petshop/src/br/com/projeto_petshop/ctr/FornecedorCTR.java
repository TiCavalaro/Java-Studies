package br.com.projeto_petshop.ctr;

import java.sql.ResultSet;
import br.com.projeto_petshop.dto.AnimalDTO;
import br.com.projeto_petshop.dao.AnimalDAO;
import br.com.projeto_petshop.dao.ConexaoDAO;

public class FornecedorCTR {
    AnimalDAO fornecedorDAO = new AnimalDAO();
    
    public FornecedorCTR() {
    }
    
    public String inserirFornecedor(AnimalDTO fornecedorDTO) {
        try {
            if (fornecedorDAO.inserirFornecedor(fornecedorDTO)) {
                return "Fornecedor cadastrado com sucesso!";
            } else {
                return "Fornecedor não cadastrado!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fornecedor não cadastrado!";
        }
    }
    
    public String alterarFornecedor(AnimalDTO fornecedorDTO) {
        try {
            if(fornecedorDAO.alterarFornecedor(fornecedorDTO)) {
                return "Fornecedor alterado com sucesso!";
            } else {
                return "Fornecedor não alterado!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fornecedor não alterado!";
        }
    }
    
    public String excluirFornecedor(AnimalDTO fornecedorDTO) {
        try {
            if (fornecedorDAO.excluirFornecedor(fornecedorDTO)) {
                return "Fornecedor excluído com sucesso!";
            } else {
                return "Fornecedor não excluído!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fornecedor não excluído!";
        }
    }
    
    public ResultSet consultarFornecedor(AnimalDTO fornecedorDTO, int opcao) {
        ResultSet rs = null;
        
        rs = fornecedorDAO.consultarFornecedor(fornecedorDTO, opcao);
        return rs;
    }
    
    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
    
}
