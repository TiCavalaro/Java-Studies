/*
 VOCE ESTEJA FAZENDO UM TRABALHO DE CLASSIFICACAO DE SOLO APOS COLHER UMA 
 AMOSTRA E VERIFICAR A PONTUACAO DE REFERENTE A PRESENCA DE AGUA NO SOLO O 
 PROGRAMA DEVERA CLASSIFICAR DA SEGUINTE FORMA:
 ROCHOSA - SE MENOR OU IGUAL A 10
 FIRME - SE FOR MAIOR QUE 10 PONTOS E MENOR OU IGUAL A 40 PONTOS
 PANTANOSA - SE MAIOR QUE 40 PONTOS OU MENOR OU IGUAL A 80 PONTOS
 CASO SEJA MAIOR QUE 80 PONTOS ESCREVER A MENSAGEM:
 "QUANTIDADE DE AGUA INVALIDA!!"
 */
package A_introducao5;

/**
 *
 * @author Aluno
 */
public class Solo {
    
    private int pontos;
    private String classificacao;
    
    public String situacaoSolo(int pontos){
        this.pontos = pontos;
        
        if(this.pontos <= 10){
            this.classificacao = "Rochosa";
        }
        else if ((this.pontos > 10) && (this.pontos <= 40)){
            this.classificacao = "Firme";
        }
        else if ((this.pontos > 40) && (this.pontos <= 80)){
            this.classificacao = "Pantanosa";
        }
        else if (this.pontos > 80){
            this.classificacao = "Quantidade de água inválida!!";
        }
        
        return "A situação do solo está " + this.classificacao + ".";
    }
    
    
    
}
