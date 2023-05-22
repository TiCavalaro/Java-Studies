package br.com.projeto_petshop.dao;

import br.com.projeto_petshop.dto.AnimalDTO;
import br.com.projeto_petshop.dto.ClienteDTO;
import br.com.projeto_petshop.dto.VendaDTO;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JTable;


public class VendaDAO {
    private ResultSet rs = null;
    Statement stmt = null;
    Statement stmt1 = null;
    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
    
    public VendaDAO() {
    }
    
    public boolean inserirVenda(VendaDTO vendaDTO, ClienteDTO clienteDTO, AnimalDTO animalDTO, JTable servicos) {
        try {
            ConexaoDAO.ConectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            stmt1 = ConexaoDAO.con.createStatement();
            
            String comando1 = "INSERT INTO venda (dataVenda, valorVenda, idCliente) "
                    + "VALUES ( "
                    + "to_date('" + date.format(vendaDTO.getDataVenda()) + "', 'DD/MM/YYYY'), "
                    + vendaDTO.getValorVenda() + ", "
                    + clienteDTO.getIdCliente() + ")";
            stmt.execute(comando1.toUpperCase(), Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            rs.next();
            
            for(int cont=0; cont < servicos.getRowCount(); cont++) {
                String comando2 = "INSERT INTO servicoVenda (idVenda, idAnimal, idServico, valorServico) "
                        + "VALUES ( "
                        + rs.getInt("idVenda") + ", "
                        + animalDTO.getIdAnimal() + ", "
                        + servicos.getValueAt(cont, 0) + ", "
                        + servicos.getValueAt(cont, 2) + "); ";
                
                stmt1.execute(comando2);
            }
            
            ConexaoDAO.con.commit();
            
            stmt.close();
            stmt1.close();
            rs.close();
            
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }
}
