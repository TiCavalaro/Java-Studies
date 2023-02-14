/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Heranca;

public class JuridicoDAO extends ClienteDAO{
    
    public String mostraDadosJuridico(JuridicoDTO juridicoDTO){
        
        return "PESSOA JURÍDICA\n" + this.mostraDados(juridicoDTO) + "\nCNPJ: " + juridicoDTO.getCnpj() + "\nI.E: " + juridicoDTO.getIe();
        
    }
    
}
