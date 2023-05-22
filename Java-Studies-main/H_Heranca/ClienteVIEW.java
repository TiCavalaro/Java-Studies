/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Heranca;

import javax.swing.JOptionPane;

public class ClienteVIEW {
    public static void main(String[] args) {
        FisicoDTO fisicoDTO = new FisicoDTO();
        FisicoDAO fisicoDAO = new FisicoDAO();
        JuridicoDTO juridicoDTO = new JuridicoDTO();
        JuridicoDAO juridicoDAO = new JuridicoDAO();
        
        try{
            JOptionPane.showMessageDialog(null, "Vamos trabalhar com Pessoa Jurídica!");
            juridicoDTO.setNome(JOptionPane.showInputDialog("Informe o nome: "));
            juridicoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
            juridicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o número: ")));
            juridicoDTO.setCidade(JOptionPane.showInputDialog("Informe a cidade: "));
            juridicoDTO.setEstado(JOptionPane.showInputDialog("Informe o estado: "));
            juridicoDTO.setCnpj(JOptionPane.showInputDialog("Informe o CNPJ: "));
            juridicoDTO.setIe(JOptionPane.showInputDialog("Informe o I.E.: "));
            JOptionPane.showMessageDialog(null, juridicoDAO.mostraDadosJuridico(juridicoDTO));
            
            JOptionPane.showMessageDialog(null, "Vamos trabalhar com Pessoa Física!");
            fisicoDTO.setNome(JOptionPane.showInputDialog("Informe o nome: "));
            fisicoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
            fisicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o número: ")));
            fisicoDTO.setCidade(JOptionPane.showInputDialog("Informe a cidade: "));
            fisicoDTO.setEstado(JOptionPane.showInputDialog("Informe o estado: "));
            fisicoDTO.setRg(JOptionPane.showInputDialog("Informe o RG: "));
            fisicoDTO.setCpf(JOptionPane.showInputDialog("Informe o CPF: "));
            JOptionPane.showMessageDialog(null, fisicoDAO.mostraDados(fisicoDTO));
            JOptionPane.showMessageDialog(null, fisicoDAO.mostraDadosFisico(fisicoDTO));
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
}
