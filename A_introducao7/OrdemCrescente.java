/*
VAMOS FAZER UM PROGRAMA QUE RECEBA DOIS NÚMEROS INTEIROS DIFERENTES.
E UMA TERCEIRA VARIÁVEL DO TIPO INTEIRO QUE RECEBERÁ O VALOR 1 OU 2.
SE A ESCOLHA FOR 1 - MOSTRAR EM ORDEM CRESCENTE
SE A ESCOLHA FOR 2 - MOSTRAR EM ORDEM DECRESCENTE.
*/
package A_introducao7;


public class OrdemCrescente {
    int num1, num2;
    
    public void escolhaOrdem(int n1, int n2, int escolha){
        this.num1 = n1;
        this.num2 = n2;
        
        if(escolha == 1){
            if(this.num1 > this.num2){
                System.out.println("Crescente: " + this.num2 + ", " + this.num1);
            }
            else if(this.num2 > this.num1){
                System.out.println("Crescente: " + this.num1 + ", " + this.num2);
            }
        }
        else if(escolha == 2){
            if(this.num1 > this.num2){
                System.out.println("Decrescente: " + this.num1 + ", " + this.num2);
            }
            else if(this.num2 > this.num1){
                System.out.println("Decrescente: " + this.num2 + ", " + this.num1);
            }
        }
        else{
            System.out.println("Escolha Inválida!!!");
        }
    }
    
}
