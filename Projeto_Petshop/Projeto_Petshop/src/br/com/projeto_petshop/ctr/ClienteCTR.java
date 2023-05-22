package br.com.projeto_petshop.ctr;

import java.sql.ResultSet;
import br.com.projeto_petshop.dto.ClienteDTO;
import br.com.projeto_petshop.dao.ClienteDAO;
import br.com.projeto_petshop.dao.ConexaoDAO;

public class ClienteCTR {
    
    ClienteDAO clienteDAO = new ClienteDAO();
    
    public ClienteCTR() {
        
    }
    
    public String inserirCliente(ClienteDTO clienteDTO) {
        try {
            if(clienteDAO.inserirCliente(clienteDTO)) {
                return "Cliente Cadastrado com Sucesso!!!";
            } else {
                return "Cliente NÃO Cadastrado!!!";
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Cliente NÃO Cadastrado";
        }
    }
    
    public ResultSet consultarCliente(ClienteDTO clienteDTO, int opcao) {
        // É criado um atributo do tipo ResultSet, pois este método recebe o resultado de uma consulta
        ResultSet rs = null;
        // O atributo rs recebe a consulta realizada pelo método da classe DAO
        rs = clienteDAO.consultarCliente(clienteDTO, opcao);
        
        return rs;
    }
    
    public String alterarCliente(ClienteDTO clienteDTO) {
        try {
            // Chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if (clienteDAO.alterarCliente(clienteDTO)) {
                return "Cliente Alterado com Sucesso!!!";
            } else {
                return "Cliente NÃO Alterado!!!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Cliente NÃO Alterado!!!";
        }
    }
    
    public String excluirCliente(ClienteDTO clienteDTO) {
        try {
            // Chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if (clienteDAO.excluirCliente(clienteDTO)) {
                return "Cliente Excluído com Sucesso!!!";
            } else {
                return "Cliente NÃO Excluído!!!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Cliente NÃO Excluído!!!";
        }
    }
    
    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
}
