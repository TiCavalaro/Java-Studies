package br.com.projeto_despesa.ctr;

import java.sql.ResultSet;
import br.com.projeto_despesa.dto.DespesaDTO;
import br.com.projeto_despesa.dao.DespesaDAO;
import br.com.projeto_despesa.dao.ConexaoDAO;


public class DespesaCTR {
    
    DespesaDAO despesaDAO = new DespesaDAO();
    
    public DespesaCTR() {
        
    }
    
    public String inserirDespesa(DespesaDTO despesaDTO) {
        try {
            if(despesaDAO.inserirDespesa(despesaDTO)) {
                return "Despesa cadastrada com sucesso!";
            } else {
                return "Despesa não cadastrada!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Despesa não cadastrada!";
        }
    }
    
    public ResultSet consultarDespesa(DespesaDTO despesaDTO, int opcao) {
        ResultSet rs = null;
        
        rs = despesaDAO.consultarDespesa(despesaDTO, opcao);
        
        return rs;
    }
    
    public String alterarDespesa(DespesaDTO despesaDTO) {
        try {
            if (despesaDAO.alterarDespesa(despesaDTO)) {
                return "Despesa alterada com sucesso!";
            } else {
                return "Despesa não alterada!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Despesa não alterada!";
        }
    }
    
    public String excluirDespesa(DespesaDTO despesaDTO) {
        try {
            if (despesaDAO.excluirDespesa(despesaDTO)) {
                return "Despesa excluída com sucesso!";
            } else {
                return "Despesa não excluída!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Despesa não excluída!";
        }
    }
    
    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
}
