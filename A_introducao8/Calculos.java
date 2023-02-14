/*
FAÇA UM PROGRAMA QUE RECEBA DOIS NÚMERO REAIS.
-CRIE UM MÉTODO PARA MOSTRAR A DIVISÃO DOS DOIS NÚMEROS
-CRIE UM MÉTODO PARA MOSTRAR A MULTIPLICAÇÃO ENTRE OS DOIS NÚMEROS
CRIE OS MÉTODOS COM PASSAGEM DE PARÂMETROS E COM RETORNO DO TIPO REAL.
*/
package A_introducao8;


public class Calculos {
    double num1, num2, resultado;
    
    public double multiplicacao(double n1, double n2, double resultado){
        this.num1 = n1;
        this.num2 = n2;
        this.resultado = resultado;
        
        this.resultado = n1 * n2;
        
        System.out.println("Resultado da multiplicação: " + this.resultado);
        
        return this.resultado;
    }
    
    public double divisao(double n1, double n2, double resultado){
        this.num1 = n1;
        this.num2 = n2;
        this.resultado = resultado;

        if((this.num2 == 0) && (this.num1 == 0)){
            System.out.println("Erro no Cálculo!!!");
        }
        
        this.resultado = this.num1 / this.num2;
        
        System.out.println("Resultado da divisão: " + this.resultado);
        
        return this.resultado;
    }
}
