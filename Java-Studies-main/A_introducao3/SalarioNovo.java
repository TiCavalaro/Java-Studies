
package A_introducao3;


public class SalarioNovo {
    
    double salario, novoSalario, porcentagemAumento;
    
    public double calculaSalario(double salario, double porcentagemAumento){
    
        this.salario = salario;
        this.porcentagemAumento = porcentagemAumento;
        
        this.novoSalario = this.salario + (this.salario * porcentagemAumento/100);
        
        return this.novoSalario;
    }
    
}
