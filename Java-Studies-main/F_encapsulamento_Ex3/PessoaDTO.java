/*
CRIAR UM MODELO MVC PARA RECEBER O NOME E A IDADE DE UMA PESSOA.
CRIE OS GETTERS E SETTERS. NO DAO CRIE UM MÉTODO P/ MOSTRAR OS VALORES E OUTRO
P/ MOSTRAR SE A PESSOA É MENOR/MAIOR. CRIE O VIEW P/ RECEBER E CHAMAR OS MÉTODOS
PARA MOSTRAR.
 */
package F_encapsulamento_Ex3;

public class PessoaDTO {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
