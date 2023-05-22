/*
NA CLASSE VIEW É ONDE SE DÁ A INTERAÇÃO COM O USUÁRIO.
 */
package F_encapsulamento_Ex1;

import javax.swing.JOptionPane;

public class ClienteVIEW {
    public static void main(String[] args) {
        ClienteDTO clienteDTO = new ClienteDTO();
        ClienteDAO clienteDAO = new ClienteDAO();
        
        String nome, rg;
        int idade;
        
        clienteDTO.setNome(JOptionPane.showInputDialog("Digite o nome: "));
        clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
        clienteDTO.setRg(JOptionPane.showInputDialog("Digite o RG: "));
        
        JOptionPane.showMessageDialog(null, clienteDAO.mostraNomeRg(clienteDTO));
        JOptionPane.showMessageDialog(null, clienteDAO.mostraNomeIdade(clienteDTO));
    }
    
}
