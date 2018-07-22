
package model.bean;


public class Produto {
    private int qtd;
    private int codigo_prod;
    private String descricao_prod;
    private double preco_un_prod;
    private String pesquisa;

    public int getCodigo_prod() {
        return codigo_prod;
    }

    public void setCodigo_prod(int codigo_prod) {
        this.codigo_prod = codigo_prod;
    }

    public String getDescricao_prod() {
        return descricao_prod;
    }

    public void setDescricao_prod(String descricao_prod) {
        this.descricao_prod = descricao_prod;
    }

    public double getPreco_un_prod() {
        return preco_un_prod;
    }

    public void setPreco_un_prod(double preco_un_prod) {
        this.preco_un_prod = preco_un_prod;
    }

    

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }


    
    
    @Override
    public String toString() {
        return "Produto{" + "descricao_prod=" + descricao_prod + '}';
    }

 
    
    
    
}
