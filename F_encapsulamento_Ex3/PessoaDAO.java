/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_encapsulamento_Ex3;

public class PessoaDAO {
    public String mostrarDados(PessoaDTO pessoaDTO){
        return "Nome: " + pessoaDTO.getNome() 
                + "\nIdade: " + pessoaDTO.getIdade();
    }
    
    public String verificaIdade(PessoaDTO pessoaDTO){
        if(pessoaDTO.getIdade() >= 18){
            return pessoaDTO.getNome() + " é maior de Idade";
        }else
            return pessoaDTO.getNome() + " é menor de Idade";
    }
    
}
