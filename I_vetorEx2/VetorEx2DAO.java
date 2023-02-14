/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_vetorEx2;

public class VetorEx2DAO {
    int[] n1 = new int[6];
    String resposta = "";
    double media;
    
    public String imprimeVetor(VetorEx2DTO vetorEx2DTO){
        n1 = vetorEx2DTO.getVetor();
        
        for(int i=1; i<=6; i++){
            this.media += n1[i] / 6;
        }
        
        return "A média é: " + this.media;
    }
}
