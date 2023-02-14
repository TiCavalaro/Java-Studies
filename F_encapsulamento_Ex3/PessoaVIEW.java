/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_encapsulamento_Ex3;

import javax.swing.JOptionPane;

public class PessoaVIEW {
    public static void main(String[] args) {
        PessoaDTO pessoaDTO = new PessoaDTO();
        PessoaDAO pessoaDAO = new PessoaDAO();
        
        try{
        
        pessoaDTO.setNome(JOptionPane.showInputDialog("Informe o nome: "));
        pessoaDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: ")));
        
        JOptionPane.showMessageDialog(null, pessoaDAO.mostrarDados(pessoaDTO));
        JOptionPane.showMessageDialog(null, pessoaDAO.verificaIdade(pessoaDTO));    
        }
        catch(Exception e){
            System.out.println("Erro: " +e.getMessage());
        }
    }
    
}
