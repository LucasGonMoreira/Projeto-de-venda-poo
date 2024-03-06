package br.com.catolicapb.Model;

public class Endereco {
    public int numeroDaCasa;
    public String rua;
    public String bairro;
    public String cep;
    public String estadoQueMora;

    public Endereco(
            int numeroDaCasa,
            String rua,
            String bairro,
            String cep,
            String estadoQueMora
    ){
        this.numeroDaCasa = numeroDaCasa;
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.estadoQueMora = estadoQueMora;
    }
}
