package br.com.catolicapb.Model;

public class Venda {
    // cliente, produto, quantidade, valorTotal
    // calculo do valor total
    public Vendedor vendedor;
    public Cliente cliente;
    public Produto produto;
    public int quantidade;
    public double valorTotalVenda;

    public Venda(
            Cliente cliente,
            Produto produto,
            int quantidade,
            Vendedor vendedor
    ){
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotalVenda = this.calcularValor(this.quantidade, this.produto.preco);
        this.vendedor = vendedor;

    }

    public double calcularValor(int quantidade, double preco){
        double valor = quantidade * preco;
        System.out.println(valor);
        return valor;
    }

    @Override
    public String toString() {
        String texto = String.format("Cliente %s comprou %s %s por R$%s, código do funcionário=%s", this.cliente.nome,this.quantidade, this.produto.nome,this.valorTotalVenda,this.vendedor.codigoDoVendedor);
        return texto;
    }
}
