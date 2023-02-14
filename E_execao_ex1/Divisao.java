/*
VAMOS CRIAR UM PROGRAMA QUE CALCULE A DIVISÃO DE UM NÚMERO.
TRATAR COM TRY-CATCH() - TRATAMENTO DE ERROS
 */
package E_execao_ex1;

public class Divisao {
    private double numero, resultado;
    
    public void calculaDivisao(double numero, double valor){
        this.numero = numero;
        try{
        
            this.resultado = this.numero / valor;
            
            System.out.println("O resultado é: " + this.resultado);
        }
        catch(Exception e){
            System.out.println("Erro: " +e.getMessage());
        }
    }
    
}
