/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nov3Ex9;

public class ClassificacaoDAO {
    
    public String ClassificarPessoa(ClassificacaoDTO classificacaoDTO){
        
        if(classificacaoDTO.getAlt() < 1.20){
            if(classificacaoDTO.getPeso() <= 60){
                return "Sua classificação é A!";
            }else if((classificacaoDTO.getPeso() <=90) && (classificacaoDTO.getPeso() > 60)){
                return "Sua classificação é D!";
            }else if(classificacaoDTO.getPeso() > 90){
                return "Sua classificação é G!";
            }
        }
        
        if((classificacaoDTO.getAlt() >= 1.20) && (classificacaoDTO.getAlt() <= 1.70)){
            if(classificacaoDTO.getPeso() <= 60){
                return "Sua classificação é B!";
            }else if((classificacaoDTO.getPeso() <=90) && (classificacaoDTO.getPeso() > 60)){
                return "Sua classificação é E!";
            }else if(classificacaoDTO.getPeso() > 90){
                return "Sua classificação é H!";
            }
        }
        
        if(classificacaoDTO.getAlt() > 1.70){
            if(classificacaoDTO.getPeso() <= 60){
                return "Sua classificação é C!";
            }else if((classificacaoDTO.getPeso() <=90) && (classificacaoDTO.getPeso() > 60)){
                return "Sua classificação é F!";
            }else if(classificacaoDTO.getPeso() > 90){
                return "Sua classificação é I!";
            }
        }
        return "";
    }
    
}
