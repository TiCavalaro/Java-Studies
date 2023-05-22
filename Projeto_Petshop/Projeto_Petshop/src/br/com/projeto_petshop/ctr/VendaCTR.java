package br.com.projeto_petshop.ctr;

import br.com.projeto_petshop.dao.ConexaoDAO;
import br.com.projeto_petshop.dao.VendaDAO;
import br.com.projeto_petshop.dto.VendaDTO;
import br.com.projeto_petshop.dto.ClienteDTO;
import javax.swing.JTable;


public class VendaCTR {
    VendaDAO vendaDAO = new VendaDAO();
    
    public VendaCTR() {
        
    }
    
    public String inserirVenda(VendaDTO vendaDTO, ClienteDTO clienteDTO, JTable produtos) {
        try {
            if (vendaDAO.inserirVenda(vendaDTO, clienteDTO, produtos)) {
                return "Venda Cadastrada com Sucesso!!!";
            } else {
                return "Venda NÃO Cadastrada!!!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Venda não cadastrada!";
        }
    }
    
    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
}
