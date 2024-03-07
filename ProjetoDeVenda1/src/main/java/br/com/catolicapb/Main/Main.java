package br.com.catolicapb.Main;

import br.com.catolicapb.Model.*;

public class Main {

    public static void main(String[] args){

        Cliente cliente = new Cliente(
                "Erlon",
                "000.000.000-00",
                new Endereco(10,"Rua dos bobos","Centro","58900-000","Paraíba"),
                "(00) 00000-0000",
                new Data(26,8,2005)
        );

        Produto produto = new Produto(
                "Luz azul",
                "Fica azul",
                "RB2",
                2.50,
                50
        );

        cliente.nascimento.calcularIdade();

        Vendedor lucas = new Vendedor("Lucas","10H1");

        Venda venda = new Venda(cliente, produto, 10,lucas);

        System.out.println(venda);

        venda.calcularValor(10,12);

        System.out.println(venda.valorTotalVenda);



    }

}

