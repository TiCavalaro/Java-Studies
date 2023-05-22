/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_encapsulamento_Ex2;

import javax.swing.JOptionPane;

public class FuncionarioVIEW {
    public static void main(String[] args){
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        
        try{
        String nome, telefone, cidade;
        double salario;
        
        funcionarioDTO.setNome(JOptionPane.showInputDialog("Informe o nome do funcionário: "));
        funcionarioDTO.setTelefone(JOptionPane.showInputDialog("Informe o telefone do funcionário: "));
        funcionarioDTO.setCidade(JOptionPane.showInputDialog("Informe a cidade do funcionário: "));
        funcionarioDTO.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário: ")));
        
        JOptionPane.showMessageDialog(null, funcionarioDAO.mostrarDados(funcionarioDTO));
        }
        catch(Exception e){
            System.out.println("Erro: " +e.getMessage());
        }
        
    }
    
}
