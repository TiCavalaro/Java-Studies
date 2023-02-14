/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G_polimorfismo_Ex1;

public class ClienteDAO {
    
    public String verifica(int idade){
        if(idade >=18){
            return "\nMaior de idade";
        }else
            return "\nMenor de idade";
    }
    
    public String verifica(double altura){
        if(altura>=1.50){
            return "\nPode entrar no brinquedo";
        }else
            return "\nNão pode entrar no brinquedo";
    }
    
    public String mostraDados(ClienteDTO clienteDTO){
        return "O nome do cliente: " + clienteDTO.getNome() + "\nRG: " + clienteDTO.getRg() + verifica(clienteDTO.getIdade()) + 
                verifica(clienteDTO.getAltura());
    }
}
