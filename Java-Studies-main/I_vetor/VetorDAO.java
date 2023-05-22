/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_vetor;

public class VetorDAO {
    int[] n1 = new int[5];
    String resposta = "";
    
    public String imprimeVetor(VetorDTO vetorDTO){
        n1 = vetorDTO.getVetor();
        
        for(int i=0; i<=4; i++){
            this.resposta += n1[i] + " ";
        }
        
        return this.resposta;
    }
}
