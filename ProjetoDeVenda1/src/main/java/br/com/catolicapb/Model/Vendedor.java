package br.com.catolicapb.Model;

public class Vendedor {
    public String nome;
    public String codigoDoVendedor;

    public Vendedor(
            String nome,
            String codigoDoVendedor
    ){
        this.nome = nome;
        this.codigoDoVendedor = codigoDoVendedor;
    }

    @Override
    public String toString() {
        String texto = String.format("Vendedor: nome=%s, codigo=%s",nome,codigoDoVendedor);
        return texto;
    }
}
