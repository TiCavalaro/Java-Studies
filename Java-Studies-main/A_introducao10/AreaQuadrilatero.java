/*
FAÇA UM PROGRAMA QUE CALCULE A ÁREA DE UM QUADRILÁTERO
-CRIE UM MÉTODO COM PASSAGEM DE PARÂMETRO MAS SEM RETORNO(VOID)
 */
package A_introducao10;


public class AreaQuadrilatero {
    int lado;
    
    public void calculaArea(int lado, int area){
        this.lado = lado;
        
        area = this.lado * this.lado;
        
        System.out.println("A área desse quadrilátero é: " + area);
    }
    
}
