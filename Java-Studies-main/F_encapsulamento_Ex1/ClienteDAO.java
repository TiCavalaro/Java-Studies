/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_encapsulamento_Ex1;

public class ClienteDAO {
    public String mostraNomeRg(ClienteDTO clienteDTO){
        return "O nome é: " + clienteDTO.getNome() + " e o RG é: " + clienteDTO.getRg() + ".";
    }
    
    public String mostraNomeIdade(ClienteDTO clienteDTO){
        return "O nome é: " + clienteDTO.getNome() + " e a idade é: " + clienteDTO.getIdade() + " anos.";
    }
}
