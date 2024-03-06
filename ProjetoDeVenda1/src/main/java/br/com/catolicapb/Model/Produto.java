package br.com.catolicapb.Model;

public class Produto {

    // nome, descricao, código, preco e quantidade
    public String nome;
    public String descricao;
    public String codigo;
    public double preco;
    public int quantidade;

    public Produto(
            String nome,
            String descricao,
            String codigo,
            double preco,
            int quantidade){
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        String texto = "<Produto: nome=" + this.nome + ", preço=" +this.preco + ">";
        return texto;
    }
}
