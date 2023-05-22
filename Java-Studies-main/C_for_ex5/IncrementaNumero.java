/*
CRIE UM PROGRAMA QUE RECEBA UM NÚMERO INTEIRO, E DEPOIS RECEBA UM SEGUNDO NÚMERO INTEIRO
MAIOR QUE O PRIMEIRO.
CRIAR COM O for() O CÓDIGO PARA MOSTRAR TODOS OS NÚMEROS ENTRE O MENOR E O MAIOR,
INCLUSIVE O MAIOR E O MENOR.
CRIE O MÉTODO COM o for()
 */
package C_for_ex5;

import javax.swing.JOptionPane;

public class IncrementaNumero {
    private int num, maior, menor, i, resultado;
    
    public String verificaNumero(int maior, int menor, int i){
        this.num = num;
        this.i = i;
        
        this.maior = Integer.parseInt(JOptionPane.showInputDialog("Informe o maior número: "));
        this.menor = Integer.parseInt(JOptionPane.showInputDialog("Informe o menor número: "));
        
        for(this.i=this.menor; this.i<=this.maior; this.i++){
           
        }
        return "";
    }
    
    public String mostrarNumeros(){
        return "Os números entre o maior e o menor são: " + this.i;
    }
}
