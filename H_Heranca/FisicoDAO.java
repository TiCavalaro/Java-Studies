/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Heranca;

public class FisicoDAO extends ClienteDAO{
    
    public String mostraDadosFisico(FisicoDTO fisicoDTO){
        
        return "PESSOA FÍSICA\n" + this.mostraDados(fisicoDTO) + "\nRG: " + fisicoDTO.getRg() + "\nCPF: " + fisicoDTO.getCpf();
        
    }
    
}
