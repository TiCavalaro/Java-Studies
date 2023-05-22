package br.com.projeto_3.dto;


public class ProdutoDTO {
    
    private String nome_prod, desc_prod, cod_bar_prod;
    private double p_custo_prod, p_venda_prod;
    private int id_prod;

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }
    
    public String getNome_prod() {
        return nome_prod;
    }

    public void setNome_prod(String nome_prod) {
        this.nome_prod = nome_prod;
    }

    public String getDesc_prod() {
        return desc_prod;
    }

    public void setDesc_prod(String desc_prod) {
        this.desc_prod = desc_prod;
    }

    public String getCod_bar_prod() {
        return cod_bar_prod;
    }

    public void setCod_bar_prod(String cod_bar_prod) {
        this.cod_bar_prod = cod_bar_prod;
    }

    public double getp_Custo_prod() {
        return p_custo_prod;
    }

    public void setp_Custo_prod(float p_custo_prod) {
        this.p_custo_prod = p_custo_prod;
    }

    public double getp_Venda_prod() {
        return p_venda_prod;
    }

    public void setp_Venda_prod(float p_venda_prod) {
        this.p_venda_prod = p_venda_prod;
    }
    
    
}
