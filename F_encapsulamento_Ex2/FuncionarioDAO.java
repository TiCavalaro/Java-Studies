/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_encapsulamento_Ex2;

public class FuncionarioDAO {
    public String mostrarDados(FuncionarioDTO funcionarioDTO){
        return "Nome: " + funcionarioDTO.getNome() + "\nTelefone: " + funcionarioDTO.getTelefone()
                + "\nCidade: " + funcionarioDTO.getCidade() + "\nSalário: " + funcionarioDTO.getSalario();
    }
    
}
