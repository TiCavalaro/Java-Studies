/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G_polimorfismo_Ex1;

import javax.swing.JOptionPane;


public class ClienteVIEW {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();
        ClienteDTO clienteDTO = new ClienteDTO();
        
        int idade = 0;
        double altura = 0.0;
        try{
        clienteDTO.setNome(JOptionPane.showInputDialog("Informe o nome: "));
        clienteDTO.setRg(JOptionPane.showInputDialog("Informe o RG: "));
        clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: ")));
        clienteDTO.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: ")));
        
        JOptionPane.showMessageDialog(null, clienteDAO.mostraDados(clienteDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
}
