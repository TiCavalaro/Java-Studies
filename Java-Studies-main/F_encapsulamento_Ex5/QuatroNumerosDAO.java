/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_encapsulamento_Ex5;

public class QuatroNumerosDAO {
    
    public String ordenarNumeros(QuatroNumerosDTO quatroNumerosDTO){
        
        if(quatroNumerosDTO.getN4() >= quatroNumerosDTO.getN3()){
            return "A ordem decrescente é: " + quatroNumerosDTO.getN4() + ", " + quatroNumerosDTO.getN3() + ", " + quatroNumerosDTO.getN2() + ", " + quatroNumerosDTO.getN1();
        }
        else if((quatroNumerosDTO.getN4() >= quatroNumerosDTO.getN2()) && (quatroNumerosDTO.getN4() < quatroNumerosDTO.getN3())){
            return "A ordem decrescente é: " + quatroNumerosDTO.getN3() + ", " + quatroNumerosDTO.getN4() + ", " + quatroNumerosDTO.getN2() + ", " + quatroNumerosDTO.getN1();
        }
        else if((quatroNumerosDTO.getN4() >= quatroNumerosDTO.getN1()) && (quatroNumerosDTO.getN4() < quatroNumerosDTO.getN2())){
            return "A ordem decrescente é: " + quatroNumerosDTO.getN3() + ", " + quatroNumerosDTO.getN2() + ", " + quatroNumerosDTO.getN4() + ", " + quatroNumerosDTO.getN1();
        }
        else if(quatroNumerosDTO.getN4() <= quatroNumerosDTO.getN1()){
            return "A ordem decrescente é: " + quatroNumerosDTO.getN3() + ", " + quatroNumerosDTO.getN2() + ", " + quatroNumerosDTO.getN1() + ", " + quatroNumerosDTO.getN4();
        }
        
        return "";
    }
    
}
