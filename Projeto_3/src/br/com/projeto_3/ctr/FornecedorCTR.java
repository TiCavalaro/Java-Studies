package br.com.projeto_3.ctr;

import java.sql.ResultSet;
import br.com.projeto_3.dto.FornecedorDTO;
import br.com.projeto_3.dao.FornecedorDAO;
import br.com.projeto_3.dao.ConexaoDAO;

public class FornecedorCTR {
    FornecedorDAO fornecedorDAO = new FornecedorDAO();
    
    public FornecedorCTR() {
    }
    
    public String inserirFornecedor(FornecedorDTO fornecedorDTO) {
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
    
    public String alterarFornecedor(FornecedorDTO fornecedorDTO) {
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
    
    public String excluirFornecedor(FornecedorDTO fornecedorDTO) {
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
    
    public ResultSet consultarFornecedor(FornecedorDTO fornecedorDTO, int opcao) {
        ResultSet rs = null;
        
        rs = fornecedorDAO.consultarFornecedor(fornecedorDTO, opcao);
        return rs;
    }
    
    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
    
}
