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

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Principal {
    public static void main(String[] args) {
        Solo solo = new Solo();
        
        JOptionPane.showMessageDialog(null, solo.situacaoSolo(Integer.parseInt(JOptionPane.showInputDialog("Informe os pontos de água: "))));
        
    }
    
}
