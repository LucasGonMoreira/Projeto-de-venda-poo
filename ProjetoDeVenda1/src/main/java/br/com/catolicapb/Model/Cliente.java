package br.com.catolicapb.Model;

public class Cliente {

    public String nome;
    private String cpf;
    public Endereco endereco;
    public String telefone;
    public Data nascimento;

    public Cliente(
            String nome,
            String cpf,
            Endereco ondeMora,
            String telefone,
            Data dataNascimento
    ){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = ondeMora;
        this.telefone = telefone;
        this.nascimento = dataNascimento;
    }

    @Override
    public String toString() {
        String texto = String.format("<Pessoa: nome=%s, telefone=%s>", this.nome, this.telefone);
        return texto;
    }
}
