/*
NA CLASSE DTO COLOCAMOS TODAS AS VARIÁVEIS E ESSAS ESTARÃO PROTEGIDAS
NÃO HÁ ACESSO DIRETO PARA AS VARIÁVEIS. PRECISAMOS UTILIZAR OS MÉTODOS
GETTERS E SETTERS.
 */
package F_encapsulamento_Ex1;

public class ClienteDTO {
    private String nome, rg;
    private int idade;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setRg(String rg){
        this.rg = rg;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getRg(){
        return this.rg;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
}
