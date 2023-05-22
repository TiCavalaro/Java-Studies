/*
VAMOS CRIAR UM PROGRAMA PARA QUE RECEBA 3 NÚMEROS INTEIROS. E SERÃO PASSADOS POR PARÂMETROS
O PRIMEIRO SERÁ REFERENTE A OPÇÃO DE SOMA OU DIFERENÇA OS DOIS SEGUINTES SERÃO OS NÚMEROS PARA A OPERAÇÃO.
VAMOS UTILIZAR A ESTRUTURA SWITCH-CASE.
 */
package B_switch1;
                  
public class Operacao {
    //VARIÁVEIS GLOBAIS/DE CLASSE
    private int opcao, num1, num2;
    
    //MÉTODO PARA O SWITCH-CASE
    public String calcular(int opcao, int num1, int num2){
        //ASSOCIAR OS VALORES LOCAIS ATRIBUINDO AOS GLOBAIS
        this.opcao = opcao;
        this.num1 = num1;
        this.num2 = num2;
        
        //UTILIZAR O SWITCH-CASE
        switch(opcao){
            case 1:
                return "A soma é: " + (this.num1+this.num2);
            case 2:
                return "A diferença é: " + (this.num1-this.num2);
            default:
                return "Opção Inválida!";
        }
    }
}
