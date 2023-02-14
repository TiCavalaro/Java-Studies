/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Heranca;

public class ClienteDAO {
    
    public String mostraDados(ClienteDTO clienteDTO){
        
        return "Nome: " + clienteDTO.getNome() + "\nEndereço: " + clienteDTO.getEndereco() + 
                "\nNúmero: " + clienteDTO.getNumero() + "\nCidade: " + clienteDTO.getCidade() + 
                 "\nEstado: " + clienteDTO.getEstado();
        
    }
    
}
